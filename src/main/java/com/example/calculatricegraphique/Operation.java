package com.example.calculatricegraphique;

import java.util.*;

public class Operation {


    double addition(double a, double b) {
        return a + b;
    }

    double soustraction(double a, double b)
    {
        return a - b;
    }

    double multiplication(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Stop pour la division par zéro.");
        }
        return a / b;
    }

    // NOUVELLE MÉTHODE
    double eval(String exp) {

        exp = exp.replace(" ", "").replace(",", ".");

        List<Double> nombres = new ArrayList<>();
        List<Character> ops = new ArrayList<>();

        StringBuilder nombre = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                nombre.append(c);
            } else {
                // gérer nombre négatif
                if (nombre.length() == 0 && c == '-') {
                    nombre.append(c);
                } else {
                    nombres.add(Double.parseDouble(nombre.toString()));
                    nombre.setLength(0);
                    ops.add(c);
                }
            }
        }

        nombres.add(Double.parseDouble(nombre.toString()));

        //  priorité * et /
        for (int i = 0; i < ops.size(); i++) {
            char operateur = ops.get(i);

            if (operateur == '*' || operateur == '/')
            {
                double a = nombres.get(i);
                double b = nombres.get(i + 1);

                double res;

                if (operateur == '*')
                {
                    res = multiplication(a, b);
                } else

                {
                    res = division(a, b);
                }

                nombres.set(i, res);
                nombres.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }

        // ensuite + et -
        double result = nombres.get(0);

        for (int i = 0; i < ops.size(); i++)
        {
            char operateur = ops.get(i);

            if (operateur == '+')
            {
                result = addition(result, nombres.get(i + 1));
            } else

            {
                result = soustraction(result, nombres.get(i + 1));
            }
        }

        return result;
    }
}
