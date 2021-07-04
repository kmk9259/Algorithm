package 알고리즘.알고리즘01_1.chap01;

public class Max {
	//Q1
	static int max4(int a, int b, int c, int d)
	{
		int max=a;
		if (b>max)
			max=b;
		if (c>max)
			max=c;
		if (d>max)
			max=d;
		return max;
	}
	//Q2
	static int min3(int a, int b, int c)
	{
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		return min;
	}
	//Q3
	static int min4(int a, int b, int c, int d)
	{
		int min=a;
		if (b<min)
			min=b;
		if (c<min)
			min=c;
		if (d<min)
			min=d;
		return min;
	}
	//Q4
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
//		System.out.println(max4(1, 3, 5, 2));
//		System.out.println(min3(3, 5, 2));
//		System.out.println(min4(1, 3, 5, 2));
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
	}

}
