import java.util.ArrayList;
import java.util.List;
class G13Subset {
    public static void gS(int[] nums, int i, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        for (int j = i; j < nums.length; j++) {
            curr.add(nums[j]);
            gS(nums, j + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        gS(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}