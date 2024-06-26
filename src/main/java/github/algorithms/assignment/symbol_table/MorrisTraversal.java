package github.algorithms.assignment.symbol_table;

/**
 * <a href="https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/">GFG Inorder Traversal Without Extra Memory</a>
 * <p></p>
 * 1. Initialize current as root
 * 2. While current is not NULL
 * If the current does not have left child
 * a) Print current’s data
 * b) Go to the right, i.e., current = current->right
 * Else
 * a) Find rightmost node in current left subtree OR
 * node whose right child == current.
 * If we found right child == current
 * a) Update the right child as NULL of that node whose right child is current
 * b) Print current’s data
 * c) Go to the right, i.e. current = current->right
 * Else
 * a) Make current as the right child of that rightmost
 * node we found; and
 * b) Go to this left child, i.e., current = current->left
 */
public class MorrisTraversal {
}
