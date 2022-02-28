package de.ovgu.icse.assignment05;
import java.util.LinkedList;
import java.util.Stack;


public class LinkedTree<E> {
    Node<E> root;

    private class Node<E> {
        private int key; //the key field
        private LinkedList<E> data; //list of data associated with a key
        private Node<E> left; //reference to the left child
        private Node<E> right; //reference to the right child

        private Node(int key, E element, Node<E> leftChild, Node<E> rightChild) {
            this.key = key;
            this.data = new LinkedList<E>();
            this.left = leftChild;
            this.right = rightChild;
            this.data.add(element);
        }

        private Node(int key, E element) {
            this(key, element, null, null);
        }

        // for the last question
        private Node(int key, E[] element) {
            this.key = key;
            this.data = new LinkedList<E>();
            for (E item : element) {
                this.data.add(item);
            }
            this.left = null;
            this.right = null;
        }

    }

    public LinkedTree() {
        root = null;
    }

    public LinkedTree(int key, E element) {
        Node<E> newNode = new Node<E>(key, element);
        root = newNode;
    }

    public LinkedTree(int key, E[] elems) {
        root = new Node<E>(key, elems);
    }

    public void addData(E data) {
        this.root.data.add(data);
    }

    public void insert(int key, E element) {
        Node<E> newNode = new Node<E>(key, element);
        if (root == null) {
            root = newNode;
        } else {
            Node<E> targetNode = root;
            Node<E> parent;
            while (true) {
                parent = targetNode;
                if (key < targetNode.key) {
                    targetNode = targetNode.left;
                    if (targetNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    targetNode = targetNode.right;
                    if (targetNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public LinkedList<E> search(int key) {
        Node<E> node = searchTree(root, key);
        if (node == null) return null;
        else return node.data;
    }

    private Node<E> searchTree(Node<E> root, int key) {
        if (root == null || root.key == key) return root;
        if (root.key > key) return searchTree(root.left, key);
        return searchTree(root.right, key);
    }


    public LinkedList<E> preorder(int ind) {
        LinkedList<E> outPreorder = new LinkedList<E>();
        Stack<Node> stackNode = new Stack<Node>();
        stackNode.push(root);
        while (!stackNode.empty()) {
            Node<E> tempNode = stackNode.pop();
            if (tempNode.data.size() > ind) {
                outPreorder.add(tempNode.data.element());
            }
            // Push right and left children of the popped node to stack
            if (tempNode.right != null) {
                stackNode.push(tempNode.right);
            }
            if (tempNode.left != null) {
                stackNode.push(tempNode.left);
            }
        }
        return outPreorder;
    }

    public LinkedList<E> postorder(int ind) {
        LinkedList<E> outPostorder = new LinkedList<E>();
        Stack<Node> stackNode = new Stack<Node>();
        Node<E> node = root;
        if (node == null)
            return outPostorder;
        stackNode.push(node);
        Node prevNode = null;
        while (!stackNode.isEmpty()) {
            Node<E> currNode = stackNode.peek();
            if (prevNode == null || prevNode.left == currNode || prevNode.right == currNode) {
                if (currNode.left != null)
                    stackNode.push(currNode.left);
                else if (currNode.right != null)
                    stackNode.push(currNode.right);
                else {
                    stackNode.pop();
                    outPostorder.add(currNode.data.element());
                }
            } else if (currNode.left == prevNode) {
                if (currNode.right != null)
                    stackNode.push(currNode.right);
                else {
                    stackNode.pop();
                    outPostorder.add(currNode.data.element());
                }
            } else if (currNode.right == prevNode) {
                stackNode.pop();
                outPostorder.add(currNode.data.element());
            }

            prevNode = currNode;
        }

        return outPostorder;
    }

    public LinkedList<E> inorder(int ind) {
        LinkedList<E> outInorder = new LinkedList<E>();
        Stack<Node> stackNode = new Stack<Node>();
        if (root == null)
            return outInorder;
        Node<E> currNode = root;
        while (currNode != null || stackNode.size() > 0) {
            while (currNode != null) {
                stackNode.push(currNode);
                currNode = currNode.left;
            }
            currNode = stackNode.pop();
            outInorder.add(currNode.data.element());
            currNode = currNode.right;
        }
        return outInorder;
    }

    public LinkedList<E> delete(int key) {
        LinkedList<E> del = search(key);
        Node<E> root = deleteNode(this.root, key);

        return del;
        // return root.data;

    }

    private Node<E> deleteNode(Node<E> root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) {
                Node<E> temp = root.right;
                root = null;
                return temp;
            }
            else if (root.right == null) {
                Node<E> temp = root.left;
                root = null;
                return temp;
            }

            Node<E> temp = minimumValueNode(root.right);

            root.key = temp.key;
            root.data = temp.data;

            root.right = deleteNode(root.right, temp.key);
        }

        return root;
    }

    private Node<E> minimumValueNode(Node<E> root) {
        Node<E> current = root;

        while (current.left != null)
            current = current.left;

        return current;
    }
}
