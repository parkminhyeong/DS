package MergeSort;

public class MergeTest {
	public static void main(String[] args) {
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		int size = a.length;
		
		MGSort S = new MGSort();
	
		System.out.printf(" \nÁ¤·ÄÇÒ ¿ø¼Ò : ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		
		System.out.println();
		S.mergeSort(a, 0, size - 1);
	
	}

}
