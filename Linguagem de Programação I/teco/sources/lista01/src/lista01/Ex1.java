package lista01;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a1, a2, a3;
		int l1, l2, l3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira os �ngulos do seu tri�ngulo: ");
		a1 = in.nextInt();
		a2 = in.nextInt();
		a3 = in.nextInt();
		
		System.out.println("Insira os lados do tri�ngulo: ");
		l1 = in.nextInt();
		l2 = in.nextInt();
		l3 = in.nextInt();
		
		System.out.println("Classifica��o do triangulo: ");
		if((a1 == 90) || (a2 == 90) || (a3 == 90)) {
			System.out.println("Ret�ngulo.");
		} else if(a1 > 90 || a2 > 90 || a3 > 90) {
			System.out.println("Obtus�ngulo.");
		} else {
			System.out.println("Acut�ngulo.");
		}
		
		if (l1 == l2 && l2 == l3 && l3 == l1) {
			System.out.println("Equil�tero.");
		} else if ((l1 == l2) || (l2 == l3) || (l3 == l1)) {
			System.out.println("Is�sceles.");
		} else {
			System.out.println("Escaleno.");
		}
		
		in.close();
		
	}

}
