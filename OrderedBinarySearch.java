public class OrderedBinarySearch {
    public static void main(String[] args) {
        //int arr[]={10,20,30,40,50};
        int arr[]={50,40,30,20,10};
        System.out.println(search(arr, 20,false));
    }
    public static int search(int arr[],int target,boolean asec)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(asec)
            {
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target){
                        end=mid+1;
                }
                else{
                    start=mid-1;
                }
            }
            else{
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target){
                        start=mid+1;
                }
                else{
                    end=mid+1;
                }
            }
        }
        return -1;
    }
}
