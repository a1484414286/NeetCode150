import java.util.HashMap;

public class leetcode217_contains_duplicate {
        public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while(i != nums.length)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
