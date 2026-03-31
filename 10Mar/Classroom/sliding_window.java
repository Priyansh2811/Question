
import java.util.HashMap;
public class sliding_window {   
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
    }
}