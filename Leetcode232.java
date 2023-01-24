class MyQueue {
    ArrayDeque<Integer> q=new ArrayDeque<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        q.offerLast(x);
    }
    
    public int pop() {
        return q.pollFirst();
    }
    
    public int peek() {
        return q.peekFirst();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */