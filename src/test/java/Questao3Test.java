import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class Questao3Test {

    private Questao3 questao3;

    @BeforeEach
    void init() {
        questao3 = new Questao3();
    }

    @ParameterizedTest
    @CsvSource({"ovo,2", "ifailuhkqq,3", "abba,4", "abcd,0"})
    void shouldTest (String input, Integer expected) {
        Assertions.assertEquals(expected, questao3.run(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shoulTestNullEmpty(String input) {
        Assertions.assertEquals(0, questao3.run(input));
    }
}
