package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.delete()) {
            System.out.println("Plik został usunięty");
        } else {
            System.out.println("Nie udało się usunąć pliku. Plik nie istnieje lub nie masz do niego uprawnień");
        }
    }
}
