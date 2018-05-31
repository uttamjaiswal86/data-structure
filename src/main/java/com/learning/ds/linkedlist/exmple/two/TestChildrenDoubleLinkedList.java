package com.learning.ds.linkedlist.exmple.two;

import com.learning.ds.linkedlist.exmple.model.ChildDoubleHand;

public class TestChildrenDoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildrenDoubleLinkedList childQueue=new ChildrenDoubleLinkedList();
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		ChildDoubleHand neha=new ChildDoubleHand("neha");
		childQueue.insertChild(neha);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		ChildDoubleHand komal = new ChildDoubleHand("Komal");
		childQueue.insertChild(komal);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		ChildDoubleHand ananyana = new ChildDoubleHand("Ananyana");
		childQueue.insertFirstChild(ananyana);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		childQueue.printAllList(neha);
		childQueue.removeFirstChild();
		System.out.println("Is size of list: " + childQueue.getCount());
		childQueue.removeChild();
		System.out.println("Is size of list: " + childQueue.getCount());
	}

}
