package practice;
import java.lang.reflect.Array;
import java.util.*;
public class questions {
	static int check(int m,int n) {
		int dsum=0;
		int ndsum=0;
		for(int i=1;i<=n;i++) {
			if(i%m==0) {
				dsum+=i;
			}
			else {
				ndsum+=i;
			}
		}
		return ndsum-dsum;
	}
	static String anagram(String a,String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if (Arrays.equals(c, d))
			return "yes";
		else
			return "no";

	}
	static int Productsmallpair(int sum,int[] a) {
		int s1=Integer.MAX_VALUE;
		int s2=Integer.MAX_VALUE;
		for(int i: a) {
			if(i<=s1) {
				s2=s1;
				s1=i;
			}
			else if(i<s2 && i !=s1) {
				s2=i;
			}
		}
		if((s1+s2)<sum) 
			return s1*s2;
		else
			return s1+s2;

	}
	static String chatsDectoNBase(int n, int num) {
		
		char a=65;
		String ot="";
		while(num%n!=0) {
			
			if((num%n)>9 && (num%n)<36) {
				a=(char)(65+((num%n)-9)-1);
				ot=ot.concat(String.valueOf(a));
			}
			else {
				ot=ot.concat(String.valueOf((num%n)));
			}
			num=num/n;

		}
		return ot;
	}
	static int Numberofcarry(int num1,int num2) {
		String a=String.valueOf(num1);
		String b=String.valueOf(num2);
		int carry=0;
		int c=a.length()<b.length()?a.length():b.length();
		for(int i=c-1;i>=0;i--) {
			if(Character.getNumericValue(b.charAt(i))+Character.getNumericValue(a.charAt(i))+carry>9) {
				carry++;
			}
			else
				continue;
		}
		return  carry;
	}
	static String Replacecharacter(String str, char a, char b){
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			str1.append(str.charAt(i));
		}
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==a) {
				str1.setCharAt(i,b);
			}
			else if(str.charAt(i)==b) {
				str1.setCharAt(i, a);
			}
		}
		return str1.toString();
	}
	static int operationchoices(int a,int b, int c) {
		switch (c) {
		case 1:
			return a+b;
		case 2:
			return a-b;
		case 3:
			return a*b;
		case 4:
			return a/b;
		default:
			return a;
		}
	}
	static int calculate(int m, int n) {
		int sum=0;
		for(int i=m+1;i<n;i++) {
			if((i%3==0)&&(i%5==0)) {
				sum+=i;
			}
		}
		return sum;
	}
	static int getsumeveoddAr(int[] a) {
		int sum=0;
		int[] evar=new int[a.length];
		int[] odar=new int[a.length];
		int k=0;
		int l=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				evar[k]=a[i];
				k++;
			}
			else {
				odar[l]=a[i];
				l++;
			}

		}
		System.out.println(secondLar(evar));
		System.out.println(secondLar(odar));
		sum=secondLar(evar)+secondLar(odar);
		return sum;
	}
	static int secondLar(int[] a) {
//		int secondLar=a[0];
//		int firstLar=a[0];
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<=a.length-1;j++) {
//				if(a[j]>firstLar) {
//					secondLar=firstLar;
//					firstLar=a[j];
//				}
//			}
//		}
		Arrays.sort(a);
		
		return a[a.length-2];
	}
	static int OperationsBinarystring(String a) {
		if (a.length()==0) {
			return -1;
		}
		int f=Character.getNumericValue(a.charAt(0));
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i)=='C'&& i+1!=a.length()) {
				f=f^Character.getNumericValue(a.charAt(i+1));
			}
			else if(a.charAt(i)=='A'&& i+1!=a.length()) {
				f=f&Character.getNumericValue(a.charAt(i+1));
			}
			else if(a.charAt(i)=='B'&& i+1!=a.length()) {
				f=f|Character.getNumericValue(a.charAt(i+1));
			}
		}
		return f;
	}
	static int checkpassword(char str[]) {
		if(str.length==0 || checkChar(str,'/')||checkChar(str,' ')) {
			return 0;
		}
		for(int i=0;i<str.length;i++) {
			if((int))
		}
			return 1;
	}
	
	static boolean checkChar(char[] a, char b) {
		Character[] c=new Character[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		return Arrays.asList(c).contains(b);
	}
			
	
	public static void main(String[] args ) {
	/*	int a[]= {1,6,24,2,5,76,2};
		int temp;*/
		int[] a= {3,8,9,7,5,4};
		char[] b= {'a','e','r',' '};
		System.out.println(check(6,30));
		System.out.println(anagram("listen","silent"));
		System.out.println(Productsmallpair(8,a));
		System.out.println(chatsDectoNBase(12,718));
		System.out.println(Numberofcarry(451,349));
		System.out.println(Replacecharacter("apples",'a','p'));
		System.out.println(operationchoices(1,5,2));
		System.out.println(calculate(12,50));
		System.out.println(getsumeveoddAr(a));
		System.out.println(OperationsBinarystring("0C1C0C1A0B1"));
		System.out.println(checkpassword(b));

	}
}
