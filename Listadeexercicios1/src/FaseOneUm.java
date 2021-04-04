import java.util.Scanner;
import java.util.Locale;

public class FaseOneUm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
	    
		Double area = pi*Math.pow(raio, 2);
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
