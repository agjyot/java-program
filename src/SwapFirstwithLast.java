import java.util.Scanner;

public class SwapFirstwithLast {
static String swapFirsrLastChar(String str) {
	char[] ch=str.toCharArray();
	int f=0;
	for(int i=0;i<ch.length;i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
			f=i;
		}
		if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
			char t=ch[i];
			ch[i]=ch[f];
			ch[f]=t;
		}
	}
	str=new String(ch);
	return str;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String str1=swapFirsrLastChar(str);
		System.out.println(str1);
	}

}
