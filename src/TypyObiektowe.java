
//przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) na tych danych
public class TypyObiektowe {



        public static void main(String[] args) {
                //liczby stałoprzecinkowe
                Byte firstNumber = 127; //1 bajt -128 do 127
                Short secondNumber = 32689; //2 bajty -32768 do 32 767
                Integer thirdNumber = 32768999; //4 bajty
                Long fourthNumber = 2148000L; //8 bajtów


                //liczby zmiennoprzecinkowe
                Float fifthNumber = 4.99934F; //4 bajty - max ok 6-7 liczb po przecinku
                Double sixthNumber = 3.9999999999999D; //8 bajtów - max 15 cyfr po przecinku


                //wartość logiczna
                Boolean prawda = true;
                Boolean falsz = false;

                //pojedynczy znak
                Character letter = 'A';

                //ciągi znaków
                String hello = "Hello Bartek";

                System.out.println(hello.charAt(0));
                System.out.println(hello.contains("Bartek1"));

        }
}
