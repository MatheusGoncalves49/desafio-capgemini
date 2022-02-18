import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class Questao2Test {

    private Questao2 questao2;

    @BeforeEach
    void init() {
        questao2 = new Questao2();
    }

    @ParameterizedTest
    @CsvSource({"a,5", "ab,4", "test,3", "123456,3", "test123,2", "Ya3,3", "TEST@,2", "Test123,1", "Test123@,0"})
    void shouldTest (String input, Integer expected) {
        Assertions.assertEquals(expected, questao2.run(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shoulTestNullEmpty(String input) {
        Assertions.assertEquals(6, questao2.run(input));
    }
}
