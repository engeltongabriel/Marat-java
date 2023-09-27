package academy.devdojo.maratonajava.intoducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 1000
        for (int i = 1; i <= 1_000_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}