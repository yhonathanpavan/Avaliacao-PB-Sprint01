import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        //Perguntas
        List<String> perguntas = new ArrayList<>();
        perguntas.add("O que a pomba branca simboliza?");
        perguntas.add("Qual o sétimo mês do ano?");
        perguntas.add("Norte, sul, leste e...?");
        perguntas.add("Qual é o maior animal terrestre vivo conhecido?");

        //Respostas
        List<String> respostas = new ArrayList<>();
        respostas.add("paz");
        respostas.add("julho");
        respostas.add("oeste");
        respostas.add("elefante");

        Scanner sc = new Scanner(System.in);

        System.out.println("                                                       (_)    ");
        System.out.println("   ___ ___  _ __ ___  _ __   __ _ ___ ___    __ _ _   _ _ ____");
        System.out.println("  / __/ _ \\| '_ ` _ \\| '_ \\ / _` / __/ __|  / _` | | | | |_  /");
        System.out.println(" | (_| (_) | | | | | | |_) | (_| \\__ \\__ \\ | (_| | |_| | |/ / ");
        System.out.println("  \\___\\___/|_| |_| |_| .__/ \\__,_|___/___/  \\__, |\\__,_|_/___|");
        System.out.println("                     | |                       | |            ");
        System.out.println("                     |_|                       |_|  ");


        System.out.println();
        System.out.print("Insira seu nome: ");
        usuario.setNome(sc.next());


        int qtdPerguntas = 0;

        String resposta;

        System.out.println("Bem vindo, " + usuario.getNome() + "!");


        do{
            System.out.println();
            System.out.println("Pergunta nº " + (qtdPerguntas + 1) + ": ");
            System.out.println(perguntas.get(qtdPerguntas));
            System.out.print("resposta: ");
            resposta = sc.next();

            if(resposta.equals(respostas.get(qtdPerguntas))){
                System.out.println("Parabens!!");
                usuario.acertouPergunta();

            }else{
                System.out.println("Errou!");
                System.out.println("A resposta correta é: " + respostas.get(qtdPerguntas));
                usuario.errouPergunta();
            }

            qtdPerguntas++;

        }while(qtdPerguntas < perguntas.size());

        System.out.println();
        System.out.println("+------------------------+");
        System.out.println("| Usuario: " + usuario.getNome() );
        System.out.println("+------------------------+");
        System.out.println("| Acertos: " + usuario.getAcertos() );
        System.out.println("+------------------------+");
        System.out.println("| Erros: " + usuario.getErros() );
        System.out.println("+------------------------+");

    }

}
