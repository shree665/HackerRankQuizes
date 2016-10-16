package thirtyDayQuizz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-trees
 * 
 * @author shree665
 *
 */
public class LevelOrderBST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BSTNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        levelOrder(root);

	}
	
	public static BSTNode insert(BSTNode root,int data){
        if(root==null){
            return new BSTNode(data);
        }
        else{
        	BSTNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	static void levelOrder(BSTNode root){
      //Write your code here
      Queue<BSTNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()) {
          /*Dequeue a node */
    	  BSTNode tempNode = queue.remove();
          System.out.print(tempNode.data + " ");
          
          /*Enqueue left child */
          if (tempNode.left != null) {
              queue.add(tempNode.left);
          }

          /*Enqueue right child */
          if (tempNode.right != null) {
              queue.add(tempNode.right);
          }
      }
    }

}

class BSTNode {
	BSTNode left,right;
    int data;
    BSTNode(int data){
        this.data=data;
        left=right=null;
    }
}
