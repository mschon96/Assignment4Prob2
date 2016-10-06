public class TrieNode{
    public int key;
    public int level;
    public TrieNode left;
    public TrieNode right;
    public TrieNode equal;
    public int height;

    TrieNode(char x){
        level++;
        key = x;
        left = right= equal =  null;
    }

    TrieNode(char x, TrieNode l, TrieNode e, TrieNode r){
        key= x; left = l; equal = e;  right = r;
    }

}
~  
