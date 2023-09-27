package academy.devdojo.maratonajava.intoducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // resto da divisão %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <=  >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDez);

        // &&(AND)  ||(or)  !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // =    +=   -=  *=  /=   %=
        double bonus = 1800; //1800
        bonus += 1000;  //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;
        contador++;
contador--;
++contador;
--contador;
        System.out.println(contador);

    }
}
