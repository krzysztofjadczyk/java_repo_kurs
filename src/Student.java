public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH po zmianie"; //pole statyczne jest związane z klasą a nie konkretną instancją obiektu klasy


    public void przedstawSie() {
        System.out.println("Nazywam się: " + imie + ", " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguję się za pomocą " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to: " + numerIndeksu);

    }

    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    public static void infoUczelnia() { //metoda statyczna jest związana z klasą a nie konkretną instancją obiektu klasy
        System.out.println("Moja uczelnia to: " + nazwaUczelni);
        druga(); //można wywołać inną metodę statyczną ale nie statyczne metody nie mogą być użyte
                 //nie można też używać pól które nie są statyczne
    }

    public static void druga() {
        System.out.println("Jestem drugą metodą");
    }
}
