/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_LinkedList;

/**
 *
 * @author Pc
 */
public class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
