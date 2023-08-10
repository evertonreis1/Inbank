public class ContaBancaria {
    // encapsulados 
    private String Titular;
    private int numeroConta;
    private float Saldo; 

    public ContaBancaria(int numeroConta, String Titular, float Saldo) {
        this.Titular = Titular;
        this.numeroConta = numeroConta;
        this.Saldo = Saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return Titular;
    }

    public float getSaldo() {
        return Saldo;
    }

     public void setTitular(String Titular) {
        this.Titular = Titular;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

   

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public void depositoConta(float deposito) {
        if (deposito >= 0) {
            Saldo += deposito;
            System.out.println("Novo saldo: " + Saldo);
        } else {
            System.out.println("Informe um depósito válido");
        }

    }

    public void saqueConta(float saque) {
        if (saque > Saldo) {
            System.out.println("Valor indisponível na conta. Saldo da conta: " + Saldo);
        } else {
            Saldo -= saque;
            System.out.println("Saque efetuado com sucesso. Saldo atual da conta: " + Saldo);
        }
    }
}