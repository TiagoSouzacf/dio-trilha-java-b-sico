import java.time.LocalDateTime;

public class Mensagem {

    LocalDateTime horaAtual;
    LocalDateTime dia;
    LocalDateTime tarde;
    LocalDateTime noite;

    public static String mensagemBomDia(LocalDateTime horaAtual) {

        return "Bom dia";
    }

}
