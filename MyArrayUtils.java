import java.util.Arrays;

public class MyArrayUtils {
    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        System.out.println("arr1 es arr2 azonos: " + equals(array1, array2));
        System.out.println("arr2 es arr3 azonos: " + equals(array2, array3));
    }
}
