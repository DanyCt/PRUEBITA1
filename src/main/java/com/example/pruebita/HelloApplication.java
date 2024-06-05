package com.example.pruebita;

import java.awt.*;
import java.util.Scanner;
public class HelloApplication {

    public static void main (String[]args){

        Scanner hola= new Scanner(System.in);

        System.out.println("hola pruebita repaso");
        String pruebita = hola.nextLine();

        System.out.println("Los nombres ingresados son: " + pruebita);
    }
}
