import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode49_group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String i : strs)
        {
            char[] tempStr = i.toCharArray();
            Arrays.sort(tempStr);
            if(!map.containsKey(new String(tempStr)))
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(i);
                map.put(new String(tempStr), arr);
            }
            else
            {
                map.get(new String(tempStr)).add(i);
            }
        }
        return new ArrayList<>(map.values());
    }
}
