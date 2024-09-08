package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ohms = sc.nextLine();
        double value;

        String[] valueSpliter = ohms.split(" ");
        String valueString = valueSpliter[0];


        if (valueString.endsWith("k")) {
            value = Double.parseDouble(valueString.replace("k", "")) * 1000;
            convertResistors(value);
        } else if (valueString.endsWith("M")) {
            value = Double.parseDouble(valueString.replace("M", "")) * 1000000;
            convertResistors(value);
        } else {
            value = Double.parseDouble(valueString);
            convertResistors(value);
        }

    }

    public static void convertResistors(double value){
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "preto");
        colors.put(1, "marrom");
        colors.put(2, "vermelho");
        colors.put(3, "laranja");
        colors.put(4, "amarelo");
        colors.put(5, "verde");
        colors.put(6, "azul");
        colors.put(7, "violeta");
        colors.put(8, "cinza");
        colors.put(9, "branco");

        double pow = Math.pow(10, Math.floor(Math.log10(value)) - 1);
        int first = (int) (value / pow) / 10;
        int second = (int) (value / pow) % 10;
        int multiplier = (int) Math.log10(value) - 1;

        String result = colors.get(first) + " " +
                colors.get(second) + " " +
                colors.get(multiplier) + " " +
                "dourado";

        System.out.println(result);

    }


}