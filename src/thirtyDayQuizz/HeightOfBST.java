package thirtyDayQuizz;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 * 
 * @author shree665
 *
 */
public class HeightOfBST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        HeightNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        
        int height=getHeight(root);
        System.out.println(height);

	}
	
	public static HeightNode insert(HeightNode root,int data){
        if(root==null){
            return new HeightNode(data);
        }
        else{
        	HeightNode cur;
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
	
	public static int getHeight(HeightNode root){
        
        int leftHeight = 0;
        int rightHeight = 0;
        
        if(root == null) {
            return -1;
        }
        
        if(root.left != null) {
            leftHeight = getHeight(root.left) + 1;
        }
        
        if(root.right != null) {
            rightHeight = getHeight(root.right) + 1;
        }
        
        return (leftHeight > rightHeight ? leftHeight : rightHeight);
        
    }

}

class HeightNode{
	HeightNode left,right;
    int data;
    HeightNode(int data){
        this.data=data;
        left=right=null;
    }
}
