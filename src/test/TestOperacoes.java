package test;

import Model.Operacoes;
import junit.framework.Test;
import junit.framework.TestCase;

public class TestOperacoes extends TestCase implements Test {


    public void testSoma(){
        int valorResultante;
        int valorEsperado = 9;

        valorResultante = Operacoes.soma(3, 6);
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.soma(6, 6);
        valorEsperado=12;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.soma(10, 5);
        valorEsperado=15;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.soma(110, 5);
        valorEsperado=115;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.soma(999, 1);
        valorEsperado=1000;
        assertEquals(valorEsperado, valorResultante,0);
    }


    public void testMultiplicao() {

        int valorEsperado;

        int valorResultante = Operacoes.multiplicacao(5, 5);
        valorEsperado=25;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.multiplicacao(6, 6);
        valorEsperado=36;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.multiplicacao(7, 7);
        valorEsperado=49;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.multiplicacao(9, 8);
        valorEsperado=72;
        assertEquals(valorEsperado, valorResultante,0);

    }

    public void testDivisao(){
        double valorEsperado;

        double valorResultante = Operacoes.divisao(5, 5);
        valorEsperado=1d;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.divisao(6, 5);
        valorEsperado=1.2d;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.divisao(7, 2);
        valorEsperado=3.5d;
        assertEquals(valorEsperado, valorResultante,0);
        valorResultante = Operacoes.divisao(9, 8);
        valorEsperado=1.125d;
        assertEquals(valorEsperado, valorResultante,0);
    }
}
