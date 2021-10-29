import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex18Test {
    // valores do CC nos testes não são reais. Com nº reais funciona
    @Test
    void validaCCteste1() {
        boolean expected = true;
        boolean result = Bloco3Ex18.validaCC(12345678,1);
        assertEquals(expected,result);
    }
    @Test
    void validaCCteste2() {
        boolean expected = true;
        boolean result = Bloco3Ex18.validaCC(12345678,1);
        assertEquals(expected,result);
    }
}