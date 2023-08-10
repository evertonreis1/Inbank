public class App {
    public static void main(String[] args) {
        ContaBancaria cont1 = new ContaBancaria(1, "tiquinho soares", 200000);
        ContaBancaria cont2 = new ContaBancaria(2, "adryelson", 311111);
        ContaBancaria cont3 = new ContaBancaria(3, "Everton", 890765);
        ContaBancaria cont4 = new ContaBancaria(4, "Seedorf", 500000);

        AgenciaBancaria agencia1 = new AgenciaBancaria(123);
        agencia1.addContaBancaria(cont1);
        agencia1.addContaBancaria(cont2);

        AgenciaBancaria agencia2 = new AgenciaBancaria(321);
        agencia2.addContaBancaria(cont3);
        agencia2.addContaBancaria(cont4);

        
        agencia1.fazerSaqueConta(1, 6000);
        agencia1.fazerSaqueConta(1, 300000);
        agencia2.fazerDepositoConta(4, 200000);
        agencia2.fazerDepositoConta(3, 3000);
        agencia2.fazerSaqueConta(3, 3000);
    }
}