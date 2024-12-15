//class Node{
//	int data;
//	Node next;
//	public Node(int data) {
//		this.data=data;
//		this.next=null;
//		}
//	}
//class linkedlist {
//	Node head;
//	//add element to the end
//	public void addlast(int data) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			return;
//		}
//		Node temp = head;
//		while (temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = newNode;
//	}
//	//add element to the begin
//	public void addfirst(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
//	//add element at any position
//	public void addatposition(int data,int position) {
//		if(position == 0) {
//			addfirst(data);
//			return;
//		}
//		Node newNode = new Node(data);
//		Node temp = head;
//		for(int i=0;i<position - 1 && temp != null ; i++) {
//			temp = temp.next;
//		}
//		if(temp == null) {
//			System.out.println("Position is out of bounds .");
//			return;
//		}
//		newNode.next = temp.next;
//		temp.next = newNode;
//	}
//	public void display() {
//		if(head == null) {
//			System.out.println("List is empty .");
//			return;
//		}
//		Node temp = head;
//		while(temp!= null) {
//			System.out.println(temp.data + "--->");
//			temp = temp.next;
//		}
//		System.out.println("null");
//	}
//}
//public class linkedlistprogram{
//	public static void main(String[]args) {
//		linkedlist list = new linkedlist();
//		list.addfirst(10);
//		list.addlast(20);
//		list.addatposition(12,3);
//		System.out.println("linked list");
//		list.display();
//	}
//}
class LinkedList {
    Node head; // Head of the list

    // Node class representing each element in the list
     class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to insert a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to search for a value in the list
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.append(10);
        list.append(20);
        list.append(30);
        
        System.out.println("Original List:");
        list.printList();

        list.prepend(5);
        System.out.println("After Prepend:");
        list.printList();

        list.deleteByValue(20);
        System.out.println("After Deletion:");
        list.printList();

        System.out.println("Search for 30: " + list.search(30));
        System.out.println("Search for 40: " + list.search(40));

        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
}

