package decisao;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		double num1, num2;
		double resultado = 0;
		String op;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real: ");
		num1 = in.nextDouble();
		
		System.out.print("Digite outro n�mero real: ");
		num2 = in.nextDouble();
		
		in.nextLine();
		
		System.out.print("Digite a opera��o matem�tica (+ - * /): ");
		op = in.nextLine();
					
		if (op.equals("+")) {
			resultado = num1 + num2;
		}else
		if (op.equals("-")) {
			resultado = num1 - num2;
		}else
		if (op.equals("*")) {
			resultado = num1 * num2;
		}else
		if (op.equals("/")) {
			resultado = num1 / num2;
		}
		
		System.out.println("Resultado da opera��o: " + resultado);
		
		in.close();
	}
}
