import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Created by sergey on 03.03.17
 */
public class SimpleTest {

    @Test
    void expectingArithmeticException(){
        Assertions.assertThrows(ArithmeticException.class, this::divideByZero);
    }

    private int divideByZero() {
        return 3/0;
    }
}
