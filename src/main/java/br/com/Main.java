package br.com;




import br.com.calculadora.Calculadora;
import br.com.calculadora.Calculo;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDateTime dataAtual = LocalDateTime.now();
        String boasVindas;
        if(dataAtual.getHour() < 12 && dataAtual.getHour() > 5){
            boasVindas = "Bom dia , seja bem vindo a minha calculadora.";
        } else if (dataAtual.getHour() < 18 && dataAtual.getHour() > 12) {
            boasVindas = "Boa tarde, seja bem vindo a minha calculadora.";
        }else{
            boasVindas = "Boa noite, seja bem vindo a minha calculadora.";
        }
        System.out.println(boasVindas);
        while(true){
            System.out.println("Digite o numerador : ");
            double numerador = sc.nextDouble();
            System.out.println("Digite a operacao entre , * , / , + , - : ");
            char operation = sc.next().charAt(0);
            System.out.println("Digite o denominador : ");
            double denominador = sc.nextDouble();

            Calculadora calculadora = new Calculadora(numerador,denominador,operation);

            try{
                Calculo calculo = new Calculo(calculadora);
                System.out.println(calculo.calcular(operation));
                System.out.println("Se deseja finalizar o programa digite F para finalizar ou apenas de enter para calcular novamente.");
                String continuar = sc.next();
                if(continuar.equals("F")){
                    break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

        }
    }
}