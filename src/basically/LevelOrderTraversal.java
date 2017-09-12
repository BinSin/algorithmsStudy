package basically;

import java.io.*;
import java.util.*;

class LevelOrderTraversal{
	
	static Queue<Node> queue = new LinkedList<Node>();

	static void levelOrder(Node root){
		if(root != null) {
			queue.add(root);
		}
		
		while(!queue.isEmpty()) {
		
			// Node r = queue.poll();
			Node r = queue.remove();
			
			System.out.print(r.data + " ");
			
			if(r.left != null) {
				queue.add(r.left);
				// queue.poll(r.left);
			}
			if(r.right != null) {
				queue.add(r.right);
			}
		}
	}
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
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
	
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}