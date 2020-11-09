import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

    public class No1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[]{15,25,10,30,40,20,50};
            fsort(arr);
            System.out.println();
            arr = Arrays.copyOf(arr,arr.length+1);
            System.out.println("请输入要插入的数：");

            arr[5] = input.nextInt();
            fsort(arr);
        }

        private static void fsort(int[] arr) {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

