package pro.sky.calculator;

import pro.sky.calculator.exception.DevideByZero;

public class CalculatorServices {
    public String calcPlus (Integer num1, Integer num2) {
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }

    public String calcMinus (Integer num1, Integer num2) {
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }

    public String calcMultiply (Integer num1, Integer num2) {
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }

    public String calcDevide (Integer num1, Integer num2) {
        if (num2.equals(0)) throw new DevideByZero();
        else {
            int num3 = num1 / num2;
            return num1 + " / " + num2 + " = " + num3;}
    }
}