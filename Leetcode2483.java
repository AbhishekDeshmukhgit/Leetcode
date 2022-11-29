class Solution {
    public int bestClosingTime(String customers) {
        
        int ans=0;
        
        int n=customers.length();
        
        int max=Integer.MIN_VALUE;
        
        int arr[]=new int[n];
        
    for(int i=0;i<customers.length();i++){
        
        if(customers.charAt(i)=='Y'){
            ans++;
          
        }
        else{
            ans--;
        }
        
        arr[i]=ans;
        
    }
        
        int index=n;
        
        
        for(int i=n-1;i>=0;i--){
            
            if(arr[i]>=max){
                max=arr[i];
                
                index=i+1;
                
            }
        }
        
        
        if(arr[index-1]<=0) return 0;
        
        return index;
    
        
    }
}