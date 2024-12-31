package NewYear2025.Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupOfAnagram {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String, ArrayList<String>> group = new HashMap<>();

        for (String s : arr) {
            String groupKey = sort(s);
            group.put(groupKey, new ArrayList<>());
        }

        for (String s: arr) {
            String groupKey = sort(s);
            // put strings in their particular group.
            if (group.containsKey(groupKey)) {
                group.get(groupKey).add(s);
            }
        }

        ArrayList<ArrayList<String>> res = new ArrayList<>();

        for(String key: group.keySet()) {
            res.add(group.get(key));
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        return res;
    }

   private String sort (String s) {
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
   }
    public static void main(String[] args) {
      String [] arr = {"act", "god", "cat", "dog", "tac"};
      GroupOfAnagram g = new GroupOfAnagram();
      g.anagrams(arr);
    }
}
