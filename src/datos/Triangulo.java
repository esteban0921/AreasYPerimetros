package datos;

import UI.Operador;

public abstract class Triangulo extends Forma implements Operador {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado1;
    }

    public Triangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado2;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esTriangulo() {
        return ((this.getLado1() + this.getLado2()) > this.getLado3())
                && ((this.getLado1() + this.getLado3()) > this.getLado2())
                && ((this.getLado2() + this.getLado3()) > this.getLado1());
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (this.calcularPerimetro() / 2);
        return Math.sqrt((s * (s - this.getLado1()) * (s - this.getLado2()) * (s - this.getLado3())));
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado1() + this.getLado2() + this.getLado3();
    }

    @Override
    public String toString() {
        return "Forma: Triangulo\nLado 1: " + this.getLado1() + "\nLado 2: " + this.getLado2() + "\nLado 3: " + this.getLado3();
    }

}
