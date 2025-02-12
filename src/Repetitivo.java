import java.util.Locale;
import java.util.Scanner;

public class Repetitivo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		
		//--------------------------------------
		
		//int x = 3;
		//int y = 0;

		//for (int i = 0; i < x; i++) {
		//	System.out.printf(i + ",");
		//	y = y + 5;
		//	System.out.println(y);
		//}
		
		//----------------------------------------
		
		//int N = sc.nextInt();
		
		//int soma = 0;
		//for (int i = 0; i < N; i++) {
		//	int x = sc.nextInt();
		//	soma = soma + x;
		//}
		
		//System.out.println(soma);
		
		//----------------------------------------
		
		//int x = 0;
		//int y = 4;

		//while (x < 3) {
		//   y = y + 2;
		//   x = x +1;
		//   System.out.println(x + "-" + y);
		//}
		
		//----------------------------------------
		
		//int x = sc.nextInt();
		
		//int soma = 0;
		//while (x != 0) {
		//	soma = soma + x;
		//	x = sc.nextInt();
		//}
		
		//System.out.println(soma);
		
		sc.close();
	}

}
