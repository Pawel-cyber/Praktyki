package cw5; // Paczka lol folder
import java.util.Random; // Importowana klasa
public class cw5 {
    public static void main(String[] args){ // sprawia że działa


        Random ran = new Random();  // Tworzy nowy obiekt klasy random
        int c = ran.nextInt(2); // Zmienna przechowująca losową liczbe
        System.out.println(c); // Wypisuje liczbę zmiennej "c"
        if( c==0){ // Jeśli liczba c równa się zero, wtedy wykonuje polecenie w nawiasie
            System.out.println("Reszka"); // Pokazuje słowo "reszka"
        }
        else{ // c = wszystko inne tylko nie 0 w tedy wykonuje polecenie w nawiasie
            System.out.println("Orzeł");
        }

    }
}
