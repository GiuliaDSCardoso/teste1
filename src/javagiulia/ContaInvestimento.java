
import java.util.Random;
import java.util.Scanner;

public class ContaInvestimento {
    private int nConta;
    private String nomeTitular;
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(int nConta, String nomeTitular, double taxaJuros) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        this.taxaJuros = taxaJuros;
    }

    public int getnConta() {
        return nConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }
    
    public void adicioneJuros(){
        saldo += (saldo * taxaJuros)/100;
    }
    
    public static void main(String[] args) {
        System.out.println("Digite o nome do titular");
        String nome = new Scanner(System.in).nextLine();
        int numero = new Random().nextInt(100000, 999999);
        ContaInvestimento c1 = new ContaInvestimento(numero, nome, 10);
        c1.depositar(1000);
        System.out.println("O saldo da conta é "+ c1.getSaldo());
        for (int i = 0; i < 5; i++) {
            c1.adicioneJuros();
            System.out.println("O saldo da conta é "+ c1.getSaldo());
        }
    }
}
