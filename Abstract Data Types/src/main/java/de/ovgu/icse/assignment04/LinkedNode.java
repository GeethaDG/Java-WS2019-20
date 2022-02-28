package de.ovgu.icse.assignment04;

public class LinkedNode<E> {
    E data_;
    LinkedNode<E> next_;

    public LinkedNode(E data) {
        this.data_ = data;
    }

    public void setNextNode(LinkedNode<E> n_node) {
        this.next_ = n_node;
    }

    public LinkedNode<E> getNextNode() {
        return this.next_;
    }

    // Getter
    public E getNodeData() {
        return data_;
    }

    public String toText() {
        String s = this.data_.toString();

        LinkedNode<E> next_node = this.next_;
        while (next_node != null) {
            s += "," + next_node.getNodeData();
            next_node = next_node.next_;
        }

        return s;
    }
}
