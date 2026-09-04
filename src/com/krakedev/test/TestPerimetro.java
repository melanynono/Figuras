package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo("Rectangulo", "amarillo", 4, 5);
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
		
        
	}

}
