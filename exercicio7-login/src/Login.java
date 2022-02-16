import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Login {

    public static void main(String[] args) {

        List<String> login = new ArrayList<>();
        List<String> senha = new ArrayList<>();

        Date dataHoraAtual = new Date();

        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);

        int horaNumero = Integer.parseInt(hora);

        if(horaNumero >= 6 && horaNumero < 12){
            System.out.println("Bom dia,você se logou ao nosso sistema.");
        }else if(horaNumero >= 12 && horaNumero < 16){
            System.out.println("Boa tarde,você se logou ao nosso sistema.");
        }else if(horaNumero >= 18 && horaNumero < 24){
            System.out.println("Boa noite,você se logou ao nosso sistema.");
        }else if(horaNumero >= 0 && horaNumero < 6){
            System.out.println("Boa madrugada,você se logou ao nosso sistema.");
        }



    }

}
