import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 2002) {
				System.out.println("Acesso Negado");
				x = sc.nextInt();
			}
				System.out.println("Acesso Aprovado");
		sc.close();
	}
}