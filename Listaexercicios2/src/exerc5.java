import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qnt = sc.nextInt();
		double total;
		
		if(cod == 1) {
			total = qnt * 4.00;
		}
		else if (cod == 2) {
			total = qnt * 4.50;
		}
		else if (cod == 3) {
			total = qnt * 5.00;
		}
		else if (cod == 4) {
			total = qnt * 2.00;
		}
		else {
			total = qnt * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", total );
		sc.close();

	}

}
