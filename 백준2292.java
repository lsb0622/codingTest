package coding;

import java.io.IOException;
import java.util.Scanner;

public class ����2292 {
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

/* ���������� �̷���� ������ ��� 1���� ����������� 1�� �����ϴ� ������ �׷����ִ�
 * ������.
 * ���� n�� �־�������, �߾��� 1���� N���� ���� �ִ� ��Ʈ�� �����ϴ� ����.
 * 
 * 1�������� ����������� �ѹ����� 6�� ����� �þ�� ���� �� �� �ִ�.
 * ������� 2~7
 * �״����� 7~19...19~37
 * 1�� �⺻���̱� ������ �ּҰ��� 2�� ��� ������ n�� ����������� �ݺ����� �����Ѵ�.
 * �ݺ��������� ������ ���� �ּҰ�+6*�ѹ��� ���ư��� Ƚ���� ��´�.
 * �ѹ��� �������� ī��Ʈ�� ���������ָ� ����� �����س� �� �ִ�.
 */
