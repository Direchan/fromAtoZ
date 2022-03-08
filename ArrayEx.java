import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for (int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45);
			tmp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = tmp;
		}
		for(int i=0; i<6; ++i)
			System.out.printf("로또번호[%d]=%d%n", i+1, lotto[i]);
	}

}
