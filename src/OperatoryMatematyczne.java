//umożliwiają wykonywanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = (float) firstNumber /secondNumber; //0,66
        int mod = secondNumber%firstNumber; //2

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Dzielenie: " + multiplication);
        System.out.println("Mnożenie: " + division);
        System.out.println("Modulo: " + mod);

        //inny sposób zapisu powyższych działań
        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu:" + firstNumber); //10

        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu:" + firstNumber); //4

        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu: " + firstNumber); //24

        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu: " + firstNumber); //4

        firstNumber%=secondNumber;
        System.out.println("Po modulo: " + firstNumber); //4
    }
}
