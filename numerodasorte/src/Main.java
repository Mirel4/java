import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomizacao = new Random();
        String continuar;

        // Arte ASCII para dar um toque especial
        System.out.println("****************************************");
        System.out.println("*       BEM-VINDO AO NÚMERO DA SORTE   *");
        System.out.println("****************************************");
        System.out.println();

        // Capturar o nome do usuário
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Vamos começar o jogo.\n");

        // Loop do jogo principal
        do {
            int numeroSorte = randomizacao.nextInt(100); // Randomiza um número entre 0 e 99
            int tentativas = 0;
            int chute;
            boolean acertou = false;

            System.out.println("Um número da sorte entre 0 e 99 foi gerado. Tente adivinhar!");

            // Loop para as tentativas do usuário
            while (!acertou) {
                System.out.print("Digite o seu palpite: ");
                chute = scanner.nextInt();
                tentativas++;

                if (chute == numeroSorte) {
                    System.out.println("Parabéns, " + nome + "! Você acertou o número da sorte em " + tentativas + " tentativa(s)!");
                    acertou = true;
                } else if (chute < numeroSorte) {
                    System.out.println("O número da sorte é maior que " + chute + ". Tente novamente.");
                } else {
                    System.out.println("O número da sorte é menor que " + chute + ". Tente novamente.");
                }
            }

            // Pergunta se o usuário deseja continuar jogando
            System.out.print("Deseja jogar novamente? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nObrigado por jogar! Até a próxima, " + nome + "!");
        scanner.close();
    }
}
