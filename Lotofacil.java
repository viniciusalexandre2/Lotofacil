import java.util.Scanner;
import java.util.Random;

public class Lotofacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char letraPremiada = 'V'; // Letra premiada 

        int opcao;
        do {
            System.out.println("\nMenu LOTOFÁCIL:");
            System.out.println("1. Apostar de 0 a 100");
            System.out.println("2. Apostar de A à Z");
            System.out.println("3. Apostar em par ou ímpar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numeroEscolhido = scanner.nextInt();
                    if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                        System.out.println("Aposta inválida.");
                    } else {
                        int numeroSorteado = random.nextInt(20);
                        if (numeroEscolhido == numeroSorteado) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite uma letra maiúscula ou minúscula de A à Z: ");
                    char letraEscolhida = Character.toUpperCase(scanner.next().charAt(0));
                    if (Character.isLetter(letraEscolhida)) {
                        if (letraEscolhida == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                        }
                    } else {
                        System.out.println("Aposta inválida tente novamente.");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numeroDigitado = scanner.nextInt();
                    if (numeroDigitado % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa. obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

