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
/*2021/12/30
손익분기점에 대한 문제
A는 생산의 고정비용
B는 생산의 가변비용(제품생산단가)
C는 판매이익

손익분기점을 벗어나거나 손익분기점을 출력하지 못하면 -1을 출력하고, 어느정도까지 생산을 해야 손익분기점을 벗어나지 않는지 횟수를 출력하는 문제였다.

생산단가가 판매이익을 넘어가거나 같아지면 손익분기점을 벗어났기 때문에 조건식을 걸었고,
판매이익에서 생산단가를 뺀 금액을 고정비용에 나누고 +1을 하면 손익분기점을 벗어나지 않은 최대횟수가 출력되는 문제였다.

*/
