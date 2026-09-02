class BubbleSortingAscDsc {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 4, 7, 3, 9, 6, 2};

        // First 5 numbers - Ascending
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Next 5 numbers - Descending
        for (int i = 5; i < 9; i++) {
            for (int j = 5; j < 9 - (i - 5); j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}