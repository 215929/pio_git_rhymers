package edu.kis.vh.nursery.list;

/**
 * Class representing a single node in an integer linked list. Holds its value as well as pointers to the next and previous nodes, nulls if such nodes don't exist.
 */
public class Node {

    public int value;
    public Node prev, next;

    /**
     * Node's only constructor; initiates an instance with a given value.
     * @param i value to initiate node with
     */
    public Node(int i) {
        value = i;
    }
}
