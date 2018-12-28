package chapter02.hw;

public class ArrayUtil {

	// int 배열을 double 배열로 변환
	static double [] intToDouble( int[] source ) {
		double[] temp = new double[source.length];

		int idx = 0;
		for (int i : source) {
			temp[idx] = (double) i;
			idx++;
		}

		return temp;
	}
	
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source ) {
		int[] temp = new int[source.length];
		
		int idx = 0;
		for (double d : source) {
			temp[idx] = (int) d;
			idx++;
		}
		
		return temp;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ) {
		int[] newArr = new int[s1.length + s2.length];
		
		int pos = 0;
		for (int i = 0; i < s1.length; i++) {
			newArr[i] = s1[i];
			pos++;
		}
		for (int i = 0; i < s2.length; i++) {
			newArr[pos] = s2[i];
			pos++;
		}
		
		return newArr;
	}
	
}
