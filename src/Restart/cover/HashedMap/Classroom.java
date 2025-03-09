package Restart.cover.HashedMap;

import java.util.ArrayList;

public class Classroom {
    static class myHashMap   {
        ArrayList<Integer> hashedList;

        public myHashMap() {
            hashedList = new ArrayList<>();
        }
        public void put(int key, int value) {
            hashedList.add(key, value);
            System.out.println(hashedList.size());
        }

        public int get(int key) {
              try {
                  return  hashedList.get(key);
              }catch (Exception e) {
                  System.out.println(e);
                  return -1;
              }
        }

        public void remove(int key) {
            try {
                  hashedList.remove(key);
            }catch (Exception e) {
                System.out.println(e);

            }
        }
    }
    public static void main(String[] args) {
      myHashMap hs = new myHashMap();
      hs.put(0,1);
      hs.put(3,1);
      hs.put(2,1);

        System.out.println();
    }
}
