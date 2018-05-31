package com.learning.ds.linkedlist.exmple.model;

public class Child {
	Child rightHand;
	String name;

	public Child() {
		rightHand = null;
		name = "";
	}

	public Child(String name) {
		rightHand = null;
		this.name = name;
	}

	public Child(Child hand, String name) {
		this.rightHand = hand;
		this.name = name;
	}

	public Child getRightHand() {
		return rightHand;
	}

	public void setRightHand(Child hand) {
		this.rightHand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rightHand == null) ? 0 : rightHand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Child other = (Child) obj;
		if (rightHand == null) {
			if (other.rightHand != null)
				return false;
		} else if (!rightHand.equals(other.rightHand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
