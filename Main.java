// Oppgave 1
class Bil1 {
    void skrivUt() {
        System.out.println("Jeg er en Bil");
    }
}

// Oppgave 2
class Bil2 {
    String bilNummer;
    // Konstruktør
    Bil2(String innBilNummer) {
        bilNummer = innBilNummer;
    }
    void skrivUt() {
        System.out.println("Bilnummer: "+bilNummer);
    }
}

// Oppgave 3
class Bil3 {
    String bilNummer;
    // Konstruktør
    Bil3(String innBilNummer) {
        bilNummer = innBilNummer;
    }
    void skrivUtBilNummer() {
        System.out.println("Bilnummer: "+bilNummer);
    }

    // a)
    String hentNummer() {
        return bilNummer;
    }
}

// b)
class Person {
    Bil3 bil;

    Person(Bil3 innBilObjekt) {
        bil = innBilObjekt;
    }

    void skrivUtBilNummer() {
        System.out.println("Personen eier bilen med bilnummer: "+bil.hentNummer());
    }
}

public class Main {
    public static void main(String[] args) {
        // Objekt av klassen Bil1
        Bil1 bil1Objekt = new Bil1();
        bil1Objekt.skrivUt();

        // Objekt av klassen Bil2
        Bil2 bil2Objekt = new Bil2("AD279185");
        bil2Objekt.skrivUt();

        // Objekt av klassen Bil3
        // c)
        Bil3 bil3Objekt = new Bil3("BK296736");
        bil3Objekt.skrivUtBilNummer();
        Person personObjekt = new Person(bil3Objekt);
        personObjekt.skrivUtBilNummer();
    }
}