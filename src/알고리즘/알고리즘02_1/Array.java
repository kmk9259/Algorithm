package 알고리즘.알고리즘02_1;

import java.util.Scanner;

public class Array {
	public void q1()
	{
		int num = (int)(Math.random()*10+1);
		System.out.println("사람 수는 "+num+"명 입니다.");
	}
	public void q2()
	{
		int arr[] = {5,10,73,2,-5,42};
		for(int a:arr)
			System.out.print(a+" ");
		for(int i=0; i<arr.length/2; i++)
		{
			int t=arr[i];
			arr[i] =arr[arr.length-i-1];
			arr[arr.length-i-1]=t;
			
			System.out.println("\narr["+i +"]과 arr["+ (arr.length-i-1) +"]를 교환합니다.\n");
			for(int a:arr)
				System.out.print(a+" ");
		}
		System.out.println("\n역순 정렬을 마쳤습니다.");
	}
	public void q3()
	{
		int a[] = new int[10];
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			a[i]=(int)(Math.random()*10+1);
			System.out.print(a[i]+" ");
			sum+=a[i];
		}
		System.out.println("\nsum : "+sum);
	}
	public void q4()
	{
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i=0; i<a.length; i++)
		{
			a[i]=(int)(Math.random()*10+1);
			System.out.println("a배열 : "+a[i]+" ");
			b[i]=a[i];
			System.out.println("b배열 : "+b[i]+" ");
			System.out.println();
		}
	}
	public void q5()
	{
		int a[] = new int[10];
		int b[] = new int[10];
		for(int i=0; i<a.length; i++)
		{
			a[i]=(int)(Math.random()*10+1);
			b[i]=a[i]; //b에다가 복사
			
		}
		for(int i=0; i<b.length/2; i++)
		{
			int t=b[i];
			b[i] =b[b.length-i-1];
			b[b.length-i-1]=t;
		}
		for(int aa : a)
			System.out.print(aa+"  ");
		System.out.println();
		for(int bb : b)
			System.out.print(bb+"  ");
	}
	public void q6(int x, int r, char[]d) //배열의 0번 인덱스가 아랫자리부터 시작이
	{
		int digits=0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		
		for (int i = 0; i < d.length / 2; i++) 
		{ 
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
	}
	public void q7()
	{
		char[] d = new char[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수 변환합니다.");
		System.out.println("변환하는 음이 아닌 정수 :");
		int num = sc.nextInt();
		int digits=0;
		int count=0;
		if(num>0)
		{
			sc.nextLine();
			System.out.println("어떤 진수로 변환할까요?(2-36) :");
			int num2 = sc.nextInt();
			if(num2>=2 || num2<=36)
			{
				
				String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				System.out.println(num2+"|       "+num);
				do {
					
					
					d[digits++] = dchar.charAt(num % num2); // r로 나눈 나머지를 저장
					System.out.println(num2+"|       "+num+"  --- "+d[count++]);
					System.out.println(" + --------------");
					num /= num2;
				} while (num!= 0);
				System.out.println();
			}
			
			
			System.out.println(num2+"진수로는");
			for(int i=digits-1; i>=0; i--)
				System.out.print(d[i]);
			System.out.println("입니다.");
		}
		
		
		
		
	}

}
