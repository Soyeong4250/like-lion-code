package calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);
        cal.plus();  // 30
        cal.minus();  // 10
        cal.multiple();  // 200
        cal.divide();  // 0
        cal.divide2();  // 0.5
    }

}
