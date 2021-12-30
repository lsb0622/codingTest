package coding;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c-b<=0) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);
		}
		scan.close();
	}
}
