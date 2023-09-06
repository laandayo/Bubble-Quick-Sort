package Common;
import java.util.Random;
import java.util.Scanner;

public class Algorithm {
	public void bubbleSort(int[] array) {
		for (int i = 0; i<array.length; i++) {
			for (int j=0; j<array.length-i-1;j++) {
				if (array[j] >array[j+1]) {
					int tmp = array [j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	public int partition(int[] array, int left, int right) {
		int i = left; int j = right;
		int pivot = array[(left+right) / 2];
		int tmp;
		while(i<=j) {
			while (array[i]<pivot) {
				j--;
			}
			
			if(i<=j) {
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	public void quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index-1) {
		quickSort(array, left, index-1);
	}
		if (index <right) {
			quickSort (array, index, right);
		}
	}
	
	public int getInt(String promt, int m, int n) {
		int a= -1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(promt + ": ");
			try {
				String s = sc.nextLine();
				a = Integer.parseInt(s);
				if (a >= m && a<= n) {
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Enter a number between " + m + " and " + n);				
			}
		}
		return a;
	}
	
	public int[] createArray(int sizeArray) {
		int[] array = new int[sizeArray];
		Random rd = new Random();
		for (int i = 0; i<sizeArray;i++) {
			array[i] = rd.nextInt(100);
		}
		return array;
	}
	
	public void display(int[] array) {
		for (int i=0; i<array.length; i++) {
			if (i<array.length -1) {
				System.out.println(array[i] + ", ");
				
			}
			else {
				System.out.println(array[i]);
			}
		}
		System.out.println("");
	}
}
