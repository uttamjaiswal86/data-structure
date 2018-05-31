package com.learning.ds.linkedlist.exmple.one;

import com.learning.ds.linkedlist.exmple.model.Child;

public class ChildrenLinkedList {
	Child firstChild;
	int count;

	public ChildrenLinkedList() {
		firstChild = null;
		count = 0;
	}

	public ChildrenLinkedList(Child c) {
		this.firstChild = c;
		count++;
	}

	public void insertFirstChild(Child c) {
		Child current = firstChild;
		if (current == null) {
			firstChild = c;
			count++;
			return;
		} else {
			firstChild = c;
			firstChild.setRightHand(current);
			count++;
		}
	}

	public void insertChild(Child c) {
		Child current = firstChild;
		if (current == null) {
			insertFirstChild(c);
			return;
		} else {
			while (current.getRightHand() != null) {
				current.setRightHand(current.getRightHand());
			}
			current.setRightHand(c);
			count++;
		}
	}

	public void removeChild() {
		Child current = firstChild;
		if (current == null)
			return;
		else
			while (current.getRightHand().getRightHand() != null) {
				current = current.getRightHand();
			}
		current.setRightHand(null);
		count--;
	}

	public void removeFirstChild() {
		Child current = firstChild;
		if (current == null)
			return;
		else {
			firstChild = current.getRightHand();
			count--;
		}

	}

	public int getCount() {
		return this.count;
	}

	public boolean isChildListEmpty() {
		return (this.count == 0) ? true : false;
	}

	public void printAllList() {
		Child current=firstChild;
		if(firstChild == null)
			return;
		else
			while(current != null) {
				System.out.println(current.getName()+" ");
				current=current.getRightHand();
			}
	}

}
