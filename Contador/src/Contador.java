import java.util.Scanner;

public class Contador {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmentro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmentro: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        terminal.close();

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
        int contagem = parametro2 - parametro1;
        for(int i = 1; i <=contagem; i++){
            System.out.println("Imprimindo o número" + i);
        }
    }
}
