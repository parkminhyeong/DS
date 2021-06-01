package BubbleSort;

public class BubbleSort {
	public void BubbleSort(int a[]) {
		
		int i, j, temp, size;
		size = a.length;
		
		for(i = size - 1; i > 0; i--) {
			System.out.printf(" \n ¹öºí Á¤·Ä %d ´Ü°è : ", size - i);
			for(j = 0; j < i; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				System.out.printf(" \n \t");
				for(int k = 0; k < size; k++) {
					System.out.printf("%3d", a[k]);
				}
				
			}
		}
	}

}