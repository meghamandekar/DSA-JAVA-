class Solution {
    public List<List<Integer>> generate(int num) {

       //List<Integer>arr=new ArrayList<>();
       List< List<Integer>>arr1=new ArrayList<>();
       int s=1;
        for(int i=1;i<=num;i++){
            s=1;
            List<Integer>arr=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1)
                 arr.add(1);
                  else
                  {
                    s=(s*(i-j))/j;
                    arr.add(s);
                  }
                  
            }
            arr1.add(arr);
        }
        return arr1;
        
    }
}