package academy.devdojo.maratonajava.javacore.Aintroducaclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade =140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo );
    }
}
