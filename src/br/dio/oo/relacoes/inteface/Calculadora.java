package br.dio.oo.relacoes.inteface;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double n1, double n2) {
        System.out.println("Soma: "+(n1+n2));
    }

    @Override
    public void sub(double n1, double n2) {
        System.out.println("Subtração: "+(n1-n2));
    }

    @Override
    public void mult(double n1, double n2) {
        System.out.println("Multiplicação: "+(n1*n2));
    }

    @Override
    public void div(double n1, double n2) {
        System.out.println("Divisão: "+(n1/n2));
    }
}
