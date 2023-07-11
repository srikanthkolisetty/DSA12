package Ass12;

import Ass12.DoublyLinkedList.Node;

public class DSA3 {
	  class Node{  
	        int data;  
	        Node previous;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	    //Represent the head and tail of the doubly linked list  
	    Node head, tail = null;  
	    int count=0;
	    //addNode() will add a node to the list  
	    public void addNode(int data) {  
	        //Create a new node  
	        Node newNode = new Node(data);  
	  
	        //If list is empty  
	        if(head == null) {  
	            //Both head and tail will point to newNode  
	            head = tail = newNode;  
	            //head's previous will point to null  
	            head.previous = null;  
	            //tail's next will point to null, as it is the last node of the list  
	            tail.next = null;  
	        }  
	        else {  
	            //newNode will be added after tail such that tail's next will point to newNode  
	            tail.next = newNode;  
	            //newNode's previous will point to tail  
	            newNode.previous = tail;  
	            //newNode will become new tail  
	            tail = newNode;  
	            //As it is last node, tail's next will point to null  
	            tail.next = null;  
	        }  
	        count++;
	    }  
	  
	    //display() will print out the nodes of the list  
	    public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }
	        
	         } 
	    
	    
	    public void modify()
	    {
	    	int rm=0,nodeNumb=0;
	    	System.out.println(count);
	    		if(count%2==0)
	    		{
	    			rm=(count/2)+1;
	    		}
	    		if(count%2!=0)
	    		{
	    			rm=(int)Math.ceil(count/2.0);
	    		}
	    			 Node current = head;
	    			  while(current != null) {  
	    		            //Prints each node by incrementing the pointer.  
	    				  	nodeNumb++;
	    				  	if(nodeNumb==rm)
	    				  	{
	    				  		Node prev=current.previous;
	    				  		prev.next=current.next;
	    				  		count--;
	    				  		break;
	    				  	}
	    		            current = current.next;  
	    		        }	    	
	    }
	    
	    public void lastNode(int n)
	    {
	    	int num=count-n+1;
	    	int cou=0;
	    	 Node current = head;
	    	 System.out.println();
			  while(current != null) {  
		            //Prints each node by incrementing the pointer.
				  
				  	if(num==cou)
				  	{
				  		System.out.println(n+" node from last is "+current.data);
				  		break;
				  	}
		            current = current.next;  
		            cou++;
		        }	
	    }

	  
	    public static void main(String[] args) {  
	  
	        DSA3 dList = new DSA3();  
	        //Add nodes to the list  
	        dList.addNode(1);  
	        dList.addNode(2);  
	        dList.addNode(3);  
	        dList.addNode(4);  
	        dList.addNode(5);  
	        
	  
	        //Displays the nodes present in the list  
	        dList.display();  
	        dList.modify();
	        dList.display();  
	        dList.lastNode(3);
	    }  
}
