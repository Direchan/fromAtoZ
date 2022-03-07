import java.util.Scanner;

public class NamedWhile {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("1. 제곱값");
			System.out.println("2. 제곱근");
			System.out.println("3. log");
			System.out.println("원하는 메뉴(1~3)를 선택하시오. 종료는 0 입니다. : ");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택했습니다. 종료는 0 입니다. : ");
				continue;
			}
			
			for(;;) {
				System.out.print("계산할 값을 입력하세요. (계산 종료는 0번이고 전체 종료는 99번입니다.) : ");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				
				if(num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("결과값은 " +num*num+" 입니다.");
					break;
				case 2:
					System.out.println("결과값은 " +Math.sqrt(num)+" 입니다.");
					break;
				case 3:
					System.out.println("결과값은 " +Math.log(num)+" 입니다.");
					break;
				}
			}
			System.out.println("처음으로 돌아왔습니다.");
		}
	}
}