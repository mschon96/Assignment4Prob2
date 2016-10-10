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
Description: AVL Tree
*/

import java.util.Scanner;
public class prob2{

    static char insertArr[];
    static char searchArr[];

    public static void main(String[] args){

        MyTrieTree tree = new MyTrieTree();
        //size of arrays

        //      Practice of toCharArray();
        //        String str = "cat";
        //      char[] cArray = str.toCharArray();

        //        for(int i = 0; i < cArray.length; i++)
        //        System.out.printf("%c\n", cArray[1]);

        // Scanner variables
        Scanner input = new Scanner(System.in);
        Scanner insertStr= new Scanner(System.in);
        Scanner searchStr = new Scanner (System.in);
        int choice = 1;

        while(choice != 4){
            System.out.println("1. Insert");
            System.out.println("2. Print (level order)");
            System.out.println("3. Search");
            System.out.println("4. Exit");

            System.out.print("Enter your choice[1-4]: ");

            choice = input.nextInt();

            switch(choice){
                    case 1:
                    System.out.print("Enter string to insert: ");
                    String insName = insertStr.nextLine();

                    insName = insName.toLowerCase();
                    System.out.println("");
                    // System.out.printf("String '%s' inserted\n", name);


                    //  Breaking up letters into each index of array
                    insertArr = insName.toCharArray();

                    //  Double checking that it worked
                    //for (int i = 0; i < insertArr.length; i++)
                    //   System.out.printf("%c ", insertArr[i]);

                    System.out.println("");

                    //Entire array

                    tree.insert(insName.toLowerCase());
                    System.out.printf("%s was inserted!\n", insName);


                    break;

                case 2:
                    //System.out.println("LEVEL ORDER HERE");


                    tree.levelOrder();

                    break;

                case 3:
                    System.out.print("Enter string to search: ");
                    String sName = searchStr.nextLine();

                    sName = sName.toLowerCase();
                    System.out.println("");

                    searchArr = sName.toCharArray();

                    //for(int i = 0; i < searchArr.length ; i++)
                    //    System.out.printf("%c ", searchArr[i]);

                    System.out.println("");


                    if(tree.search(sName.toLowerCase()) == true)
                        System.out.printf("%s was found!\n", sName);
                    else
                        System.out.printf("%s was not found!\n", sName);

                    break;

                case 4:
                    System.out.println("Bye");
                    break;


            }
        }

    }
}
