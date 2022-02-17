import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        //Usuarios
        List<Usuario> usuarios = new ArrayList<>();


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


        int opcaoMenu;
        int indexUsuario = 0;
        Usuario usuarioAtual;

        do {
            System.out.println("****** Menu ******");
            System.out.println("1. Responder Perguntas");
            System.out.println("2. Ver recordes");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    Usuario usuario = new Usuario();
                    usuarios.add(usuario);

                    usuarioAtual = usuarios.get(indexUsuario);

                    System.out.println();
                    System.out.print("Insira seu nome: ");
                    usuarios.get(indexUsuario).setNome(sc.next());

                    int qtdPerguntas = 0;

                    String resposta;

                    System.out.println("Bem vindo, " + usuarioAtual.getNome() + "!");


                    do {
                        System.out.println();
                        System.out.println("Pergunta nº " + (qtdPerguntas + 1) + ": ");
                        System.out.println(perguntas.get(qtdPerguntas));
                        System.out.print("resposta: ");
                        resposta = sc.next().toLowerCase();

                        if (resposta.equals(respostas.get(qtdPerguntas))) {
                            System.out.println("Parabens!!");
                            usuarioAtual.acertouPergunta();

                        } else {
                            System.out.println("Errou!");
                            System.out.println("A resposta correta é: " + respostas.get(qtdPerguntas));
                            usuarioAtual.errouPergunta();
                        }
                        qtdPerguntas++;

                    } while (qtdPerguntas < perguntas.size());

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
                    break;

                case 2:
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

                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    System.exit(1);
                    break;

                default:
                    System.out.printf("Opção inválida!");
                    System.out.println("\n");
                    break;
            }


        } while (opcaoMenu != 3);

    }

}
