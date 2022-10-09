package homework_1;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] num = {5, 0, 1, 2, 3, 4};
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

}
