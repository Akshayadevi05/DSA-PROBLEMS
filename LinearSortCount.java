
class LinearSortCount {
    public static void main(String[] args) {
      int[] arr={10,20,20,50,20};
      int target=20;
      int found=0;

      for(int i=0; i<arr.length; i++){
        if(arr[i] == target){
          found++;
           }
      }
      System.out.println(found);

        
          
}}