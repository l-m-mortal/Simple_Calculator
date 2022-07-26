import java.util.Arrays;

public class Calculator {
        public static int[] map(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i]*2;
            }
            return arr;
        }


    public static void main(String[] args) {
    int[] array = new int[] {2,2,2};
    map(array);
        System.out.println(Arrays.toString(array));
    }
}





