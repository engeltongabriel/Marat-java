package academy.devdojo.maratonajava.intoducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // casting forçar um numero em um primitivo( em alguns casos não vai caber e vai trazer valores quebrados)
        //trazemos o casting entre () igual exemplo abaixo colocando um Long em um inteiro
        int age = (int)4000000000000000L;
        long bigNumber = 610000L;
        double paymentDouble = 15000.0;
        float paymentFloat = 14000.0F;
        byte ageByte = -128;
        short ageShort = 32000;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        char caractere = '\u8841';
        String nome = "Goku";

        System.out.println("The age is "+age+" years");
        System.out.println(trueBoolean);
        System.out.println("char "+caractere);
        System.out.println("Oi meu nome é "+nome);
    }
}