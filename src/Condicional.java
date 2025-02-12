//import java.util.Locale;
//import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		
		double price = 400.00;
		double discount;
			
				
		if (price < 200.00) {
            discount = price * 0.01; 
        } else {
            discount = price * 0.05; 
        }

        System.out.println("Desconto: " + discount);
		//-----------------------------------

		// Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);

		// int minutos = sc.nextInt();

		// double conta = 50.0;
		// if (minutos > 100) {
		// conta = conta + (minutos - 100) * 2.0;
		// }

		// System.out.printf("Valor da conta = R$ %.2f%n", conta);

		// sc.close();

		// ------------------------------

		//int x = sc.nextInt();
		//String dia;

		// if (x == 1) {
		// dia = "domingo";
		// } else if (x == 2) {
		// dia = "segunda";
		// } else if (x == 3) {
		// dia = "terça";
		// } else if (x == 4) {
		// dia = "quarta";
		// } else if (x == 5) {
		// dia = "quinta";
		// } else if (x == 6) {
		// dia = "sexta";
		// } else if (x == 7) {
		// dia = "sábado";
		// } else {
		// dia = "valor inválido";
		// }

		//switch (x) {
		//case 1:
		//	dia = "domingo";
		//	break;
		//case 2:
		//	dia = "segunda";
		//	break;
		//case 3:
		//	dia = "terça";
		//	break;
		//case 4:
		//	dia = "quarta";
		//	break;
		//case 5:
		//	dia = "quinta";
		//	break;
		//case 6:
		//	dia = "sexta";
		//	break;
		//case 7:
		//	dia = "sábado";
		//	break;
		//default:
		//	dia = "valor inválido";
		//}

		//System.out.println("Dia da semana:" + dia);
		//sc.close();
	}

}
