import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int numb = sc.nextInt();
		
		if(numb <0 || numb >= 100) {
			System.out.println("FORA DE INTERVALO");
		}
		else if(numb <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(numb <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if(numb <= 75) {
				System.out.println("Intervalo [50,75]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}
	
		sc.close();

	}
	

}
