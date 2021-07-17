package com.bridgelabz.binarytree.program;

public class BinaryTreeSize<T extends Comparable<T>> 
{
	
	T key;
	BinaryTreeSize<T> left;
	BinaryTreeSize<T> right;
	
	public BinaryTreeSize(T key)
	{
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public BinaryTreeSize() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "BinaryNode [data=" + key + ", left=" + left + ", right=" + right + "]";
	}
}
