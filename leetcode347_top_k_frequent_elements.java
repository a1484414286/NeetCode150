import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class leetcode347_top_k_frequent_elements {
     public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();   
        HashMap<Integer, ArrayList<Integer>> bucket = new HashMap<>();
        int[] arr = new int[k];

        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> i : map.entrySet())
        {
            ArrayList<Integer> tempList;
            tempList = bucket.get(map.get(i.getKey()));
            if(tempList != null)
            {
                tempList.add(i.getKey());
                bucket.put(map.get(i.getKey()), tempList);
            }
            else
            {
                tempList = new ArrayList<>();
                tempList.add(i.getKey());
                bucket.put(map.get(i.getKey()), tempList);
            }
        }


        for(int i = map.size()+1; i != 0 && k != 0; i--)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            temp = bucket.get(i);
            if(temp != null)
            {
                for(int result : temp)
                {
                    arr[k-1] = result;
                    k--;
                }
            }
        } 

        return arr;
    }
}
