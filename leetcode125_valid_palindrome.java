public class leetcode125_valid_palindrome {
    public boolean isPalindrome(String s) {
        String strippedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(strippedString.isEmpty() || strippedString.length() == 1)
        {
            return true;
        }
        int left = 0;
        int right = strippedString.length() - 1;

        while(left != right)
        {
            if(left + 1 == right && strippedString.charAt(left) == strippedString.charAt(right))
            {
                return true;
            }

            if(strippedString.charAt(left) != strippedString.charAt(right))
            {
                return false;
            }
            
            else
            {
                left ++;
                right --;
            }
        }

        return true;
    }
}
