package com.learning.ds.linkedlist;

public class LinkedList {
	private Node head;
	private int count;

	public LinkedList() {
		this.head = null;
		this.count = 0;

	}

	public LinkedList(Node head) {
		this.head = head;
		this.count = 1;
	}

	public void addNode(int value) {
		Node current = head;
		Node temp = new Node(value);
		if (current == null) {
			this.head = temp;
			this.count++;
			return;
		}
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	public void removeNode() throws Exception {
		Node current = head;
		if (current == null) {
			throw new Exception("List is empty");
		}
		if (this.count == 1) {
			this.head = null;
			count--;
		}
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;

	}

	public int getCount() {
		return this.count;
	}

	public boolean isEmpty() {
		return getCount() == 0;
	}

	public int get(int nodePosition) {
		if (nodePosition <= 0) {
			return -1;
		}
		Node current = head;
		for (int i = 1; i < nodePosition; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

}
