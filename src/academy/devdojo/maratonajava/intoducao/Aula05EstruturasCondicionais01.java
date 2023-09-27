package academy.devdojo.maratonajava.intoducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;

        boolean isAutorizadoComprarBedida = idade >= 18;
        if (isAutorizadoComprarBedida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        // ! negação
        if (!isAutorizadoComprarBedida) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }






    }
}
