import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a letter :");
	int n[]=new int[3];
	for(int i=0;i<3;i++) {
		n[i]=in.nextInt();
	}
	if(n[0]>n[1])
		System.out.println(n[0]);
	else if(n[1]>n[2])
		System.out.println(n[1]);
	else 
		System.out.println(n[2]);
}
}
