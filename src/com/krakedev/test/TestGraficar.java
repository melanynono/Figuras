package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graficador graficador = new Graficador();
		Figura figura = new Figura("Circulo", "verde");
		Figura cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
		Figura triangulo = new Triangulo("Triangulo", "rojo");
		Figura rectangulo = new Rectangulo("Rectangulo", "amarillo", 4, 5);
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(triangulo);
		graficador.graficar(rectangulo);
	}

}
