import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        assignIntAarray();
        assignArray2();
        assignArray3();
        assignArray4();
        assignArray5();
        int arr[]={0,1,1,0};
        System.out.println(checkBalance6(arr));
        int arr2[]={0,1,1,1};
        System.out.println(checkBalance6(arr2));
    }

    public static void assignIntAarray() {
        int[] arr = {1, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0 ? 1 : 0);
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void assignArray2() {
        int[] arr = new int[8];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void assignArray3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            ;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void assignArray4() {
        int[][] arr = new int[5][5];

        for (int i = 0, k = arr[0].length - 1; i < arr.length; i++, k--) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                arr[i][k] = 1;
            }

            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static void assignArray5() {
        int[] arr = {3, 8, 2, 4, 3, 22, 17, 6};

        int max = arr[0], min = arr[0];

        for (int item : arr) {
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            }

        }
        System.out.println("Min=" + min + "; Max=" + max);
    }

    public static boolean checkBalance6(int[] array) {
        boolean result = false;
        int leftSum = 0, rightSum = 0;
        for (int shift = 1; shift < array.length-1; shift++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j <= shift; j++) {
                leftSum += array[j];
            }
            for (int j = shift + 1; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                result = true;
                break;
            }

        }

        return result;
    }

}
