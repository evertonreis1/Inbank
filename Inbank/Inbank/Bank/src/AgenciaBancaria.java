import java.util.ArrayList;

public class AgenciaBancaria {
    private int AgencyNumber;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public AgenciaBancaria(int AgencyNumber) {
        this.AgencyNumber = AgencyNumber;
    }

    public int getAgencyNumber() {
        return AgencyNumber;
    }

    public void setAgencyNumber(int AgencyNumber) {
        this.AgencyNumber = AgencyNumber;
    }

    public void addContaBancaria(ContaBancaria conta) {
        contas.add(conta);
    }

    public void fazerDepositoConta(int numContaBancaria, float deposito) {
        contas.forEach(conta -> {
            if (conta.getNumeroConta() == numContaBancaria) {
                conta.depositoConta(deposito);
            }
        });
    }

    public void fazerSaqueConta(int numContaBancaria, float saque) {
        contas.forEach(conta -> {
            if (conta.getNumeroConta() == numContaBancaria) {
                conta.saqueConta(saque);
            }
        });
    }

}