import java.util.Arrays;

public class Leetcode66 {
  
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        Leetcode66 solution = new Leetcode66();

        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3}))); // [1, 2, 4]
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9}))); // [1, 0, 0, 0]
        System.out.println(Arrays.toString(solution.plusOne(new int[]{4, 9, 9}))); // [5, 0, 0]
    }
}
