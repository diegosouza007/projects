package programa;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args){
		
		String palavra;
				
		Palindromo palindromo = new Palindromo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para saber se ela � um PAL�NDROMO: ");
		palavra = scan.nextLine();
		
		palindromo.setPalavra(palavra);
		palindromo.mostraResultado();
		
	}

}
