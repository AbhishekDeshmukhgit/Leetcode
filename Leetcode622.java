class MyCircularQueue {
        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;
    public MyCircularQueue(int k) {
        arr=new int[k];
        front=-1;
        rear=-1;
        size=0;
        capacity=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        rear++;
        if(rear>=capacity)
        {
            rear=rear%capacity;
        }
        if(size==0)
        {
            front++;
        }
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
        {
            return false;
        }
        size--;
        if(size==0)
        {
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%capacity;
        }
        return true;
    }
    
    public int Front() {
        if(front==-1)
        {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(rear==-1)
        {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==capacity)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */