public class BinaryMoreIndex {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int left = 0;
        int right = arr.length - 1;

        int first = -1;
        int last = -1;

        // Find First Position
        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // Reset left and right
        left = 0;
        right = arr.length - 1;

        // Find Last Position
        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("First Position: " + first);
        System.out.println("Last Position: " + last);
    }
}