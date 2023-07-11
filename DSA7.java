package Ass12;

public class DSA7 {

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
	    
	    
	    public static void modify(DSA7 l1,DSA7 l2)
	    {
	    	int rm=0;
	    			 Node current1 = l1.head;
	    			 Node current2 =l2.head;
	    			 Node temp=null,temp2=null;
	    			 
	    			  while(current1 != null && current2!=null) {  
	    		            //Prints each node by incrementing the pointer.  
	    				  	if(rm==0)
	    				  	{
	    				  		temp=current2.next;
	    				  		current2.next=current1.next;
	    				  		current1.next=current2;
	    				  		current1=current2.next;
	    				  		rm=1;
	    				  	}
	    				  	else if(rm==1)
	    				  	{
	    				  		temp2=temp.next;
	    				  		temp.next=current1.next;
	    				  		current1.next=temp;
	    				  		rm=0;
	    				  		current2=temp2;
	    				  		current1=temp.next;
	    				  	}
	    		         
	    		        }
	    			
	    		
	    
	    	
	    }

	  
	    public static void main(String[] args) {  
	  
	        DSA7 dList = new DSA7();  
	        //Add nodes to the list  
	        dList.addNode(1);  
	        dList.addNode(2);  
	        dList.addNode(3);  
	        dList.addNode(4);  
	        dList.addNode(5);  
	        DSA7 dList2 = new DSA7();  
	        dList2.addNode(7);  
	        dList2.addNode(8);  
	        dList2.addNode(9);  
	        dList2.addNode(10);  
	        dList2.addNode(11);  
	        
	        modify(dList,dList2);
	  
	        //Displays the nodes present in the list  
	        dList.display();  
	    }  
	}  

