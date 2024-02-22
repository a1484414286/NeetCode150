import java.util.Arrays;

public class leetcode128_longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        int longest_streak = 0;
        int current_streak = 1;
        int[] temp_arr = nums;
        if(nums.length < 2)
        {
            return nums.length;
        }
        Arrays.sort(temp_arr);
    
        for(int i = 0 ; i < temp_arr.length ; i++)
        {
            if(i+1 != temp_arr.length)
            {
                if(temp_arr[i+1] == temp_arr[i] + 1)
                {
                    current_streak += 1;
                }

                else if( temp_arr[i+1] > temp_arr[i] + 1)
                {
                    longest_streak = Math.max(longest_streak, current_streak);
                    current_streak = 1;
                }
            }
        }
        return longest_streak > current_streak ? longest_streak : current_streak;
    }
}
