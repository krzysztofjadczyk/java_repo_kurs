// Stwórz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablicę i dodaj studentów do tablicy
// Przeiteruj po tablicy i wywołaj metody klasy Student
public class StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student student1 = new Student();
        student1.imie = "Marek";
        student1.nazwisko = "Kowalczyk";
        student1.email = "marek.kowalczyk@student.pl";
        student1.nick = "kowal";
        String uczelniaStudenta1 = student1.nazwaUczelni;

        Student student2 = new Student();
        student2.imie = "Karol";
        student2.nazwisko = "Markowski";
        student2.email = "k.markowski@student.pl";
        student2.nick = "marek";

        Student student3 = new Student();
        student3.imie = "Małgorzata";
        student3.nazwisko = "Bąk";
        student3.email = "m.bak@student.pl";
        student3.nick = "bączek";

        Student[] tablicaStudentow = new Student[3];
        tablicaStudentow[0] = student1;
        tablicaStudentow[1] = student2;
        tablicaStudentow[2] = student3;

        for (int i=0; i<tablicaStudentow.length; i++) {
            tablicaStudentow[i].przedstawSie();
            tablicaStudentow[i].zalogujSie();
        }

        //String imie = "Kasia";
    }
}
