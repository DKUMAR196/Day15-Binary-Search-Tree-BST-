package com.bridgelabz.binarytree.program;

public class CreateBinaryTree<T extends Comparable<T>> 
{
	
	T key;
	CreateBinaryTree<T> left;
	CreateBinaryTree<T> right;
	
	public CreateBinaryTree(T key)
	{
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public CreateBinaryTree() 
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
