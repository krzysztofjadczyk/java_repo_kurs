package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach: ");
        int age = number.nextInt();

        if (age < 18 && age >= 0) {
            System.out.println("Jesteś niepełnoletni");
        } else if (age < 0) {
            throw new InvalidAgeException("Niepoprawny wiek");
        }
        else  {
            System.out.println("Jesteś pełnoletni");

        }
    }
    }
