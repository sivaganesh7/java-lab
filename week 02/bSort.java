import java.util.Scanner;
public class bubble {
    void bub(int[] a) {
        int n = a.length;  
        int temp;
        System.out.println("::: Before Sorting :::");
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("::: After Sorting :::");
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubble o = new bubble();  
        int arr[] = new int[5];  
        Scanner s = new Scanner(System.in);

        
        System.out.println("Enter 5 numbers into the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();  
        }

        o.bub(arr);

        s.close();  
    }
}
