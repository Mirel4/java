public class calculadoracashback {

    public static void main(String[] args) {
        String nome = "João";
        int idade = 21;
        double valorCompra = 1000.00;

        double cashback = calculadoradecashback(idade, valorCompra);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor da Compra: R$ " + valorCompra);
        System.out.println("Cashback: R$ " + cashback);
    }

    public static double calculadoradecashback(int idade, double valorCompra) {
        double percentualCashback = 0;

        if (idade >= 21 && valorCompra < 1000) {
            percentualCashback = 1.05;
        } else if (idade < 21 && valorCompra < 1000) {
            percentualCashback = 0.07;
        } else if (idade >= 21 && valorCompra >= 1000) {
            percentualCashback = 0.07;
        } else if (idade < 21 && valorCompra >= 1000) {
            percentualCashback = 0.10;
        }

        return valorCompra * percentualCashback;
    }
}
