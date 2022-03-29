package Assignment1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(){}
    Node(int data){
    	this.data=data;
    }
    public Node(int data, Node left, Node right)
    {
        this.data = data;
        this.left=left;
        this.right= right;
    }
}
public class BFSTraversal { 
	    // Root of the Binary Tree
	    static Node root;
	 
 
    
private List<List<Integer>> levelOrder(Node root2) {
	Queue<Node> queue=new LinkedList<Node>();
	List<List<Integer>> list=new LinkedList<List<Integer>>();
	if(root2==null) return list;
	queue.offer(root2);
	while(!queue.isEmpty())
	{
		int levelNum=queue.size();
		List<Integer> subList=new LinkedList<>();
		for(int i=0;i<levelNum;i++)
		{
			if(queue.peek().left!=null) queue.offer(queue.peek().left);
			if(queue.peek().right!=null) queue.offer(queue.peek().right);
			subList.add(queue.poll().data);
		}
		
		list.add(subList);
	}
	return list;
}

/* Driver program to test above functions */
public static void main(String args[])
{
	BFSTraversal tree = new BFSTraversal();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

   System.out.println("Level order traversal of binary tree is ");
   try {
	   List<List<Integer>> l=tree.levelOrder(root);
	   for (int i = 0; i < l.size(); i++) {
		   System.out.println(l.get(i));	
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
