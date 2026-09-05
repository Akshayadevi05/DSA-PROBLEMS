

class SelectionSecLar {
    public static void main(String[] args) {
        int[] arr={5,3,8,1,2};
        for(int i =0; i<arr.length-3; i++ ){
            int secondIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[secondIndex]){
                    secondIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[secondIndex];
            arr[secondIndex]=temp;
        }
         System.out.println(arr[1]);
        
    }
}