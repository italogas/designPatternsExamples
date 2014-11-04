package com.br.talogas.testproject;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8, 3, 2, 9, 7, 1, 5, 4};
		
		mergeSort(a, 0, 7);
		
		String s = "";
		for(int i = 0; i < a.length; i++){
			s = s + a[i] + " ";
		}
		
		System.out.println(s);

	}

	private static void mergeSort(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		
		int q = 0;
		if(p < r)
			q = (p + r) / 2;
			System.out.printf("(%d, %d, %d)", q, p, r);
			mergeSort(a, p, q);
			//System.out.println("Cheguei aqui! ");
			mergeSort(a, q+1, r);
			merge(a, p, q, r);
			
		return;
		
	}

	private static void merge(int[] a, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1, n2;
		n1 = q - p + 1;
		n2 = r- q;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		for(int i = 0; i <= n1; i++){
			left[i] = a[p+i-1];
		}
		for(int j = 0; j <= n1; j++){
			right[j] = a[q+j];
		}
		left[n1+1] = Integer.MAX_VALUE;
		right[n2+1] = Integer.MAX_VALUE;
		int l = 1, m = 1;
		for(int k = p; k <= r; k++){
			if(left[l] < right[m]){
				a[k] = left[l];
				l++;
			} else {
				a[k] = right[m];
				m++;
			}
		}
		
	}

}
