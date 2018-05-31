package com.learning.ds.linkedlist.exmple.one;

import com.learning.ds.linkedlist.exmple.model.Child;

public class BuildChildrenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildrenLinkedList childQueue = new ChildrenLinkedList();
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		Child neha = new Child("Neha");
		childQueue.insertChild(neha);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		Child komal = new Child("Komal");
		childQueue.insertChild(komal);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		childQueue.printAllList();
		Child ananyana = new Child("Ananyana");
		childQueue.insertFirstChild(ananyana);
		System.out.println("Is list empty " + childQueue.isChildListEmpty());
		System.out.println("Is size of list: " + childQueue.getCount());
		childQueue.printAllList();
		childQueue.removeFirstChild();
		System.out.println("Is size of list: " + childQueue.getCount());
		childQueue.printAllList();
		childQueue.removeChild();
		System.out.println("Is size of list: " + childQueue.getCount());
	}

}
