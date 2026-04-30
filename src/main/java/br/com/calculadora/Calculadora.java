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

    private double soma(){
        return num + num2;
    }
    private double multiplicar(){
        return num * num2;
    }
    private double dividir(){
        try{
            if(num2 == 0){
                throw new ArithmeticException("Não pode dividir por zero.");
            }
            return num / num2;
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    private double diminuir(){
        return num - num2;
    }

    public String calcular(char operation){

        String msg;

        switch (operation){
            case '*' -> {
                double result = this.multiplicar();
                this.setResult(result);
                msg = "A multiplicação resultou em : " + this.getResult();
            }
            case '-' -> {
                double result = this.diminuir();
                this.setResult(result);
                msg = "A subtração resultou em : " + this.getResult();
            }
            case '/' -> {
                double result = this.dividir();
                this.setResult(result);
                msg = "A divisão resultou em : " + this.getResult();
            }
            case '+' -> {
                double result = this.soma();
                this.setResult(result);
                msg = "A soma resultou em : " + this.getResult();
            }
            default -> throw new IllegalArgumentException("Caractere inválido tente outro.");
        }

        return msg;
    }
}
