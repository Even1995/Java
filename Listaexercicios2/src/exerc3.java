import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		if (x % 2 == 0 && y % 2 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
