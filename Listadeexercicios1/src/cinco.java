import java.util.Locale;
import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int qanthoras = sc.nextInt();
		double trabporhora = sc.nextDouble();
	    
		double salario =(double) qanthoras*trabporhora;
		
		System.out.println("NUMBER="+ funcionario);
		System.out.printf("SALARY= %.2f%n", salario);
		
		sc.close();


	}

}
