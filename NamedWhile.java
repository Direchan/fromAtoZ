import java.util.Scanner;

public class NamedWhile {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("1. ������");
			System.out.println("2. ������");
			System.out.println("3. log");
			System.out.println("���ϴ� �޴�(1~3)�� �����Ͻÿ�. ����� 0 �Դϴ�. : ");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����߽��ϴ�. ����� 0 �Դϴ�. : ");
				continue;
			}
			
			for(;;) {
				System.out.print("����� ���� �Է��ϼ���. (��� ����� 0���̰� ��ü ����� 99���Դϴ�.) : ");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				
				if(num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("������� " +num*num+" �Դϴ�.");
					break;
				case 2:
					System.out.println("������� " +Math.sqrt(num)+" �Դϴ�.");
					break;
				case 3:
					System.out.println("������� " +Math.log(num)+" �Դϴ�.");
					break;
				}
			}
			System.out.println("ó������ ���ƿԽ��ϴ�.");
		}
	}
}