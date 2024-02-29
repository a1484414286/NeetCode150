import java.util.Stack;

public class leetcode739_daily_temperatures {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temp.length];
        for(int i = temp.length - 1 ; i > -1 ;  i--)
        {
            while(!stack.isEmpty() && temp[i] >= temp[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                result[i] = 0;
            }
            else
            {
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}
