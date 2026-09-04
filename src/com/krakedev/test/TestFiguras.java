package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Figura figura = new Figura("Circulo", "verde");
		System.out.println(figura);
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
		System.out.println(cuadrado);
		
		Triangulo triangulo = new Triangulo("Triangulo", "rojo");
		System.out.println(triangulo);
	}

}
