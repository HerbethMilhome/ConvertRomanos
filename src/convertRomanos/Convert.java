package convertRomanos;

import java.util.Scanner;
import static java.util.Collections.nCopies;
import static java.lang.String.join;

public class Convert {

	private static final int[] DECIMAIS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public static String convertRomanos(int numero) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < DECIMAIS.length; i++) {
			int parteInteira = numero / DECIMAIS[i];
			if(parteInteira < 0 || parteInteira > 3) {
				return "Número inválido. Por favor informe um número entre 1 (zero) e 3999.";
			}
			numero -= DECIMAIS[i] * parteInteira;
			resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
		}
		return resultado.toString();
	}

	public static void main(String[] args) {

		System.out.println("Informe o número de 1 até 3999");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println(convertRomanos(numero));
		
	}

}
