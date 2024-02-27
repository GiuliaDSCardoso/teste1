
package javagiulia;
import java.util.Scanner;
public class Funcionario {
   
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentar(double perc) {
        double sal = salario * (perc / 100.0); // Fixed to use double division
        salario += sal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
        int loop = 1;


        Funcionario user = new Funcionario(" ", 0.0);

        while (loop == 1) {
            System.out.println("--------------Menu------------");
            System.out.println("1-Nome e salario.");
            System.out.println("2-Mostrar informacoes.");
            System.out.println("3-Aumentar salario.");
            System.out.println("4-Sair");
            op = s.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Insira o nome do funcionario: ");
                    String p = new Scanner(System.in).nextLine();
                    user.setNome(p);
                    System.out.println("Insira o salario atual do funcionario: ");
                    double sal = new Scanner(System.in).nextDouble();
                    user.setSalario(sal);
                }

                case 2 -> {
                    System.out.println("Nome: " + user.getNome());
                    System.out.println("Salario: " + user.getSalario());
                }

                case 3 -> {
                    System.out.println("Insira o percentual sem '%' de aumento: ");
                    int perc = s.nextInt();
                    user.aumentar(perc);
                }

                case 4 -> {
                    System.out.println("Saindo...");
                    loop = 0;
                }

                default -> System.out.println("Error");
            }
        }
    }
}
 
