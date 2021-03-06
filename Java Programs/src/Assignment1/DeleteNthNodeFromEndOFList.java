package Assignment1;

public class DeleteNthNodeFromEndOFList {
	 Node head; 
	 
	    /* Linked list Node*/
	    class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	        
	        Node()
	        {
	        	
	        }
	    }
	 
 
	    public Node removeNthFromEnd( int n) {
	    	Node start = new Node();
	        start.next = head;
	        Node fast = start;
	        Node slow = start;     

	        for(int i = 1; i <= n; ++i)
	            fast = fast.next;
	    
	        while(fast.next != null)
	        {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        
	        slow.next = slow.next.next;
	        
	        return start.next;
	    }
	    
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null) {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	    }
	 
	   
	    public static void main(String[] args)
	    {
	    	DeleteNthNodeFromEndOFList llist = new DeleteNthNodeFromEndOFList();
	 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	 
	        System.out.println("\nCreated Linked list is:");
	        llist.printList();
			// delete node at position 1
	        llist.removeNthFromEnd(2); 
	        
	        System.out.println(
	                "\nLinked List after Deletion is:");
	            llist.printList();
	    }
}
