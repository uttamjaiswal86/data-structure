package com.learning.ds.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		// create a node
	    Node fiveNode = new Node(5);

	    // create a linked list with fiveNode at the head
	    LinkedList myLinkedList = new LinkedList(fiveNode);

	    // add a node with the value 4
	    myLinkedList.addNode(4);
	    System.out.println(fiveNode.getNext().getData());

	    // get count of linked list, should be 2
	    System.out.println(myLinkedList.getCount());

	    // remove node, print count of linked list should be 1 and nextnode for fiveNode should be null
	    try {
			myLinkedList.removeNode();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(myLinkedList.getCount());
	    System.out.println(fiveNode.getNext());

	    // add a node of value 8, get the second element from linked list--should be 8
	    myLinkedList.addNode(8);
	    System.out.println(myLinkedList.get(2));

	}

}
