import java.util.Scanner;

public class entry1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		sc.close();
		System.out.println("Voce digitou:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
