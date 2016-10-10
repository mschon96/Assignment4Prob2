/*Name : Mariah Schon
Class : 3320-001
Program # : Assignment 4
Due Date : Oct 6
Honor Pledge: On my honor as a student of the University
of Nebraska at Omaha, I have neither given nor received
unauthorized help on this homework assignment.
NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
PARTNERS: CSLC
Description: Trie Tree
*/

public class MyTrieTree{
    int ind;
    int count = 0;
    private TrieNode root;

    public MyTrieTree(){
        root = null;
    }

    public boolean find(char x ){
        return find (root,x);
    }
    private boolean find(TrieNode t,char x){
        if (t == null)
            return false;
        if (x< t.key)
            return find(t.left, x);
        else if (x> t.key)
            return find(t.right, x);
        else
            return true;
    }

    public void insert(String x){
        root = insert(root, x, 0);
        count++;
 //       System.out.printf("Middle char is %c\n", root.equal.key);
    }
    private TrieNode insert(TrieNode t, String x, int ind){
        if ( t == null)
            t = new TrieNode(x.charAt(ind) ,null,  null, null);
        if (x.charAt(ind) < t.key)
            t.left = insert (t.left, x, ind);
        else if (x.charAt(ind) > t.key)
            t.right = insert(t.right, x, ind);
        else{
            if(ind + 1 < x.length())
                t.equal = insert(t.equal, x, ind + 1);
            else
                t.isEnd = true;
        }
        return t;
    }

 /*

           Function Name : search()
Parameters :    string x
Return value(s) : boolean
Partners : CSLC
Description : This function searches through the tree*/
    public boolean search(String x){
        return search(root, x, 0);
    }

    private boolean search(TrieNode t, String x, int ind){
        if (t == null)
            return false;
        if (x.charAt(ind) <  t.key)
            return search(t.left, x, ind);
        else if(x.charAt(ind) > t.key)
            return search(t.right, x, ind);
        else{
            if(t.isEnd && ind == x.length() -1)
                return  true;
            else if(ind == x.length() -1)
                return false;
            else
                return search(t.equal, x, ind+1);
        }
    }

     /*

       Function Name : levelOrder()
Parameters :    root
Return value(s) : NA
Partners : CSLC
Description : This function prints out the level order traversal of this binary search tree; starting at root, then depth 1, and then 2, and so on.
*/



    public void levelOrder(){
        // q= tree.insert(root);
        MyQueue q = new MyQueue();
        q.enque(root);

        int levelNode = 0;
        while(q.isEmpty() ==false)
        {
            levelNode = q.getSize();

            //            System.out.printf("%d", q.getSize());
            while( levelNode >0){

                TrieNode our_node = q.deque();

                System.out.printf("%c ", our_node.key);


                if( our_node.left != null)
                    q.enque(our_node.left);
                if(our_node.equal != null)
                    q.enque(our_node.equal);
                if(our_node.right!= null)
                    q.enque(our_node.right);

                levelNode--;
            }

            System.out.println("");


        }
    }


    public void printTree(){
        printTree(root);
    }
    private TrieNode printTree(TrieNode t){
        if (t!= null){
            printTree (t.left);
            System.out.printf("%c ",t.key);
            printTree(t.right);
            printTree(t.equal);
        }
        return t;
    }
    //System.out.printf("%d", count);

}
