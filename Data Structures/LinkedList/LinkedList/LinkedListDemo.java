package LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		list.insertAtHead(10);
		list.insertAtHead(9);
		list.insertAtHead(8);
		list.insertAtHead(7);
		list.insertAtHead(6);
		list.insertAtHead(5);
		list.insertAtHead(4);
		list.insertAtHead(3);
		list.insertAtHead(2);
		list.insertAtHead(1);
        
		//list.insertInSorted(0);
		list.deleteFromHead();
		
		System.out.println("Linked List"+list+" Length: "+list.getLength());
		System.out.println("Linked List"+list.reverse());
		
		System.out.println("Search 3: " + list.search(3));

		DoublyEndedList dlist = new DoublyEndedList();
		
		dlist.insertAtTail(1);
		dlist.insertAtTail(2);
		dlist.insertAtTail(3);
		dlist.insertAtTail(4);
		dlist.insertAtTail(5);
		dlist.insertAtHead(2);
		
		System.out.println("Double Ended List: "+dlist);
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insetAtHead(1);
		dll.insetAtHead(2);
		dll.insetAtHead(3);
		dll.insetAtHead(4);
		
		System.out.println("Doubly Linked List: "+dll);
	
		}

}
