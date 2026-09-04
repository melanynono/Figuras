package com.krakedev.figuras;

public class Triangulo extends Figura {

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;

    // Constructor
    public Triangulo(String nombre, String color, int base, int altura, int ladoA, int ladoB) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public int calcularPerimetro() {
        return base + ladoA + ladoB;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}