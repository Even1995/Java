import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("QUE HORAS SAO?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("BOM DIA!");
			}
			else if ( hora < 18) {
			System.out.println("BOM DIA!");
			}
			else {
			System.out.println("BOM DIA!");
			}
            sc.close();
	}

}
