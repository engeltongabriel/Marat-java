package academy.devdojo.maratonajava.javacore.Bintroducametodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducametodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma CalculadoraTest01 ");

        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtracao CalculadoraTest01 ");

    }
}
