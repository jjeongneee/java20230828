package ch05reference;

public class C06matrix {
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}}; // 참조변수
		int[][] b =a;
		
		System.out.println(a[0][2]); //3
		System.out.println(b[0][2]); //3
		
		a[1][1] = 2000;
		
		System.out.println(a[1][1]); // 2000
		System.out.println(b[1][1]); // 20? 2000? -> 2000
		
		b[2][2] = 9999;
		System.out.println(b[2][2]); //9999
		System.out.println(a[2][2]); //9999
		
		b[2] = new int[] {111, 222, 333};
		System.out.println(b[2][2]); // 333
		System.out.println(a[2][2]); // 333
		
		// b에 새객체(instance)의 참조값 할당됨
		b = new int[][] {{33, 44}, {22, 11}}; // 여기부턴 a와 b가 서로 별개의 객체가 됨.
		System.out.println(b[0][0]); //33
		System.out.println(a[0][0]); //33? 1? -> 1
	}
}
