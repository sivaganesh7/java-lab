import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int[] arr= { 1, 2, 3, 4, 5, 10 };
        
        Scanner s=new Scanner(System.in);

        int l = 0;
        int ss = s.nextInt();
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + (h-l)/2);
            if (arr[mid] == ss) {
                System.out.println(s + " is found at index " + mid);
                break;

            } else if (arr[mid] < ss) {
                l = mid + 1;

            } else {
                h = mid - 1;
            }
        }
        s.close();
    }

}
