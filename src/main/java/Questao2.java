import java.util.Scanner;
import java.util.regex.Pattern;

public class Questao2 {
    private static final String DIGITO_PATTERN = "\\d";
    private static final String MINUSCULA_PATTERN = "[a-z]";
    private static final String MAIUSCULA_PATTERN = "[A-Z]";
    private static final String SIMBOLO_PATTERN = "[!@#$%^&*()\\-+]";
    private static final int QTD_CARACTERES = 6;

    public int run(String senha) {

        if (senha == null) {
            return QTD_CARACTERES;
        }

        int qtdTiposCaracteres = 0;

        if (!testarRegex(DIGITO_PATTERN, senha)) {
            qtdTiposCaracteres++;
        }
        if (!testarRegex(MINUSCULA_PATTERN, senha)) {
            qtdTiposCaracteres++;
        }
        if (!testarRegex(MAIUSCULA_PATTERN, senha)) {
            qtdTiposCaracteres++;
        }
        if (!testarRegex(SIMBOLO_PATTERN, senha)) {
            qtdTiposCaracteres++;
        }

        int qtdFaltaTamanho = Math.max(QTD_CARACTERES - senha.length(), 0);

        return Math.max(qtdFaltaTamanho, qtdTiposCaracteres);
    }

    public boolean testarRegex(String patternFormat, String teste) {
        Pattern pattern = Pattern.compile(patternFormat);
        return pattern.matcher(teste).find();
    }
}
