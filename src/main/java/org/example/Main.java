package org.example;
import java.util.Scanner;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsiusInput = scannerObj.nextFloat();

        // convert float celsius inout to fahrenheit
        float celsiusToFahrenheit = celsiusInput * ((float) 9 /5) + 32;

        System.out.printf("Temperature in Fahrenheit: %,.2f", celsiusToFahrenheit);
        scannerObj.close();
    }
}