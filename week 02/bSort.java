public class bubblesort {
    public static void main(String[] args) {
        // bubble sort
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("before sorted : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nafter sorted : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
