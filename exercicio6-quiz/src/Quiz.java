import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    //Usuarios
    static List<Usuario> usuarios = new ArrayList<>();
    static List<String> perguntas = new ArrayList<>();
    static List<String> respostas = new ArrayList<>();
    //Scanner
    static Scanner sc = new Scanner(System.in);
    static int indexUsuario = 0;

    public static void main(String[] args){

        //Perguntas
        perguntas.add("O que a pomba branca simboliza?");
        perguntas.add("Qual o sétimo mês do ano?");
        perguntas.add("Norte, sul, leste e...?");
        perguntas.add("Qual é o maior animal terrestre vivo conhecido?");

        //Respostas
        respostas.add("paz");
        respostas.add("julho");
        respostas.add("oeste");
        respostas.add("elefante");

        logoCompassQuiz();

        int opcaoMenu;

        do {

            exibirMenu();
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    responderPerguntas();
                    break;

                case 2:
                    verRecordes();
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.printf("Opção inválida!");
                    System.out.println("\n");
                    break;
            }


        } while (opcaoMenu != 3);
        System.exit(1);
    }

    public static void logoCompassQuiz(){
        System.out.println("                                                       (_)    ");
        System.out.println("   ___ ___  _ __ ___  _ __   __ _ ___ ___    __ _ _   _ _ ____");
        System.out.println("  / __/ _ \\| '_ ` _ \\| '_ \\ / _` / __/ __|  / _` | | | | |_  /");
        System.out.println(" | (_| (_) | | | | | | |_) | (_| \\__ \\__ \\ | (_| | |_| | |/ / ");
        System.out.println("  \\___\\___/|_| |_| |_| .__/ \\__,_|___/___/  \\__, |\\__,_|_/___|");
        System.out.println("                     | |                       | |            ");
        System.out.println("                     |_|                       |_|  ");
    }

    public static void exibirMenu(){
        System.out.println("****** Menu ******");
        System.out.println("1. Responder Perguntas");
        System.out.println("2. Ver recordes");
        System.out.println("3. Sair");
        System.out.print("Opção: ");
    }

    public static void responderPerguntas(){

        Usuario usuarioAtual;
        String perguntaAtual;
        String respostaAtual;
        Usuario usuario = new Usuario();
        usuarios.add(usuario);

        usuarioAtual = usuarios.get(indexUsuario);

        System.out.println();
        System.out.print("Insira seu nome: ");
        usuarios.get(indexUsuario).setNome(sc.next());

        int i = 0;

        System.out.println("Bem vindo, " + usuarioAtual.getNome() + "!");


        do {
            perguntaAtual = perguntas.get(i);
            respostaAtual = respostas.get(i);

            System.out.println();
            System.out.println("Pergunta nº " + (i + 1) + ": ");
            System.out.println(perguntaAtual);
            System.out.print("resposta: ");
            String respostaInserida = sc.next().toLowerCase();

            if (respostaInserida.equals(respostaAtual)) {
                System.out.println("Parabens!!");
                usuarioAtual.acertouPergunta();

            } else {
                System.out.println("Errou!");
                System.out.println("A resposta correta é: " + respostaAtual);
                usuarioAtual.errouPergunta();
            }
            i++;

        } while (i < perguntas.size());

        System.out.println();
        System.out.println("+------------------------+");
        System.out.println("| Usuario: " + usuarioAtual.getNome());
        System.out.println("+------------------------+");
        System.out.println("| Acertos: " + usuarioAtual.getAcertos());
        System.out.println("+------------------------+");
        System.out.println("| Erros: " + usuarioAtual.getErros());
        System.out.println("+------------------------+");
        System.out.println();
        indexUsuario++;
    }

    public static void verRecordes(){
        System.out.println();
        int recorde = 0;
        for(int i = 0; i < usuarios.size(); i++){
            System.out.println("+------------------------------------------------------");
            System.out.println("| Jogador: " + usuarios.get(i).getNome() + " -> Pontuação: " + usuarios.get(i).getAcertos());
            if(usuarios.get(i).getAcertos() > recorde){
                recorde = usuarios.get(i).getAcertos();
            }
        }
        System.out.println("+------------------------------------------------------");
        System.out.println("| Pontuação máxima no quiz: " + recorde);
        System.out.println("+------------------------------------------------------");
        System.out.println();
    }

}
