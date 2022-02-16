import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        //Perguntas
        List<String> perguntas = new ArrayList<>();


        //Respostas
        List<String> respostas = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        System.out.println(" Compass quiz");


        System.out.println();
        System.out.print("Insira seu nome: ");
        usuario.setNome(sc.next());


        int qtdPerguntas = 0;

        String resposta;

        System.out.println("Bem vindo, " + usuario.getNome() + "!");


        do{

            qtdPerguntas++;

        }while(qtdPerguntas < perguntas.size());


        System.out.println("+------------------------+");
        System.out.println("| Usuario: " + usuario.getNome() );
        System.out.println("+------------------------+");
        System.out.println("| Acertos: " + usuario.getAcertos() );
        System.out.println("+------------------------+");
        System.out.println("| Erros: " + usuario.getErros() );
        System.out.println("+------------------------+");

    }

}
