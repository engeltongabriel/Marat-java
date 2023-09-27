package academy.devdojo.maratonajava.intoducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 25_000;
        double taxaPerBracket;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 9.70/100;
        double terceiraFaixa = 9.70/100;

        if (salario <= 34_712){
            taxaPerBracket = salario * primeiraFaixa;
        }else if (salario > 34_712 && salario <= 68_507){
            taxaPerBracket = salario * segundaFaixa;
        }else{
            taxaPerBracket = salario * terceiraFaixa;
        }

        System.out.println("Você deve pagar " + taxaPerBracket + " de impostos");
    }
}
