package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double menor = 0 ;
		int i = 0;
		double porcento = 0.0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[]nome = new String[n];
		int[]idade = new int[n];
		double[]altura = new double[n];
		sc.nextLine();
		for(i=0;n!=0;n--) {
			
			System.out.println("Dados da "+(i+1)+"ª "+"pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			if(idade[i]<16) {
				menor++;
			}
			i++;
			}
		
		porcento = (menor/idade.length)*100;
		
		System.out.println("Pessoas com menos de 16 anos: "+porcento+"%");
		
		//O problema esta daqui pra baixo
		int m = (int)menor;
		for(i=0;i!=m;i++) {
			if(idade[i]<16) {
				System.out.println(nome[i]);
				
			}
			
		}
}
}
