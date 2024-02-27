
package javagiulia;
import javagiulia.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();//tem q criar uma lista de um objeto, n dá pra fazer lista de tipo primitivo
         while(true){
            System.out.println("Deseja cadastrar um funcionario? 1 - sim, 2 - não");//pergunta pro usuario se ele quer cadastrar um usuario e se repete enquanto while for true

            int resposta = new Scanner(System.in).nextInt();//cria um scanner novo pra resposta do ultimo sout
            if(resposta == 1){//if relacionado a resposta
                System.out.println("Digite o nome do funcionario");
                String nome = new Scanner(System.in).nextLine();//novo scanner
                System.out.println("Digite o salário do funcionario");
                double salario = new Scanner(System.in).nextDouble();
                Funcionario f = new Funcionario(nome, salario);//criou um objeto que vai receber um nome e um salario
                /*if(funcionario.size() ==3){
                    caso quisesse limitar a lista
                }*/
                funcionarios.add(f);
             }else if(resposta == 2){
                System.out.println("Deseja aumentar o salario de algum funcionario? 1 - sim, 2 - não");
                resposta = new Scanner(System.in).nextInt();
                if(resposta == 1){
                    System.out.println("Digite o nome do funcionario que receberá o aumento");
                    String nome = new Scanner(System.in).nextLine();
                    boolean achei = false;
                    for (Funcionario funcionario : funcionarios) {//cria um objeto que assume o valor de cada objeto q tá na lista, na primeira rodada ele vai assumir a primeira posição e assim sucessivamente
                        if(funcionario.getNome().equals(nome)){
                            achei = true;
                            System.out.println("Digite o percentual de aumento");
                            double perc= new Scanner(System.in).nextDouble();
                            funcionario.aumentar(perc);
                            System.out.println("aumento concedido, o salario de"
                                    + funcionario.getNome() + "agora é " 
                                    + funcionario.getSalario());
                            break;
                        }
                    }if (!achei){
                        System.out.println("Funcionario não encontrado");
                    }
                }else{
                    break;
                }
            }else{
                 System.out.println("Opção inválida");
             }
         }
    }
}
