package huffman;

public class Huffman {
	private HuffmanEntry[] a;
	private int N;
	
	public Huffman(HuffmanEntry[] harray, int initianlSize) {
		a = harray;
		N = initianlSize;
	}
	
	public int size() {
		return N;
	}
	
	public void createHeap() {
		for(int i = N / 2; i > 0; i--) {
			downheap(i);
		}
	}
	
	public HuffmanEntry createTree() {
		while (size() > 1) {
			HuffmanEntry e1 = deleteMin();
			HuffmanEntry e2 = deleteMin();
			HuffmanEntry temp = new HuffmanEntry(e1.getFrequency() + e2.getFrequency(), e1.getWord() + e2.getWord(), e1, e2, " ");
			insert(temp);
		}
		return deleteMin();
	}
	
	public void preorder(HuffmanEntry node) {
		if(node.getLeft() != null) {
			node.getLeft().setCode(node.getCode() + "0");
			preorder(node.getLeft());
		}
		
		if(node.getRight() != null) {
			node.getRight().setCode(node.getCode() + "1");
			preorder(node.getRight());
		}
		
		if(node.getWord().length() == 1) {
			System.out.print(node.getWord() + ":" + node.getCode() + " ");
		}
	}
	
	public void insert(HuffmanEntry newEntry) {
		a[++N] = newEntry;
		upheap(N);
	}
	
	public HuffmanEntry deleteMin() {
		HuffmanEntry max = a[1];
		swap(1, N--);
		a[N + 1] = null;
		downheap(1);
		
		return max;
	}
	
	private boolean greater(int i, int j) {
		return a[i].getFrequency() > a[j].getFrequency();
	}
	
	private void swap(int i, int j) {
		HuffmanEntry temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void downheap(int i) {
		while (2 * i <= N) {
			int k = 2 * i;
			
			if ( k < N && greater(k, k+1)) {
				k++;
			}
			
			if (!greater(i, k)) {
				break;
			}
			
			swap(i, k);
			i = k ;
		}
	}
	
	private void upheap(int j) {
		while (j > 1 && greater (j / 2, j)) {
			swap(j/2, j);
			j = j / 2;
		}
	}
	
	public void print() {
		for (int i = 1; i < N + 1; i++) {
			System.out.printf("[" + a[i].getWord() + " " + a[i].getFrequency() + "]");
		}
		System.out.println();
	}

}