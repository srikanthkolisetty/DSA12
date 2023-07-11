package Ass12;

public class DSA2 {
  
	
	class Node {
		char data;
		Node previous;
		Node next;

		public Node(char data) {
			this.data = data;
		}
	}

	// Represent the head and tail of the doubly linked list
	Node head, tail = null;
	int count = 0;

	// addNode() will add a node to the list
	public void addNode(char data) {
		// Create a new node
		System.out.println(data);
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
			// head's previous will point to null
			head.previous = null;
			// tail's next will point to null, as it is the last node of the list
			tail.next = null;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.previous = tail;
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.next = null;
		}
		count++;
	}

	// display() will print out the nodes of the list
	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}

	}
		public boolean palindorme()
		{
			String s="";
			Node current = head;
			while (current != null) {
				s+=current.data;
				current = current.next;
			}
			char []t=s.toCharArray();
			for(int i=0,j=t.length-1;i<t.length;i++,j--)
			{
				if(t[i]!=t[j])
				{
					return false;
				}
			}
			return true;
		}
	public void loop(int x)
	{
				Node current = head;
				int num=0;
				if (head == null) {
					System.out.println("List is empty");
					return;
				}
				System.out.println("Nodes of doubly linked list: ");
				while (current != null) {
					
					System.out.print(current.data + " ");
					current = current.next;
				}
	}

	public static void main(String[] args) {

		 DSA4 dList= new DSA4();
		// Add nodes to the list
		dList.addNode('m');
		dList.addNode('a');
		dList.addNode('m');
		dList.display();
		System.out.println("palindrome "+dList.palindorme());
	}
}
