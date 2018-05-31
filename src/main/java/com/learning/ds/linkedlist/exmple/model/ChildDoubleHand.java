package com.learning.ds.linkedlist.exmple.model;

public class ChildDoubleHand extends Child {
	Child leftHand;

	public ChildDoubleHand() {
		super();
		leftHand = null;
	}

	public ChildDoubleHand(String name) {
		super(name);
		leftHand = null;
	}

	public ChildDoubleHand(Child leftHand, Child rightHand, String name) {
		super(rightHand, name);
		this.leftHand = leftHand;
	}

	public Child getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(Child leftHand) {
		this.leftHand = leftHand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((leftHand == null) ? 0 : leftHand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildDoubleHand other = (ChildDoubleHand) obj;
		if (leftHand == null) {
			if (other.leftHand != null)
				return false;
		} else if (!leftHand.equals(other.leftHand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChildTwoHand [leftHand=" + leftHand + ", rightHand=" + rightHand + ", name=" + name + "]";
	}

}
