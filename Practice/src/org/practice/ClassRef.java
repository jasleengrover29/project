package org.practice;

public class ClassRef {
	
	int a;
	int b;
	ClassRef(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassRef b1=new ClassRef(10,20);
		ClassRef b2=b1;
		System.out.println(b2.a);
		b2.b=30;
		System.out.println(b1.b);
		b1=null;
		System.out.println(b2.b);

	}

}
