package bheap;

public class bheapmain {
	public static void main(String args[]) {
		Entry[] a = new Entry[16];
		
		a[1] = new Entry(90, "watermelon");
		a[2] = new Entry(80, "apple");
		a[3] = new Entry(70, "lemon");
		a[4] = new Entry(60, "cherry");
		a[5] = new Entry(50, "mango");
		a[6] = new Entry(40, "grape");
		a[7] = new Entry(30, "orange");
		a[8] = new Entry(20, "apricot");
		a[9] = new Entry(10, "kiwi");
		a[10] = new Entry(15, "lime");
		a[11] = new Entry(45, "pear");
		a[12] = new Entry(40, "banana");
		
		BHeap h = new BHeap(a, 12);
		
		System.out.println("Èü¸¸µé±âÀü");
		h.print();
		h.createHeap();
		System.out.println("ÃÖ¼Ò Èü : ");
		
		h.print();
		System.out.println("min »èÁ¦ ÈÄ");
		System.out.println(h.deleteMin().getVal());
		h.print();
		h.insert(5, "apple");
		System.out.println("»ğÀÔÈÄ");
		h.print();
	}

}