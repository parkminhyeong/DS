package linkedList;

public class Node <E>{
private E item;
private Node next;
public Node(E newItem, Node p){ // ������
item = newItem;
next = p;
}
// get �޼ҵ�� set �޼ҵ�
public E getItem() { return item;}
public Node getNext() { return next;}
public void setItem(E newItem) { item = newItem;}
public void setNext(Node newNext) { next = newNext;}
}

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last; // ����Ʈ�� ������ ���(�׸�)�� ����Ų��.
	private int size; // ����Ʈ�� �׸�(���) ��

	public CList() { // ����Ʈ ������
		last = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

public void insert(E newItem) { // last�� ����Ű�� ����� ������ ����� ����
Node newNode = new Node(newItem, null); // �� ��� ����
if (last == null) { // ����Ʈ�� empty�϶�
newNode.setNext(newNode);
last = newNode;
}
else {
newNode.setNext(last.getNext()); // newNode�� ���� ��尡
// last�� ����Ű�� ����� ������尡 �ǵ���
last.setNext(newNode); // last�� ����Ű�� ����� ���� ��尡 newNode�� �ǵ���
}
size++;
}