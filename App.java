package ru.app;

import ru.calculator.Calculator;
import ru.calculator.CalculatorProvider;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringFromConsole = sc.nextLine();

        String[] input = stringFromConsole.split(" "); // Делаем из строки массив -> Пример: "1 + 3".split(" ") = ["1", "+", "3"]
        if (input.length != 3) {
            throw new IllegalArgumentException("Invalid string format");
        }

        CalculatorProvider calculatorProvider = new CalculatorProvider();

        //в зависимости от того какие числа пришли, CalculatorProvider отдаст нам нужный калькулятор
        Calculator calculator = calculatorProvider.getCalculator(input);

        String result = calculator.calculate(input);
        System.out.println(result);
    }
}
