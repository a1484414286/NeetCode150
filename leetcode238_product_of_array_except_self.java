public class leetcode238_product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1] = 1;
        for(int i = 1; i < prefix.length; i++)
        {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int j = suffix.length - 2; j >= 0; j--)
        {
            suffix[j] = suffix[j+1] * nums[j+1];
        }
        for(int k = 0; k < prefix.length; k++)
        {
            result[k] = suffix[k]*prefix[k];
        }
        return result;
    }
}
