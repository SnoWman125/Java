package homework_1;

public class RemoveElement {
    public static void main(String[] args) {
        int val = 3;
        int[] arr = {3, 2, 2, 3};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
