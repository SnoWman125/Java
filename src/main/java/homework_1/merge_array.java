package homework_1;

public class merge_array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }
        for (int j = 0; j < n; j++) {
            nums1[m] = nums2[j];
            m++;
        }
        int temp;
        boolean IsSorted = false;
        while (!IsSorted) {
            IsSorted = true;
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                    IsSorted = false;
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

}
