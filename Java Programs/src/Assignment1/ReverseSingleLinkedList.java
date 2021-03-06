package Assignment1;

public class ReverseSingleLinkedList {
	
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver Code
	 public static void main(String[] args)
	    {
		 ReverseSingleLinkedList list = new ReverseSingleLinkedList();
	        ReverseSingleLinkedList.head = new Node(85);
	        ReverseSingleLinkedList.head.next = new Node(15);
	        ReverseSingleLinkedList.head.next.next = new Node(4);
	        ReverseSingleLinkedList.head.next.next.next = new Node(20);
	 
	        System.out.println("Given Linked list");
	        list.printList(head);
	        head = list.reverse(head);
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        list.printList(head);
	    }
	
}
