import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ID1, ID2, Qnt1, Qnt2;
		double ValorUnitario1, ValorUnitario2, ValoraPagar;
		
		ID1 = sc.nextInt();
		Qnt1 = sc.nextInt();
		ValorUnitario1 = sc.nextDouble();
		
		ID2 = sc.nextInt();
		Qnt2 = sc.nextInt();
		ValorUnitario2 = sc.nextDouble();
		
		ValoraPagar = ValorUnitario1 * Qnt1 + ValorUnitario2 * Qnt2;
		 
		System.out.printf("Valor a pagar R$: %.2f%n ",ValoraPagar);
		
		
		
		sc.close();
		
	}

}
