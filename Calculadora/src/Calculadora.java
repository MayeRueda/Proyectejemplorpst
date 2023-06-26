public class Calculadora {
    double num1;
    double num2;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double suma (){
        return num1 + num2;

    }
    public double resta (){
        return num1 - num2;

    }
    public double multiplicacion (){
        return num1 * num2;

    }
    public double division (){
        if(num2 == 0){
            throw new IllegalArgumentException();
        }
        return num1 / num2;

    }
}


