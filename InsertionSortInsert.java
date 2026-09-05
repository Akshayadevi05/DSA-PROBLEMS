
class InsertionSortInsert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 4};
        
            int key=arr[4];
            int j=3;
            while(j >= 0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        
        for(int nums : arr){
            System.out.println(nums);
        }
    }
}