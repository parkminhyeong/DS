package InsertSort;

public class InsertTest {

	public static void main(String[] args) {
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		int size = a.length;
		
		InsSort S = new InsSort();
		System.out.printf(" \nÁ¤·ÄÇÒ ¿ø¼Ò : ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		
		System.out.println();
		
		S.insertionSort(a, size);

	}

}
