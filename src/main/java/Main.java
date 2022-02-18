import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        executaQuestao1 ();
//        executaQuestao2 ();
//        executaQuestao3 ();
    }

    public static void executaQuestao1 () {
        System.out.println("Executando questão 1:");

        Scanner scanner = new Scanner(System.in);
        int qtdCaracteres = 0;

        do {
            System.out.println("Informe a quantidade de caracteres: ");
            qtdCaracteres = scanner.nextInt();
            if (qtdCaracteres < 1) {
                System.out.println("Valor inválido. Por favor informe um número maior que 0.");
            }
        } while (qtdCaracteres < 1);

        Questao1 questao1 = new Questao1();
        System.out.println(questao1.run(qtdCaracteres));

        System.out.println("Fim execução questão 1\n");
    }

    public static void executaQuestao2 () {
        System.out.println("Executando questão 2:");

        Questao2 questao2 = new Questao2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();
        System.out.println(questao2.run(senha));

        System.out.println("Fim execução questão 2\n");
    }

    public static void executaQuestao3 () {
        System.out.println("Executando questão 3:");

        Questao3 questao = new Questao3();
        System.out.println(questao.run("ovo"));

        System.out.println("Fim execução questão 3\n");
    }
}
