
import java.util.Scanner;
import javagiulia.Funcionario;

public class Teste1 {
    public static void main(String[] args) {//String virou um array [] p/ conter todos os nomes dos 3 funcionarios
        Funcionario[] funcionarios = new Funcionario[3];//a Classe Funcionarios agora pode receber tres objetos(funcionarios)(criou um vetor)
        while(true){
            System.out.println("Deseja cadastrar um funcionario? 1 - sim, 2 - não");//pergunta pro usuario se ele quer cadastrar um usuario e se repete enquanto while for true

            int resposta = new Scanner(System.in).nextInt();//cria um scanner novo pra resposta do ultimo sout
            if(resposta == 1){//if relacionado a resposta
                System.out.println("Digite o nome do funcionario");
                String nome = new Scanner(System.in).nextLine();//novo scanner
                System.out.println("Digite o salário do funcionario");
                double salario = new Scanner(System.in).nextDouble();
                Funcionario f = new Funcionario(nome, salario);//criou um objeto que vai receber um nome e um salario
                boolean cheio = true;//criou um valor boleano pra controlar o vetor(array) que inicialmente recebe true pois entende que está cheio
                for (int i = 0; i < funcionarios.length; i++) {//criou um for pra adicionar os cadastros(o length le o tamanho do vetor no caso 3.
                    if(funcionarios[i] == null){//vai começar da posição inicial e checar se estão vazios, ou null, caso estejam, ele muda o valor de cheio pra false
                        funcionarios[i] = f;//coloca o objeto(f) na posição i da array(vetor)
                        System.out.println("Funcionario cadastrado!");
                        cheio = false;
                        break;
                    }
                } if(cheio){//o java já entende que cheio == true
                    System.out.println("Não foi possível cadastrar");
                }
            } else if(resposta == 2){
                System.out.println("Deseja aumentar o salario de algum funcionario? 1 - sim, 2 - não");
                resposta = new Scanner(System.in).nextInt();
                if(resposta == 1){
                    System.out.println("Digite o nome do funcionario que receberá o aumento");
                    String nome = new Scanner(System.in).nextLine();
                    boolean achei = false;//pra achar o funcionario dentro da array
                    for (int i = 0; i < funcionarios.length; i++) {
                        if(funcionarios[i].getNome().equals(nome)){
                            achei = true;
                            System.out.println("Digite o percentual de aumento");
                            double perc= new Scanner(System.in).nextDouble();
                            funcionarios[i].aumentar(perc);
                            System.out.println("aumento concedido, o salario de"
                                    + funcionarios[i].getNome() + "agora é " 
                                    + funcionarios[i].getSalario());
                            break;
                        }
                    } if (!achei){
                        System.out.println("Funcionario não encontrado");
                    }
                } else {
                    break;
                }
                
            } else {
                System.out.println("Opção inválida");
            }
            
        }
    }
}