import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_three_sum {
   class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for(int i = 0 ; i < nums.length - 2; i ++)
        {   
            
            if(i > 0 && nums[i] == nums[i - 1]) // checks for duplicates after 1
            {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right)
            {  

                if(0 > nums[i] + nums[left] + nums[right])   //when result is negative
                {
                    left++;
                }
                else if(0 < nums[i] + nums[left] + nums[right]) //when result is positive
                {
                    right--;
                }
                else
                {
                    //when result is 0
                    tempList = new ArrayList<>();
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    tempList.add(nums[i]);
                    result.add(tempList);
                    while(left < right && nums[left] == tempList.get(0)) //it will always move once since it stores previous number and move to next unique number
                    {
                        left++;
                    }
                    while(left < right && nums[right] == tempList.get(1)) //does the same, but when both get unique numbers, it will return back to the first while loop, where it add and subtracts the numbers.
                    {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}

    // Rest of the class code goes here...
}
