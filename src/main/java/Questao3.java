import java.util.Arrays;
import java.util.HashMap;

public class Questao3 {

    public int run (String str) {

        if (str == null)
            return 0;

        HashMap<String, Integer> substrings = new HashMap<>();
        int tamanho = str.length();

        for (int i=0; i <= tamanho; i++){
            for (int j = i+1; j <= tamanho; j++) {
                char[] substring = str.substring(i, j).toCharArray();

                Arrays.sort(substring);
                String ordenada = new String(substring);

                if (substrings.containsKey(ordenada)){
                    substrings.put(ordenada, substrings.get(ordenada) + 1);
                }
                else {
                    substrings.put(ordenada, 1);
                }
            }
        }

        return substrings.values().stream()
                .map(valor -> valor * (valor-1) / 2)
                .mapToInt(i -> i).sum();
    }
}
