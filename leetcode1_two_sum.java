import java.util.HashMap;

public class leetcode1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int tempNum = 0;
        int index = 0;
        for(int i : nums)
        {
            map.put(i, index);
            index ++;
        }

        index = 0;
        for(int i : nums)
        {
            System.out.println(i);
            tempNum = target - i;
            if(map.containsKey(tempNum) && map.get(tempNum) != index)
            {
                return new int[]{index,map.get(tempNum)};
            }
            index++;
        }
        return null;
    }
}
