package linkedList;

public class Node <E>{
private E item;
private Node next;
public Node(E newItem, Node p){ // 생성자
item = newItem;
next = p;
}
// get 메소드와 set 메소드
public E getItem() { return item;}
public Node getNext() { return next;}
public void setItem(E newItem) { item = newItem;}
public void setNext(Node newNext) { next = newNext;}
}

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last; // 리스트의 마지막 노드(항목)을 가리킨다.
	private int size; // 리스트의 항목(노드) 수

	public CList() { // 리스트 생성자
		last = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

public void insert(E newItem) { // last가 가리키는 노드의 다음에 새노드 삽입
Node newNode = new Node(newItem, null); // 새 노드 생성
if (last == null) { // 리스트가 empty일때
newNode.setNext(newNode);
last = newNode;
}
else {
newNode.setNext(last.getNext()); // newNode의 다음 노드가
// last가 가리키는 노드의 다음노드가 되도록
last.setNext(newNode); // last가 가리키는 노드의 다음 노드가 newNode가 되도록
}
size++;
}