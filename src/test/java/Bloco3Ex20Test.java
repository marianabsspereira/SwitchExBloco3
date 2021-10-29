import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Ex20Test {

    @Test
    void classificaNumeroTeste1() {
        String expected = "Número perfeito";
        String result = Bloco3Ex20.classificaNumero(6);
        assertEquals(expected,result);
    }
    @Test
    void classificaNumeroTeste2() {
        String expected = "Número abundante";
        String result = Bloco3Ex20.classificaNumero(12);
        assertEquals(expected,result);
    }
    @Test
    void classificaNumeroTeste3() {
        String expected = "Número reduzido";
        String result = Bloco3Ex20.classificaNumero(9);
        assertEquals(expected,result);
    }
    @Test
    void classificaNumeroTeste4() {
        String expected = "Número reduzido";
        String result = Bloco3Ex20.classificaNumero(10);
        assertEquals(expected,result);
    }
    @Test
    void classificaNumeroTeste5() {
        String expected = "Número perfeito";
        String result = Bloco3Ex20.classificaNumero(1);
        assertEquals(expected,result);
    }
    @Test
    void classificaNumeroTeste6() {
        String expected = "Número perfeito";
        String result = Bloco3Ex20.classificaNumero(-6);
        assertEquals(expected,result);
    }
}