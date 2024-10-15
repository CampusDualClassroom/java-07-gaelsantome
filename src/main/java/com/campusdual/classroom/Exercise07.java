package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor e N: ");
        int n = scanner.nextInt();
        sumFirstNaturalNumbers(n);
        scanner.close();

        System.out.println("Introduce el valor e N: ");
        int num = scanner.nextInt();
        sumFirstNaturalNumbers(num);
        scanner.close();
        showFirstNaturalNumbers(num);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

        List<Integer> NumberList = new ArrayList<>();
        NumberList.add(1);
        NumberList.add(2);
        NumberList.add(3);
        NumberList.add(4);
        NumberList.add(5);
        NumberList.add(6);
        NumberList.add(7);
        NumberList.add(8);
        NumberList.add(9);
        NumberList.add(10);

        int result = -1;

        for (int i=0; i <NumberList.size(); i++){
            if (NumberList.get(i) == num){
                result = 1;
                System.out.println("El elemento X se encuentra en la posición: Y");
            }
            if (result == -1){
                System.out.println("El elemento X no se encuentra en la lista.");

            }


        }


    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
    int sum = 0;
        for (int i = 1; i <=num; i++){
            sum +=i;
        }

        System.out.println(sum);


    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        int sum = 0;
        for (int i = 0; i <=num; i++){
            sum =sum+1;
            System.out.println(sum);
        }



    }

}
