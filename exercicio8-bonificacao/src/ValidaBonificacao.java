import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidaBonificacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionarios que deseja cadastrar: ");
        int qtdFuncionario = sc.nextInt();

        for(int i = 1; i <= qtdFuncionario; i++){
            Funcionario funcionario = new Funcionario();
            System.out.println("Insira o nome do funcionário nº " + i);
            System.out.println("Nome: ");
            funcionario.setNome(sc.next());
            System.out.println("Salario: ");
            funcionario.setSalario(sc.nextDouble());

            funcionarios.add(funcionario);
        }

        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).getNome());
            System.out.println(funcionarios.get(i).getSalario());
            System.out.println();
        }


    }
}