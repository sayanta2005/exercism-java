import java.lang.reflect.Array;
import java.util.*;
class SimpleLinkedList<T> {
    private static class Node<T>{
        private T value;
        private Node<T> next;
        public Node(T value, Node<T> next){
            this.value = value;
            this.next = next;            
        }
        public T getValue(){
            return value; 
        }
    }
    private Node<T> head;
    private int size;
    SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    SimpleLinkedList(T[] values) {
        for(int i=0;i<values.length;i++){
            push(values[i]);
        }
    }
    void push(T value) {
        Node<T> newnode = new Node<T>(value,head);
        head = newnode;
        size+=1;
    }
    T pop() {
        if (size==0){
            throw new NoSuchElementException();
        }
        T value = head.getValue();
        head = head.next;
        size--;
        return value;
    }
    void reverse() {
        Node<T> prev = null, current = head, next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;   
        }
        head = prev;
    }
    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz,size);
        int index = 0;
        Node<T> temp = head;
        while(temp!=null){
            arr[index] = temp.value;
            temp = temp.next;
            index++;
        }
        return arr;
    }
    int size() {
        return size;
    }
}