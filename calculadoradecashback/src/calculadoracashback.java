public class calculadoracashback {

    public static void main(String[] args) {
        String nome = "Mirela";
        int idade = 18;
        double valorCompra = 1500.00;

        double cashback = calculadoradecashback(idade, valorCompra);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor da Compra: R$ " + valorCompra);
        System.out.println("Cashback: R$ " + cashback);
    }

    public static double calculadoradecashback(int idade, double valorCompra) {
        double percentualCashback;

        if (idade >= 21 && valorCompra < 1000) {
            percentualCashback = 0.05;
        } else if (idade < 21 && valorCompra < 1000) {
            percentualCashback = 0.07;
        } else if (idade >= 21 && valorCompra >= 1000) {
            percentualCashback = 0.07;
        } else {
            percentualCashback = 0.10;
        }

        return valorCompra * percentualCashback;
    }
}
