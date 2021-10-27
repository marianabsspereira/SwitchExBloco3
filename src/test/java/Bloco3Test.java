import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco3Test {

    // ex 1 bloco 3 testes
    @Test
    void produtorioTeste1() {
        int expected = 6;
        int result = Bloco3.produtorio(3);
        assertEquals(expected,result);
    }
    @Test
    void produtorioTeste2() {
        int expected = 362880;
        int result = Bloco3.produtorio(9);
        assertEquals(expected,result);
    }
    // ex 4 bloco 3 testes
    @Test
    void multiplosAteste1() {
        String expected = " 6; 9;"; //msg = msg + " " + i + ";";
        String result = Bloco3.multiplosA(5,10);
        assertEquals(expected,result);
    }
    @Test
    void multiplosBteste1() {
        String expected = " 6; 9;"; //msg = msg + " " + i + ";";
        String result = Bloco3.multiplosB(3,5,10);
        assertEquals(expected,result);
    }
    @Test
    void multiplosCteste1() {
        //" 6; 9;" | " 5; 10;"//"Multiplos de 3: " + multiplosDe3 + "Multiplos de 5: " + multiplosDe5;
        String expected = "Multiplos de 3:  6; 9;Multiplos de 5:  5; 10;";
        String result = Bloco3.multiplosC(5,10);
        assertEquals(expected,result);
    }
    @Test
    void multiplosDteste1() {
        //" 6; 9;" | " 5; 10;"//"Multiplos de: " + num1 + multiplos1 + "Multiplos de: " + num2 + multiplos2;
        String expected = "Multiplos de: 3 6; 9;Multiplos de: 5 5; 10;";
        String result = Bloco3.multiplosD(3,5,5,10);
        assertEquals(expected,result);
    }
    @Test
    void multiplosEteste1() {
        int expected = 30;
        int result = Bloco3.multiplosE(3,5,5,10);
        assertEquals(expected,result);
    }
    // ex 5 bloco 3 testes
    @Test
    void somaParesAteste1() {
        int expected = 30;
        int result = Bloco3.somaParesA(0,10);
        assertEquals(expected,result);
    }
    @Test
    void contaParesBteste1() {
        int expected = 6;
        int result = Bloco3.contaParesB(0,10);
        assertEquals(expected,result);
    }
    @Test
    void somaImparesCteste1() {
        int expected = 25;
        int result = Bloco3.somaImparesC(0,10);
        assertEquals(expected,result);
    }
    @Test
    void contaImparesDteste1() {
        int expected = 5;
        int result = Bloco3.contaImparesD(0,10);
        assertEquals(expected,result);
    }
    @Test
    void somaMultiplosEteste1() {
        int expected = 15;
        int result = Bloco3.somaMultiplosE(5,5,10);
        assertEquals(expected,result);
    }
    @Test
    void somaMultiplosEteste2() {
        int expected = 15;
        int result = Bloco3.somaMultiplosE(5,10,5);
        assertEquals(expected,result);
    }
    @Test
    void somaMultiplosEteste3() {
        int expected = 5;
        int result = Bloco3.somaMultiplosE(5,5,5);
        assertEquals(expected,result);
    }
    @Test
    void produtorioMultiplosFteste1() {
        int expected = 50;
        int result = Bloco3.produtorioMultiplosF(5,5,10);
        assertEquals(expected,result);
    }
    @Test
    void produtorioMultiplosFteste2() {
        int expected = 50;
        int result = Bloco3.produtorioMultiplosF(5,10,5);
        assertEquals(expected,result);
    }
    @Test
    void produtorioMultiplosFteste3() {
        int expected = 5;
        int result = Bloco3.produtorioMultiplosF(5,5,5);
        assertEquals(expected,result);
    }
    @Test
    void produtorioMultiplosFteste4() {
        int expected = 1;
        int result = Bloco3.produtorioMultiplosF(5,1,4);
        assertEquals(expected,result);
    }
    @Test
    void mediaMultiplosGteste1() {
        double expected = 7.5;
        double result = Bloco3.mediaMultiplosG(5,0,10);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosGteste2() {
        double expected = 7.5;
        double result = Bloco3.mediaMultiplosG(5,10,0);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosGteste3() {
        double expected = 5;
        double result = Bloco3.mediaMultiplosG(5,5,5);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosGteste4() {
        double expected = 0;
        double result = Bloco3.mediaMultiplosG(5,1,4);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosDe2numHteste1() {
        double expected = 6.6;
        double result = Bloco3.mediaMultiplosDe2numH(3,5,1,10);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosDe2numHteste2() {
        double expected = 6.6;
        double result = Bloco3.mediaMultiplosDe2numH(3,5,10,1);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaMultiplosDe2numHteste3() {
        double expected = 5;
        double result = Bloco3.mediaMultiplosDe2numH(3,5,5,5);
        assertEquals(expected,result,0.1);
    }
    // ex 6 bloco 3 testes
    @Test
    void numeroAlgarismosAteste1() {
        int expected = 3;
        int result = Bloco3.numeroAlgarismosA(123);
        assertEquals(expected,result);
    }
    @Test
    void numeroAlgarismosAteste2() {
        int expected = 6;
        int result = Bloco3.numeroAlgarismosA(123586);
        assertEquals(expected,result);
    }
    @Test
    void numeroAlgarismosAteste3() {
        int expected = 6;
        int result = Bloco3.numeroAlgarismosA(-123586);
        assertEquals(expected,result);
    }
    @Test
    void numeroAlgarismosAteste4() {
        int expected = 1;
        int result = Bloco3.numeroAlgarismosA(0);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste1() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(123);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste2() {
        int expected = 2;
        int result = Bloco3.contaAlgarismosParesB(1234);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste3() {
        int expected = 3;
        int result = Bloco3.contaAlgarismosParesB(12346);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste4() {
        int expected = 3;
        int result = Bloco3.contaAlgarismosParesB(123467);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste5() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(12);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste6() {
        int expected = 0;
        int result = Bloco3.contaAlgarismosParesB(1);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste7() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(2);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste8() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(21);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste9() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(-21357);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosParesBteste10() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosParesB(0);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste1() {
        int expected = 2;
        int result = Bloco3.contaAlgarismosImparesC(123);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste2() {
        int expected = 2;
        int result = Bloco3.contaAlgarismosImparesC(1234);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste3() {
        int expected = 2;
        int result = Bloco3.contaAlgarismosImparesC(12346);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste4() {
        int expected = 3;
        int result = Bloco3.contaAlgarismosImparesC(123467);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste5() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosImparesC(12);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste6() {
        int expected = 0;
        int result = Bloco3.contaAlgarismosImparesC(0);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste7() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosImparesC(1);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste8() {
        int expected = 1;
        int result = Bloco3.contaAlgarismosImparesC(12);
        assertEquals(expected,result);
    }
    @Test
    void contaAlgarismosImparesCteste9() {
        int expected = 4;
        int result = Bloco3.contaAlgarismosImparesC(-21357);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosDteste1() {
        int expected = 7;
        int result = Bloco3.somaAlgarismosD(223);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosDteste2() {
        int expected = 7;
        int result = Bloco3.somaAlgarismosD(3121);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosDteste3() {
        int expected = 0;
        int result = Bloco3.somaAlgarismosD(0);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosDteste4() {
        int expected = 1;
        int result = Bloco3.somaAlgarismosD(-1);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosParesEteste1() {
        int expected = 6;
        int result = Bloco3.somaAlgarismosParesE(234);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosParesEteste2() {
        int expected = 8;
        int result = Bloco3.somaAlgarismosParesE(2342);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosParesEteste3() {
        int expected = 0;
        int result = Bloco3.somaAlgarismosParesE(0);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosParesEteste4() {
        int expected = 6;
        int result = Bloco3.somaAlgarismosParesE(-156);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosImparesFteste1() {
        int expected = 6;
        int result = Bloco3.somaAlgarismosImparesF(-156);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosImparesFteste2() {
        int expected = 0;
        int result = Bloco3.somaAlgarismosImparesF(0);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosImparesFteste3() {
        int expected = 8;
        int result = Bloco3.somaAlgarismosImparesF(52483);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosImparesFteste4() {
        int expected = 1;
        int result = Bloco3.somaAlgarismosImparesF(1);
        assertEquals(expected,result);
    }
    @Test
    void somaAlgarismosImparesFteste5() {
        int expected = 4;
        int result = Bloco3.somaAlgarismosImparesF(13);
        assertEquals(expected,result);
    }
    @Test
    void mediaAlgarismosGteste1() {
        double expected = 2.0;
        double result = Bloco3.mediaAlgarismosG(13);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosGteste2() {
        double expected = 2.5;
        double result = Bloco3.mediaAlgarismosG(14);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosGteste3() {
        double expected = 0;
        double result = Bloco3.mediaAlgarismosG(0);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosParesHteste1() {
        double expected = 3.0;
        double result = Bloco3.mediaAlgarismosParesH(124);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosParesHteste2() {
        double expected = 4.7;
        double result = Bloco3.mediaAlgarismosParesH(1482);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosParesHteste3() {
        double expected = 4;
        double result = Bloco3.mediaAlgarismosParesH(-4);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosImparesIteste1() {
        double expected = 0;
        double result = Bloco3.mediaAlgarismosImparesI(-4);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosImparesIteste2() {
        double expected = 3;
        double result = Bloco3.mediaAlgarismosImparesI(453168);
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaAlgarismosImparesIteste3() {
        double expected = 0;
        double result = Bloco3.mediaAlgarismosImparesI(2468);
        assertEquals(expected,result,0.1);
    }
    @Test
    void inverteAlgarismosJteste1() {
        long expected = 789;
        long result = Bloco3.inverteAlgarismosJ(987);
        assertEquals(expected,result);
    }
    @Test
    void inverteAlgarismosJteste2() {
        long expected = 4965;
        long result = Bloco3.inverteAlgarismosJ(5694);
        assertEquals(expected,result);
    }
    @Test
    void inverteAlgarismosJteste3() {
        long expected = 21;
        long result = Bloco3.inverteAlgarismosJ(12);
        assertEquals(expected,result);
    }
    @Test
    void inverteAlgarismosJteste4() {
        long expected = 1;
        long result = Bloco3.inverteAlgarismosJ(1);
        assertEquals(expected,result);
    }
}