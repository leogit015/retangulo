package application;

import java.util.Locale;
import java.util.Scanner;

import rectangle.retangulo;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		retangulo ret = new retangulo();
		
		System.out.println("Dados do retangulo");
		System.out.print("Altura: ");
		ret.altura = sc.nextDouble();
		System.out.print("Largura: ");
		ret.largura = sc.nextDouble();
		
		
		System.out.printf("Area = %.2f%n", ret.Area());
		System.out.printf("Perimetro = %.2f%n", ret.Perimetro());
		System.out.printf("Diagonal = %.2f%n", ret.Diagonal());
		
		
		
		
		
		
		
		
		sc.close();

	}

}
