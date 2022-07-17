package com.app.java;

import com.retangulo.java.*;
import java.util.Scanner;
import java.util.Locale;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		// cria abstração da classe
		RetanguloMath rectangle = new RetanguloMath();
		
		System.out.println(" **** Calculo de medidas do retângulo **** \n");
		System.out.println("Informe a base do retângulo: ");
		rectangle.width = sc.nextFloat();
		
		System.out.println("Informe a altura do rêtangulo: ");
		rectangle.height = sc.nextFloat();
		
		
		System.out.printf("Área: %.2f%n", rectangle.area());
		System.out.printf("Perimetro: %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal:  %.2f%n", rectangle.diagonal());
		sc.close();
	}

}
