public class LC_268 {
    public static void missingNumber(int[] nums) {
        int n = nums.length;
        int Sum = n * (n + 1) / 2;
        int aSum = 0;

        for (int num : nums) {
            aSum += num;
        }

        System.out.println(Sum - aSum);
    }
}
