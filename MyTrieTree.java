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

    public void insert(char x){
        root = insert(root, x);
    }

    /*    private TrieNode insert(TrieNode t, char x){

    //Trie is empty
    if (t == null)
    return new TrieNode(x, null, null, null);
    if (x< t.key)
    t.left = insert (t.left, x);
    else if (x> t.key)
    t.right = insert(t.right, x);
    else;

    return t;
    }
    */
    private TrieNode insert(TrieNode t, char x){
        //if Tie is empty

        if(t== null){
            ind = 0;
            return new TrieNode(x, null, null, null);
        }

        //In case of first word, everything is an equal child
        if(ind ==0){
            t.equal = insert(t.equal, x);
        }

        //More words into tree, creating branches of right, left, and equal children

        //Equal
        if(x == t.key){



        }


        return t;
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
        //int count = 1;
        while(q.isEmpty() ==false)
        {
            TrieNode our_node = q.deque();
            System.out.printf("%c ", our_node.key);
            if( our_node.left != null){
                q.enque(our_node.left);
                //count ++;
            }
            if (our_node.equal !=null){
                q.enque(our_node.equal);
                //count ++;
            }
            if(our_node.right!= null){
                q.enque(our_node.right);
                //count++;
            }

        }

    }
    //System.out.printf("%d", count);

}
~                                                                                                    
~               
