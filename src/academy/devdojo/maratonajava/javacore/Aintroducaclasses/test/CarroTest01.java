package academy.devdojo.maratonajava.javacore.Aintroducaclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Vectra";
        carro1.modelo = "Sedan";
        carro1.ano = 2008;

        carro2.nome = "Compass";
        carro2.modelo = "SUV";
        carro2.ano = 2022;

        System.out.println("Estamos aqui: ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("--------------------------------------------");
        System.out.println("Em breve vamos chegar aqui: ");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
