package 알고리즘.알고리즘01_1.chap02;

import java.util.Scanner;

public class Loop {
	private static Scanner sc = new Scanner(System.in);
	public static void q6()
	{
		System.out.print("n의 값：");
		int n = sc.nextInt();

		int sum = 0; 		// 합
		int i = 1;

		while (i <= n) { 	// i가 n 이하면 반복
			sum += i; 		// sum에 i를 더함
			i++; 			// i의 값을 1 증가(increment)
		}
		System.out.println(n + "까지의 합은 " + sum);
		System.out.println("i는 " + i);
	}
	public static void q7()
	{
		System.out.print("n의 값：");
		int n = sc.nextInt();

		int sum = 0; // 합

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum에 i를 더함
		}
		System.out.println(" = " + sum);
	}
	public static void q8()
	{
		System.out.println("숫자 입력: ");
		int num=sc.nextInt();
		int result=0;
		if(num%2==0) //짝수로 끝나면 가우스 덧셈
			result = (1+num) *((1+num)/2);
		else //홀수로 끝나면 가우스-중간값
			result = (1+num) *((1+num)/2) - (1+num)/2;
		System.out.println(result);
	}
	public static void q9(int a, int b) {
		int sum=0;
		if(a<b)
		{
			for(int i=a; i<=b; i++)
				sum +=i;
		}
		else
			for(int i=b; i<=a; i++)
				sum +=i;
		System.out.println(sum);
			
		
	}
	public static void q10()
	{
		System.out.println("a의 값 : ");
		int a= sc.nextInt();
		while(true) {
			System.out.println("b의 값 : ");
			int b=sc.nextInt();
			if(a>=b)
				System.out.println("a보다 큰 값을 입력하세요!");
			else
			{
				System.out.println("b-a는 "+(b-a)+"입니다.");
				break;
			}
			
		}
		
	}
	
	public static void q11()
	{
		while(true)
		{
			System.out.print("정수값：");
			int n = sc.nextInt();
			int count=0;
			while(n>0)
			{
				n/=10;
				count++;
			}
			System.out.println("그 수는 "+count+"자리입니다.");

		}

		
	}
	public static void q12()
	{
		for(int i=1; i<=9; i++)
			System.out.printf("   %2d ",i);
		System.out.println("\n--+---------------------------------------");
		for(int j=1; j<=9; j++)
		{
			System.out.printf("%d |",j);
			for(int k=1; k<=9; k++)
			{
				System.out.printf("%4d",j*k);
			}
			System.out.println();
		}
	}
	public static void q13()
	{
		for(int i=1; i<=9; i++)
			System.out.printf("   %2d ",i);
		System.out.println("\n--+---------------------------------------");
		for(int j=1; j<=9; j++)
		{
			System.out.printf("%d |",j);
			for(int k=1; k<=9; k++)
			{
				System.out.printf("%4d",j+k);
			}
			System.out.println();
		}
	}
	public static void q14()
	{
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num; j++)
				System.out.print("*");
			System.out.println();
		}
			
			
	}
	public static void q15(int n)
	{
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= i; j++) 			
				System.out.print("*");
			System.out.println(); 					
		}
		
	}
	public static void q15_2(int n)
	{
		for (int i = n; i >= 0; i--) { 				
			for (int j = i; j >=0; j--) 			
				System.out.print("*");
			System.out.println(); 					
		}
		
	}
	public static void q15_3(int n)
	{
		for (int i = 0; i < n; i++) 
		{ 				
			for (int j = 0; j < i ; j++) 		
				System.out.print(" ");
			for (int j = 0; j < n - i ; j++) 	
				System.out.print("*");
			System.out.println();					
		}
		
	}
	public static void q15_4(int n)
	{
		for (int i = 0; i < n; i++) 
		{ 				
			for (int j = 0; j < n - i ; j++) 	
				System.out.print(" ");
			for (int j = 0; j <= i ; j++) 		
				System.out.print("*");
			
			System.out.println();					
		}
		
	}
	public static void q16(int n)
	{
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print(" ");
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 
				System.out.print("*");
			System.out.println(); 						
		}
	}
	public static void q17(int n)
	{
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print(" ");
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 
				System.out.print(i);
			System.out.println(); 						
		}
	}
	public static void main(String[] args) 
	{
//		q6();
//		q7();
		//q8();
//		q9(3, 5);
//		q9(5, 1);
//		q11();
		//q15(6);
		//q15_4(6);
		q17(6);
	
	}

}
