package Ass12;

import Ass12.DSA5.Node;

public class DSA6 {

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	// Represent the head and tail of the doubly linked list
	Node head, tail = null;
	int count = 0;

	// addNode() will add a node to the list
	public void addNode(int data) {
		// Create a new node
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


	public void traverse(int m, int n) {

		int m1 = 1, n1 = 0;
		Node current = head;
		Node temp = null;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		while (current != null) {
			// Prints each node by incrementing the pointer.

			if (m1 < m) {
				m1++;
				current = current.next;
				temp = current;
			} else if (n1 < n) {
				current = current.next;
				n1++;

			} 
			if(m1>=m && n1>=n){
				if (temp != null) {
					temp.next = current!=null?current.next:null;
					current = temp.next;
					m1=1;
					n1=0;
				}

			}
		}
	}

	public static void main(String[] args) {

		DSA6 dList = new DSA6();
		// Add nodes to the list
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(4);
		dList.addNode(5);
		dList.addNode(6);
		dList.addNode(7);
		dList.addNode(8);
		dList.addNode(9);
		dList.addNode(10);
		dList.traverse(3, 2);
		dList.display();
	}
}
