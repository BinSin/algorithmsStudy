package homework;

public class Test {

	public static void down_sort(int[] arr) {
		int tmp;
		int length = arr.length;
		for(int i=0; i<length-1; i++) {
			for(int j=i; j<length-1; j++) {
				if(arr[i] < arr[j+1]) {
					tmp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {10,50,30,20,10,60,90};
		down_sort(a);
		System.out.println(a[0]);
	}
}
