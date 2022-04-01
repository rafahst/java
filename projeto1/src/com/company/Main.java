package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Double a,b,soma;
	// write your code here
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o 1º Valor");
        a=ler.nextDouble();
        System.out.println("Digite o 2º Valor");
        b=ler.nextDouble();
        soma=conTa(a,b);
        System.out.println("O valor da soma é: "+soma);
    }

    public static Double conTa(Double a, Double b){
       return (a+b);
    }
}
