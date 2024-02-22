public class leetcode167_two_sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while(left < right)
        {            
            System.out.println(left + " " + right);
            if(numbers[right] + numbers[left] == target)
            {
                result = new int[]{left+1,right+1};
                break;
            }
            else if(numbers[right] + numbers[left] > target)
            {
                right --;
            }
            else if(numbers[left] + numbers[right] < target )
            {
                left ++;
            }
        }
        return result;
    }
}
