package coding;

import java.io.IOException;
import java.util.Scanner;

public class 백준2292 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int range = 2;
		
		int n = scan.nextInt();
		
		if(n == 1) {
			System.out.println(1);
		} else {
			while(range <= n) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
			
		}
		
		scan.close();
	}
}

/* 육각형으로 이루어진 벌집에 가운데 1부터 여섯방면으로 1씩 증가하는 도형이 그려져있는
 * 문제다.
 * 숫자 n이 주어졌을때, 중앙의 1에서 N까지 가는 최단 루트를 도출하는 문제.
 * 
 * 1에서부터 여섯방면으로 한바퀴가 6의 배수로 늘어나는 것을 알 수 있다.
 * 예를들면 2~7
 * 그다음은 7~19...19~37
 * 1은 기본값이기 때문에 최소값을 2로 잡고 범위가 n과 같아지기까지 반복문을 실행한다.
 * 반복문에서는 범위의 값을 최소값+6*한바퀴 돌아가는 횟수로 잡는다.
 * 한바퀴 돌때마다 카운트도 증가시켜주면 결과를 도출해낼 수 있다.
 */
