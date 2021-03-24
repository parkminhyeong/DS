package linkedList;

class LinkedList{
	private ListNode head;
	public void LinKedList(){
			head = null;
	}
	public void insertMiddleNode(ListNode pre, String data){
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			this.head = newNode;
		}
		else {
				ListNode temp = head;
				while(temp.link !=null)temp = temp.link;
				temp.link = newNode;
		}
	}
}