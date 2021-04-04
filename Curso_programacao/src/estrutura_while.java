import java.util.Scanner;

public class estrutura_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y= sc.nextInt();
		
		while(x != y) {
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
