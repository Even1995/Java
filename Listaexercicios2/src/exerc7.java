import java.util.Scanner;

public class exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numb= sc.nextDouble();
		double imposto;
		
		if(numb <= 2000.0) {
			imposto = 0.0;
		}
		else if(numb <= 3000.0) {
			imposto = (numb - 2000.0)*0.08;
		}
		else if(numb <= 4500.0) {
			imposto =(numb - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto =(numb - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.printf("ISENTO");
		}
		else {
			System.out.printf("TAXA: R$ %.2f%n", imposto);
		}
		sc.close();

	}

}
