package com.learning.ds.linkedlist.exmple.two;

import com.learning.ds.linkedlist.exmple.model.Child;
import com.learning.ds.linkedlist.exmple.model.ChildDoubleHand;

public class ChildrenDoubleLinkedList {
	ChildDoubleHand firstChild;
	int count;

	public ChildrenDoubleLinkedList() {
		firstChild = null;
		count = 0;
	}
	
	public ChildrenDoubleLinkedList(String name) {
		ChildDoubleHand c=new ChildDoubleHand(name);
		firstChild=c;
		count++;
	}
	
	public void insertFirstChild(ChildDoubleHand child) {
		ChildDoubleHand current = firstChild;
		if (current == null) {
			firstChild = child;
			count++;
			return;
		} else {
			current.setLeftHand(child);
			firstChild = child;
			firstChild.setLeftHand(null);
			firstChild.setRightHand(current);
			count++;
		}
	}

	public void insertChild(ChildDoubleHand c) {
		ChildDoubleHand current = firstChild;
		if (current == null) {
			insertFirstChild(c);
			return;
		} else {
			while (current.getRightHand() != null) {
				//current.setRightHand(current.getRightHand());
				current = (ChildDoubleHand) current.getRightHand();
			}
			c.setLeftHand(current);
			current.setRightHand(c);
			count++;
		}
	}

	public void removeChild() {
		ChildDoubleHand current = firstChild;
		if (current == null)
			return;
		else
			while (current.getRightHand().getRightHand() != null) {
				current = (ChildDoubleHand) current.getRightHand();
			}
		current.setRightHand(null);
		count--;
	}

	public void removeFirstChild() {
		Child current = firstChild;
		if (current == null)
			return;
		else {
			firstChild = (ChildDoubleHand) current.getRightHand();
			count--;
		}

	}
	
	public void printAllList(ChildDoubleHand currentPosition) {
		ChildDoubleHand current=currentPosition;
		System.out.println("Printing list in forward direction");
		if(firstChild == null)
			return;
		else
			while(current != null) {
				System.out.println(current.getName()+" ");
				current=(ChildDoubleHand) current.getRightHand();
			}
		System.out.println("Printing list in reverse direction");
		current=currentPosition;
		while(current != null) {
			System.out.println(current.getName()+" ");
			current=(ChildDoubleHand) current.getLeftHand();
		}
	}

	public int getCount() {
		return this.count;
	}

	public boolean isChildListEmpty() {
		return (this.count == 0) ? true : false;
	}
	
	

}
