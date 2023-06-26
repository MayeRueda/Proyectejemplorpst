import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSuma(){
        System.out.println("suma");
        double num1=7;
        double num2=5;
        Calculadora cal=new Calculadora(num1,num2);
        double esperado=12;
        double resultado=cal.suma();
        assertEquals(esperado, resultado,0.0);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion.");
        double num1 = 3;
        double num2 = 4;
        Calculadora cal = new Calculadora(num1, num2);
        double esperado = 12;
        double resultado = cal.multiplicacion();
        assertEquals(esperado, resultado,0.0);
    }

    @Test
    public void testResta() {
        System.out.println("Prueba del método resta.");
        double num1 = 10;
        double num2 = 7;
        Calculadora cal = new Calculadora(num1, num2);
        double esperado = 3;
        double resultado = cal.resta();
        assertEquals(esperado, resultado,0.0);
    }

    @Test
    public void testDivision() {
        System.out.println("Prueba del método división.");
        double num1 = 15;
        double num2 = 3;
        Calculadora cal = new Calculadora(num1, num2);
        double esperado = 5;
        double resultado = cal.division();
        assertEquals(esperado, resultado,0.0);}

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero(){
        System.out.println("Prueba de la division por cero ");
        double num1=10;
        double num2=0;
        Calculadora cal2=new Calculadora(num1, num2);
        cal2.division();}
}