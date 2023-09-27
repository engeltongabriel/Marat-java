package academy.devdojo.maratonajava.javacore.Aintroducaclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("estudante = " + estudante.nome);
        System.out.println("idade = " + estudante.idade);
        System.out.println("sexo = " + estudante.sexo);

    }
}
