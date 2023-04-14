
public class ReverseArray {
	static void reverse(int ar[]) {
	int temp=0,i=0,j=ar.length-1;
	while(i<j) {
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		
		i++;
		j--;
	}
	}
	public static void main(String[] args) {
int x[]= {10,20,30,40,50};

reverse(x);

for(int i=0;i<x.length;i++) {
System.out.println(x[i]+" ");
	}

}
}
