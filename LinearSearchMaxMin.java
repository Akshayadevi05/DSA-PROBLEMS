class LinearSearchMaxMin {
    public static void main(String[] args) {
      int[] arr={10,20,20,50,20};
      int max=arr[0];
      int min=arr[0];

      for(int i=0; i<arr.length; i++){
        if(max < arr[i]){
          max = arr[i];
           }
        if(min > arr[i]){
          min = arr[i];
        }
      }
      System.out.println(max);
      System.out.println(min);

        
          
}}