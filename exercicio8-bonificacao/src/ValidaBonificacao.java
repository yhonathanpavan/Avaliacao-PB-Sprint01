import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ValidaBonificacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        String nomeInformado;
        double salarioInformado;

        System.out.print("Informe a quantidade de funcionarios que deseja cadastrar: ");
        int qtdFuncionario = sc.nextInt();


        for(int i = 1; i <= qtdFuncionario; i++){
            System.out.println("\nInsira o nome do funcionário nº " + i);
            System.out.print("Nome: ");
            sc.nextLine(); //apenas para remover o "enter" da entrada anterior.
            nomeInformado = sc.nextLine();
            System.out.print("Salario: ");
            salarioInformado = sc.nextDouble();

            Funcionario funcionario = new Funcionario(nomeInformado, salarioInformado);
            funcionarios.add(funcionario);
        }

        System.out.println();
        Funcionario funcionarioAtual;

        for(int i = 0; i < funcionarios.size(); i++){
            funcionarioAtual = funcionarios.get(i);
            System.out.println("+--------------------------------------------");
            System.out.println("| Nome: " +  funcionarioAtual.getNome());
            System.out.println("| Salário: R$" + funcionarioAtual.getSalario());

            if(funcionarios.get(i).getSalario() > 2000){
                System.out.println("| Desconto: R$" + funcionarioAtual.getDesconto());
            }else {
                System.out.println("| Bônus: R$" + funcionarioAtual.getBonus());
            }
            System.out.println("| Salário Líquido: R$" + funcionarioAtual.getSalarioLiquido());
            System.out.println("+--------------------------------------------");
            System.out.println();
        }


    }
}
