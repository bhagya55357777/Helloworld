package place;
//write a program to move the numbers to the right by a certain amount .the user will tell you how many times to rotate take the input from the user give the  program in java
import java.util.Arrays;
import java.util.Scanner;

public class arrayrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        System.out.println("Enter the number of rotations:");
        int rotations = scanner.nextInt() % n;

        reverse(array, 0, n - 1);
        reverse(array, 0, rotations - 1);
        reverse(array, rotations, n - 1);

        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    private static void reverse(int[] array, int start, int end) {
        for (; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }
}
