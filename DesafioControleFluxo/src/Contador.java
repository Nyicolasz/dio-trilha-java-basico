import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();


        try {
            //chmando o método
            contar(parametroUm, parametroDois);

        }
        //Capturando um possivél erro
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro");

        }


    }

    //Criado o método "contar" que  o método lança uma exceção (throws)
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        //validando se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            //Lança a exeção
            throw new ParametrosInvalidosException();
        } else {

            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {

                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}