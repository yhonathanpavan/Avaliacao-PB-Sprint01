import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        //Logins
        List<String> login = new ArrayList<>();
        login.add("admin");

        //Senhas
        List<String> senha = new ArrayList<>();
        senha.add("1234");

        Date dataHoraAtual = new Date();

        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);

        int horaNumero = Integer.parseInt(hora);

        Scanner sc = new Scanner(System.in);


        System.out.println("  Bem vindo(a)!  ");
        System.out.println("-----------------");
        System.out.print("Login: ");
        String user = sc.next();

        System.out.print("Senha: ");
        String password = sc.next();


        for(int i = 0; i < login.size(); i++) {

            if (user.equals(login.get(i)) && password.equals(senha.get(i))) {

                if (horaNumero >= 6 && horaNumero < 12) {
                    System.out.println("Bom dia,você se logou ao nosso sistema.");
                } else if (horaNumero >= 12 && horaNumero < 18) {
                    System.out.println("Boa tarde,você se logou ao nosso sistema.");
                } else if (horaNumero >= 18 && horaNumero < 24) {
                    System.out.println("Boa noite,você se logou ao nosso sistema.");
                } else if (horaNumero >= 0 && horaNumero < 6) {
                    System.out.println("Boa madrugada,você se logou ao nosso sistema.");
                }

            }

        }


    }

}
