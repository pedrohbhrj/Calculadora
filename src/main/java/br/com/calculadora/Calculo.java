package br.com.calculadora;

public class Calculo {

    private Calculadora calculadora;

    public Calculo(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public String calcular(char operation){

        String msg;

        switch (operation){
            case '*' -> {
                double result = getCalculadora().multiplicar();
                getCalculadora().setResult(result);
                msg = "A multiplicação resultou em : " + getCalculadora().getResult();
            }
            case '-' -> {
                double result = getCalculadora().diminuir();
                getCalculadora().setResult(result);
                msg = "A subtração resultou em : " + getCalculadora().getResult();
            }
            case '/' -> {
                double result = getCalculadora().dividir();
                getCalculadora().setResult(result);
                msg = "A divisão resultou em : " + getCalculadora().getResult();
            }
            case '+' -> {
                double result = getCalculadora().soma();
                getCalculadora().setResult(result);
                msg = "A soma resultou em : " + getCalculadora().getResult();
            }
            default -> throw new IllegalArgumentException("Caractere inválido tente outro.");
        }

        return msg;
    }
}
