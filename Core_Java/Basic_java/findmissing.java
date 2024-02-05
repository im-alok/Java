public class findmissing {
    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12 };
        int i = 0;
        int ans = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] > 0 && correct != i) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j)
                ans = j + 1;
                break;
        }
        System.out.println(ans);
    }

}
