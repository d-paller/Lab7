import java.util.*;
import java.io.*;


public class TestBinarySearchTree {

  public static void main(String[] args) {

      Integer[] num = {67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};
      // Create an empty BinaryTree
      BinarySearchTree<Integer> tree = new BinarySearchTree<>(num);
     
      Scanner input = new Scanner(System.in);
      System.out.println("\nEnter an element to search");
      Integer key = input.nextInt();
      
      System.out.println("The tree conatains " + key + " " + tree.search(key));

      System.out.println("\nEnter an element to delete");
      key = input.nextInt();
      
      System.out.println("Deleted: " + tree.delete(key));
      tree.inorder();
      System.out.println("");
      
      System.out.println("Inserted: " + key);
      tree.insert(key);
      //tree.inorder();
      
      System.out.print("Preorder-"); tree.preorder();
      System.out.println("");
      
      System.out.print("Postorder-"); tree.postorder();
      System.out.println("");
      
      System.out.print("The path to 59 is ");
      ArrayList<Integer> list = tree.path(59);
      for (int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i)+ " ");
          
      }
      System.out.println("");
      
      System.out.print("The left subtree of 59 is: ");
      ArrayList<Integer> LSubTree= tree.leftSubTree(59);
      for (int i = 0; i < LSubTree.size(); i++) {
          System.out.println(LSubTree.get(i) + " ");
          
      }
      System.out.println("");
      
      System.out.print("The right subtree of 46 is: ");
      ArrayList<Integer> RsubTree = tree.rightSubTree(43);
      for (int i = 0; i < RsubTree.size(); i++) {
          System.out.println(RsubTree.get(i) + " ");
          
      }
      System.out.println("");
      
      System.out.print("There are " + tree.getNumberOfLeaves() + " leaves");
      System.out.println("");
      
      //System.out.println("The indorer predessecor of 59 is: " + tree.inorderPredecessor(59));
     
  }//main
}//class
