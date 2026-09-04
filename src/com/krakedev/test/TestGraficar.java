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
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "blanco");
		Triangulo triangulo = new Triangulo("Triangulo", "rojo");
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "amarillo");
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(triangulo);
		graficador.graficar(rectangulo);
	}

}
