public class Questao1 {
    public String run (int qtdCaracteres) {

        StringBuilder result = new StringBuilder();

        for (int linha=1; linha <= qtdCaracteres; linha++ ){
            for (int i=1; i<=qtdCaracteres; i++) {
                if (i <= (qtdCaracteres-linha)) {
                    result.append(" ");
                }
                else {
                    result.append("*");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
