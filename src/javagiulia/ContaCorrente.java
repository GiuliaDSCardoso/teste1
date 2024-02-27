
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {
    
    private int nConta;
    private String nomeTitular;
    private double saldo;

    public ContaCorrente(int nConta, String nomeTitular) {
        this.nConta = nConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
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
    
    public static void main(String[] args) {
        System.out.println("Digite o nome do titular");
        String nome = new Scanner(System.in).nextLine();
        int numero = new Random().nextInt(100000, 999999);
        ContaCorrente c1 = new ContaCorrente(numero, nome);
        System.out.println("Digite o quanto deseja depositar");
        double valor = new Scanner(System.in).nextDouble();
        c1.depositar(valor);
        System.out.println("O saldo da conta é " + 
                String.format("%.2f", c1.getSaldo()));
        System.out.println("Digite o quanto deseja sacar");
        valor = new Scanner(System.in).nextDouble();
        c1.sacar(valor);
        System.out.println("O saldo da conta é " +
                String.format("%.2f", c1.getSaldo()));
    }
    
    
}
