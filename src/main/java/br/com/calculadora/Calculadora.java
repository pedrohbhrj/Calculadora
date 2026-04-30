package br.com.calculadora;

public class Calculadora {

    double num;
    double num2;
    double result;
    char operation;


    public Calculadora(double num, double num2,char operation) {
        this.num = num;
        this.num2 = num2;
        this.result = 0;
        this.operation = operation;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    protected double soma(){
        return num + num2;
    }
    protected double multiplicar(){
        return num * num2;
    }
    protected double dividir(){
        try{
            if(Double.isNaN(num / num2)){
                throw new ArithmeticException("Não pode dividir por zero.");
            }
            return num / num2;
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    protected double diminuir(){
        if(num < 0 && num2 < 0){
           return num + num2;
        }
        return num - num2;
    }

    public String calcular(char operation){

        String msg;

        switch (operation){
            case '*' -> msg = "A multiplicação resultou em : " + this.multiplicar();
            case '-' -> msg = "A subtração resultou em : " +this.diminuir();
            case '/' -> msg = "A divisão resultou em : " +this.dividir();
            case '+' -> msg = "A soma resultou em : " +this.soma();
            default -> throw new IllegalArgumentException("Caractere inválido tente outro.");
        }

        return msg;
    }
}
