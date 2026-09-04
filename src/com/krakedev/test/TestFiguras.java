package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
		System.out.println(cuadrado);
		
		Triangulo triangulo = new Triangulo("Triangulo", "rojo", 5, 3, 7 ,2);
		System.out.println(triangulo);
	}

}
