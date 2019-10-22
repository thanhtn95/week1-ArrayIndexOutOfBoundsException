import java.util.Random;
import java.util.Scanner;

public class testException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] numbers = getArray(size);
        System.out.println("Array : ");
        for (int i : numbers) System.out.print(i + ", ");
        System.out.println();
        System.out.println("Enter an index: ");
        int index = sc.nextInt();
        try {
            System.out.println("Value of index " + index + " is " + numbers[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index is Out of Bound!!!");
        }
    }

    private static int[] getArray(int size) {
        int[] arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}
