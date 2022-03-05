package sovos.calculadora.main;

import sovos.calculadora.main.divisao.Divisao;
import sovos.calculadora.main.multiplicaçao.Multiplicaçao;
import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtraçao.Subtraçao;

import java.util.Set;

public class Calculadora {
    public static void main(String[] args) {
        int soma;

        Soma somatoria = new Soma();
        System.out.println("-> Soma");
        somatoria.setNum1(7);
        somatoria.setNum2(3);
        somatoria.somarVal();
        System.out.println("Resultado da soma de atributos é :" + somatoria.getResult());
        somatoria.somarVal(1, 1);
        System.out.println("Resultado da soma por paramentros é :" + somatoria.getResult());
        System.out.println("Resultado da soma de paramentro e atributo é :" + somatoria.somarVal(1));
        System.out.println("");

        Calculadora calculadora = new Calculadora();
        System.out.println(">>>> Subtração:");
        System.out.println("Resultado da Subtração por Atributos é: "+ calculadora.getSubAtr(7, 2));
        System.out.println("Resultado da Subtração por Parametros é: "+ calculadora.getSubParam(4, 2));
        System.out.println("Resultado da Subtração por Parametros e Atributos é: "+ calculadora.getSubParamAtr(4));
        System.out.println("");

        calculadora = new Calculadora();
        System.out.println(">>>> Divisão:");
        System.out.println("Resultado da divisao por Atributos é: "+ calculadora.getDivAtr(20, 2));
        System.out.println("Resultado da divisao por Parametros é: "+ calculadora.getDivParam(30, 3));
        System.out.println("Resultado da divisao por Parametros e Atributos é: "+ calculadora.getDivParamAtr(22));
        System.out.println("");

        calculadora = new Calculadora();
        System.out.println(">>>> Multiplicação: ");
        System.out.println("Resultado da multiplicação por Atributos é: "+ calculadora.getMultAtr(5, 1));
        System.out.println("Resultado da multiplicação por Parametros é: "+ calculadora.getMultParam(5, 2));
        System.out.println("Resultado da multiplicação por Parametros e Atributos é: "+ calculadora.getMultParamAtr(4));
        System.out.println("");
    }

// SUB METHOD

    private int getSubAtr(int x, int y) {
        Subtraçao sub = new Subtraçao();
        sub.setNum1(x);
        sub.setNum2(y);
        sub.subitrair();
        return sub.getResult();
    }

    private int getSubParam(int x, int y) {
        Subtraçao sub = new Subtraçao();
        sub.subitrair(x, y);
        return sub.getResult();
    }

    private int getSubParamAtr(int x) {
        Subtraçao sub = new Subtraçao();
        sub.setNum2(1);
        return sub.subitrair(x);
    }


// DIVISAO METHOD

    private int getDivAtr(int x, int y) {

        Divisao divisao = new Divisao();
        divisao.setNum1(x);
        divisao.setNum2(y);
        divisao.divise();
        return divisao.getResult();
    }

    private int getDivParam(int x, int y) {
        Divisao divisao = new Divisao();
        divisao.divise(x, y);
        return divisao.getResult();
    }

    private int getDivParamAtr(int x) {
        Divisao divisao = new Divisao();
        divisao.setNum2(11);
        return divisao.divise(x);
    }

// MULTIPLICAÇAO METHOD

    private int getMultAtr(int x, int y) {
        Multiplicaçao multip = new Multiplicaçao();
        multip.setNum1(x);
        multip.setNum2(y);
        multip.mult();
        return multip.getResult();
    }

    private int getMultParam(int x, int y) {
        Multiplicaçao multip = new Multiplicaçao();
        multip.mult(x, y);
        return multip.getResult();
    }

    private int getMultParamAtr(int x) {
        Multiplicaçao multip = new Multiplicaçao();
        multip.setNum2(4);
        return multip.mult(x);
    }
}



















 /*   int resultado;
        Calculadora minhaCauculadora = new Calculadora();
        resultado = minhaCauculadora.num2 + minhaCauculadora.num9;
        System.out.println("O resultado da soma é: " + resultado);
        minhaCauculadora = new Calculadora(2, 4, 10);
        resultado = minhaCauculadora.num3 - minhaCauculadora.num1 - minhaCauculadora.num7;
        System.out.println("O resultado da subtração é: " + resultado);
        minhaCauculadora = new Calculadora();
        resultado = minhaCauculadora.num3 * minhaCauculadora.num9;
        System.out.println("O resultado da multiplicação é: " + resultado);
        minhaCauculadora = new Calculadora(10, 2);
        resultado = minhaCauculadora.num4 / minhaCauculadora.num8;
        System.out.println("O resultado da divisão é: " + resultado);
        minhaCauculadora = new Calculadora();
        minhaCauculadora.setnum2(50);
        minhaCauculadora.setnum5(45);
        minhaCauculadora.setnum6(5);
        resultado = minhaCauculadora.num2 + minhaCauculadora.num5 + minhaCauculadora.num6;
        System.out.println("O resultado da soma utilizando set é: " + resultado); */