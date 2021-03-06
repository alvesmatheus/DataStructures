package abstractions;

import binaryTree.BinaryTreeNode;

/**
 * A binary search tree, sometimes called ordered or sorted binary tree, is a
 * particular type of container based on a binary tree. It allows fast lookup,
 * addition and removal of elements. Binary search trees keep their elements in
 * sorted order, so its operations can use the principle of binary search. Each
 * node of the tree contains a comparable T-typed element.
 * 
 * @author Matheus Alves dos Santos
 * 
 */
public interface BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

	/**
	 * Returns the node containing the smallest element in the binary search tree.
	 * If the tree is empty, it returns null.
	 * 
	 * @return the node containing the smallest element in the tree.
	 * 
	 */
	public BinaryTreeNode<T> minimum();

	/**
	 * Returns the node containing the greatest element in the binary search tree.
	 * If the tree is empty, it returns null.
	 * 
	 * @return the node containing the greatest element in the tree.
	 * 
	 */
	public BinaryTreeNode<T> maximum();

	/**
	 * Returns the node containing the element that is immediately smaller than the
	 * given element. If the given element is not in the tree or if it has no
	 * predecessor in the tree, this method returns null.
	 * 
	 * @param element the element whose predecessor is being looked for.
	 * 
	 * @return the node containing the predecessor of the given element.
	 * 
	 */
	public BinaryTreeNode<T> predecessor(T element);

	/**
	 * Returns the node containing the element that is immediately greater than the
	 * given element. If the given element is not in the tree or if it has no
	 * successor in the tree, this method returns null.
	 * 
	 * @param element the element whose successor is being looked for.
	 * 
	 * @return the node containing the successor of the given element.
	 * 
	 */
	public BinaryTreeNode<T> successor(T element);

}
