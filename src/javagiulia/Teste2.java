
import java.util.Random;
import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        ContaCorrente[] banco = new ContaCorrente[3];
        while (true) {
            System.out.println("Digite 1 para criar uma conta"
                    + "\nDigite 2 para logar");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1) {
                System.out.println("Digite o nome do titular");
                String nome = new Scanner(System.in).nextLine();
                int numero = new Random().nextInt(100000, 999999);
                ContaCorrente c1 = new ContaCorrente(numero, nome);
                boolean cheio = true;
                for (int i = 0; i < banco.length; i++) {
                    if (banco[i] == null) {
                        banco[i] = c1;
                        System.out.println("Conta criada com sucesso!"
                                + "\n O numero da conta é " + numero);
                        cheio = false;
                        break;
                    }
                }
                if (cheio) {
                    System.out.println("Não foi possível criar a conta");
                }
            } else if (resposta == 2) {
                System.out.println("Digite seu nome e o numero da conta");
                String nome = new Scanner(System.in).nextLine();
                int numero = new Scanner(System.in).nextInt();
                boolean achei = false;
                for (int i = 0; i < banco.length; i++) {
                    if (banco[i].getNomeTitular().equals(nome)
                            && banco[i].getnConta() == numero) {
                        achei = true;
                        System.out.println("Logado com sucesso");
                        boolean logado = true;
                        while (logado) {
                            System.out.println("Digite 1 para depositar"
                                    + "\n2 para sacar"
                                    + "\n3 para deslogar");
                            resposta = new Scanner(System.in).nextInt();
                            if (resposta == 1) {
                                System.out.println("Digite o valor do depósito");
                                double valor = new Scanner(System.in).nextDouble();
                                banco[i].depositar(valor);
                                System.out.println("Depósito realizado"
                                        + "\n o saldo agora é: "
                                        + banco[i].getSaldo());
                            } else if (resposta == 2) {
                                System.out.println("Digite o valor do saque");
                                double valor = new Scanner(System.in).nextDouble();
                                banco[i].sacar(valor);
                                System.out.println("Saque realizado"
                                        + "\n o saldo agora é: "
                                        + banco[i].getSaldo());
                            } else {
                                logado = false;
                            }
                        }
                        break;
                    }
                }
                if (!achei) {
                    System.out.println("Conta não encontrado");
                }

            } else {
                System.out.println("opção inválida");
                break;
            }
        }
    }
}
