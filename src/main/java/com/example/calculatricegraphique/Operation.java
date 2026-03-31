package com.example.calculatricegraphique;

public class Operation {
    double addition (double a , double b )
    {
        return a+b;
    }

    double soustraction (double a , double b )
    {
        return a-b;
    }

    double multiplication (double a , double b)
    {
        return a*b;
    }

    double division (double a ,double b )
    {
       if(b==0)
       {
           throw new ArithmeticException("Stop pour la division par zéro.");
       }
       return a/b;
    }


}
