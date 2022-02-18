import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Questao1Test {

    private Questao1 questao1;

    @BeforeEach
    void init() {
        questao1 = new Questao1();
    }

    @Test
    void test1() {
        Assertions.assertEquals("*\n", questao1.run(1));
    }

    @Test
    void test2() {
        Assertions.assertEquals(" *\n**\n", questao1.run(2));
    }

    @Test
    void test3() {
        Assertions.assertEquals("  *\n **\n***\n", questao1.run(3));
    }

    @Test
    void test0() {
        Assertions.assertEquals("", questao1.run(0));
    }
}
