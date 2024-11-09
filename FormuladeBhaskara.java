import java.util.Scanner;

class formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os coeficientes da equação
        System.out.print("Informe o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor de c: ");
        double c = scanner.nextDouble();

        // Calcula o discriminante (delta)
        double delta = b * b - 4 * a * c;

        // Verifica se as raízes são reais
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            // Calcula as raízes
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Exibe os resultados
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}
