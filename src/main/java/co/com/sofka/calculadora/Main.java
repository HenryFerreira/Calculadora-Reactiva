package co.com.sofka.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.add.applyAsInt(25, 8));
        System.out.println(calculadora.sustract.applyAsInt(12, 2));
        System.out.println(calculadora.mult.applyAsInt(5, 5));//20
        System.out.println(calculadora.divisionEntera.apply(50, 5));//2
    }
}
