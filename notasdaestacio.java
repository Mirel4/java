import java.util.Scanner;

class notasdaestacio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta as notas do aluno
        System.out.println("Digite a nota da Prova (AV): ");
        double notaProva = scanner.nextDouble();

        System.out.println("Digite a nota da Participação nos Fóruns (até 2,0): ");
        double notaFóruns = scanner.nextDouble();

        System.out.println("Digite a nota de AP (até 2,0): ");
        double notaAP = scanner.nextDouble();

        System.out.println("Digite a nota da AVS (até 10 pontos): ");
        double notaAVS = scanner.nextDouble();

        System.out.println("Digite a nota do Simulado (até 2,0): ");
        double notaSimulado = scanner.nextDouble();

        // Verificando a condição do Simulado
        boolean simuladoElegível = (notaProva >= 4.0 || notaAVS >= 4.0);

        if (simuladoElegível) {
            // Se o aluno for elegível para o Simulado, adiciona pontos extras
            System.out.println("O aluno é elegível para o Simulado, portanto, adicionando pontos extras...");
            notaSimulado = Math.min(notaSimulado, 2.0); // Limita a nota do simulado até 2,0
        } else {
            notaSimulado = 0; // Não pode somar ponto extra se não atingiu 4,0 na AV ou AVS
        }

        // Calculando a AVD (nota final baseada em AV, participação e AP)
        double notaAVD = (notaProva + notaFóruns + notaAP) / 3;

        // Verificando aprovação na Prova (AV)
        if (notaProva < 6.0) {
            System.out.println("Aluno reprovado na Prova (AV). Nota insuficiente.");
            return;
        }

        // Exibindo as notas
        System.out.println("Nota da Prova (AV): " + notaProva);
        System.out.println("Nota da Participação nos Fóruns: " + notaFóruns);
        System.out.println("Nota de AP: " + notaAP);
        System.out.println("Nota da AVS: " + notaAVS);
        System.out.println("Nota do Simulado: " + notaSimulado);

        // Calculando a nota final
        double notaFinal = notaAVD + notaAVS + notaSimulado;

        // Exibindo a nota final
        System.out.println("Nota Final do aluno: " + notaFinal);

        // Avaliação final
        if (notaFinal >= 6.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
