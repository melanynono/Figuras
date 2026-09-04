package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graficador graficador = new Graficador();
		Figura cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
		Figura rectangulo = new Rectangulo("Rectangulo", "amarillo", 4, 5);
		Figura trianguloR = new TrianguloRectangulo("Triángulo rectangulo","rosado",3,4);
		Figura triangulo = new Triangulo("Triangulo", "gris", 5, 3, 7 ,2);
		Figura hexagono = new Hexagono("Hexagono", "tomate", 5);

		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(trianguloR);
		graficador.graficar(triangulo);
		graficador.graficar(hexagono);
	}

}
