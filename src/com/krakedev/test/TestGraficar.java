package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graficador graficador = new Graficador();
		Figura figura = new Figura("Figura", "verde");
		Figura cuadrado = new Cuadrado("Cuadrado", "blanco", 2);
		Figura rectangulo = new Rectangulo("Rectangulo", "amarillo", 4, 5);
		Figura trianguloR = new TrianguloRectangulo("Triángulo rectangulo","rosado",3,4);
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(trianguloR);
	}

}
