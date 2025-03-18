import java.util.HashSet;

public class G13Prob1 {
    // Given a string s, find the length of the longest 
    // substring without repeating characters:

    // Example:
    // s = "abcabcbb";

    // Approach: Sliding window and HashSet:
    // - Use two pointers (left and right) to define the window.
    // - Use HashSet to track characters in the current window.
    // - Expand right until we find a duplicate character.
    // - When a duplicate is found, shrink left until the substring becomes valid.

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " 
                           + lengthOfLongestSubstring(s));
    }
}

