import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Login {

    static Date dataHoraAtual = new Date();
    static Scanner sc = new Scanner(System.in);
    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;
        do {

            exibirMenuPrincipal();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    users.add(criarConta());
                    break;

                case 2:

                    fazerLogin();

                    break;

                case 3:
                    System.out.println("Finalizando Sistema...");

                default:
                    System.out.println("opcao invalida! \n");
                    break;
            }

        } while (opcao != 3);
        System.exit(1);

    }

    public static void exibirMenuPrincipal(){
        String horaTotal = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        System.out.println("\n------------------------------------------");
        System.out.println("  Bem vindo(a)!  | Hora Atual: " + horaTotal);
        System.out.println("------------------------------------------");
        System.out.println("1. Criar conta");
        System.out.println("2. Fazer login");
        System.out.println("3. Sair");
    }
    
    public static User criarConta(){
        User user = new User();
        System.out.print("Insira seu login de usuario: ");
        user.setLogin(sc.next());
        System.out.print("Insira sua senha: ");
        user.setSenha(sc.next());

        return user;
    }

    public static void fazerLogin() {

        if(users.size() == 0){
            System.out.println("Nenhum usuário cadastrado! Por favor, realize o cadastro e faça o login.");
        }
        else{

        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
        int horaEmNumero = Integer.parseInt(hora);

        System.out.print("Login: ");
        String loginInformado = sc.next();

        System.out.print("Senha: ");
        String senhaInformada = sc.next();

        String loginUsuario;
        String senhaUsuario;


            for (int i = 0; i < users.size(); i++) {

                loginUsuario = users.get(i).getLogin();
                senhaUsuario = users.get(i).getSenha();

                if (loginInformado.equals(loginUsuario) && senhaInformada.equals(senhaUsuario)) {

                    if (horaEmNumero >= 6 && horaEmNumero < 12) {
                        System.out.println("Bom dia,você se logou ao nosso sistema.");
                    } else if (horaEmNumero >= 12 && horaEmNumero < 18) {
                        System.out.println("Boa tarde,você se logou ao nosso sistema.");
                    } else if (horaEmNumero >= 18 && horaEmNumero < 24) {
                        System.out.println("Boa noite,você se logou ao nosso sistema.");
                    } else if (horaEmNumero >= 0 && horaEmNumero < 6) {
                        System.out.println("Boa madrugada,você se logou ao nosso sistema.");
                    }

                }
            }
        }
    }


}
