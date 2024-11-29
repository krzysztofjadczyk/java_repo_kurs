// działają na wartościach logicznych i zwracają również wartość logiczną
// && - i >> true gdy wyrażenia składowe to true
// || - lub >> true gdy choć jedno wyrażenie składowe to true
// ! - negacja >> zaprzeczenie wartości
public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true; // 2>1;
        boolean secondValue = false; // 1>2;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && thirdValue); // true
        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!(firstValue && secondValue)); //true
        //System.out.println(firstValue && secondValue);
        //System.out.println(firstValue && secondValue);

    }
}
