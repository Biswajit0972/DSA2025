package Restart.Trie;

public class Classroom {
    class TrieNode {
        TrieNode [] children = new TrieNode[26];
        boolean endOfWord = false;

        public  TrieNode () {
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
        }
        void insert(String str, TrieNode  root) {
            TrieNode temp =  root;

            for (int  i = 0; i < str.length(); i++) {
                int index = str.charAt(i) - 'a';
                if (temp.children[index] == null) {
                    temp.children[index] = new TrieNode();
                }else {
                    temp = temp.children[index];
                }
            }

            temp.endOfWord = false;
        }
    }

    public static void main(String[] args) {
      
    }
}
