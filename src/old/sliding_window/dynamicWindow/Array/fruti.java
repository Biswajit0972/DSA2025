package old.sliding_window.dynamicWindow.Array;

import java.util.HashMap;

public class fruti {
    public static int myCode (int [] fruit) {
      HashMap<Integer, Integer> bucket = new HashMap<>();
      int left = 0;
      int count = 0;

      for (int i = 0; i < fruit.length; i++) {
          bucket.put(fruit[i], bucket.getOrDefault(fruit[i], 0)  + 1);

          while (bucket.size() > 2) {
              bucket.put(fruit[left], bucket.get(fruit[left]) - 1);
              if (bucket.get(fruit[left]) == 0) {
                  bucket.remove(bucket.get(fruit[left]));
              }
              left++;
          }

          count = Math.max(count, (i - left + 1));
      }

      return count;
    }
    public static void main(String[] args) {
            int []  fruit = {2, 1, 2};
        System.out.println(myCode(fruit));
    }
}
