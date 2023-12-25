package zadatak17;

import java.util.Scanner;

public class Parni_Brojevi {



	

		public static void main(String[] args) {
			int a;
	        System.out.println("| ZADACA - DOMASNO |");
	        System.out.println("| Vnesi broevi koi ke bidat vo nizata: ");
	        try (Scanner tastatura = new Scanner(System.in)) {
				int[] Niza = new int[5];
				for (a = 0; a < Niza.length; a++) {
				    Niza[a] = tastatura.nextInt();
				

				int sumOfEvenNumbers = 0;

				for (int Broj : Niza) {
				    if (Broj % 2 == 0) {
				        sumOfEvenNumbers += Broj;
				    }
				}
				System.out.println("Vkupniot zbir na parni broevi e: " + sumOfEvenNumbers);
   }
			}
	}

}

