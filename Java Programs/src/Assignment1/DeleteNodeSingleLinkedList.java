package Assignment1;

public class DeleteNodeSingleLinkedList {
	
	Node head; //head of list

	//linked list node 
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	//inserts a new node into list
	public void push(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	 void deleteNode(int key)
	    {
	        // Store head node
	        Node temp = head, prev = null;
	 
	        // If head node itself holds the key to be deleted
	        if (temp != null && temp.data == key) {
	            head = temp.next; // Changed head
	            return;
	        }
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }
	 
	        // If key was not present in linked list
	        if (temp == null)
	            return;
	 
	        // Unlink the node from linked list
	        prev.next = temp.next;
	    }
	 

		
		public void printList()
		{
			Node tnode=head;
			while(tnode!=null)
			{
				System.out.print(tnode.data + " ");
				tnode=tnode.next;
			}
		}
	
	public static void main(String[] args) {
		DeleteNodeSingleLinkedList llist=new DeleteNodeSingleLinkedList();
		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
		
		System.out.println("Created Linked list is: ");
		llist.printList();
		llist.deleteNode(20);
		System.out.println("\nLinked list after deleting the node at position 4:");
		llist.printList();

	}

}
