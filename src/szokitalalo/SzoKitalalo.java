package szokitalalo;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

/*
leírás saját szavainkal: A program kiválaszt egy kétbetűs szót több szó közül
(pl.: íz, őz fű), ezután a felhasználótol bekérünk egy maximum 2 karakter hosszú 
szót amit ??? módon a kiválasztott szóhoz hasonlítjuk, ha egy betű bennevan és
rossz helyen van jelezzük hogy benne van csak rossz helyen.
Ha kitalálta ???.


*randomSzó();
*bekér();
*karakterreBontás();
*karakterEllenőrzés(); -->
|->benneVanE();  joHelyenVanE();
*kiiras();
*torzs();
 */
public class SzoKitalalo {

    static String rndSzo = "";
    static String beSzo = "";

    public static void main(String[] args) throws UnsupportedEncodingException {
        torzs();

    }

    private static void torzs() throws UnsupportedEncodingException {
        do {
            randomSzo();
            boolean megVan = false;
            kiiras("Ki kell találnia egy 2 betüs szót! (pl: út le stb...)\nSok sikert!");
            do {
                beker();
                megVan = egyezik();
                if (!megVan) {
                    karakterEllenorzes();
                }

            } while (!megVan);
            kiiras("Gratulálok eltaláltad a szót!");
        } while (ujra());

    }

    private static boolean joHelyenVanE(char karakter, int melyik) {

        if (karakter == rndSzo.charAt(melyik)) {
            return true;
        } else {
            return false;
        }
    }

    private static void kiiras(String szoveg) {
        System.out.println(szoveg);
    }

    private static void kiirasf(String szoveg, String szo) throws UnsupportedEncodingException {
        System.out.printf(szoveg, szo);
    }

    private static void nemTalalteEl() {
        System.out.println("Nem találta el szót és egyik se karakter jó!");
    }

    private static void melyikJoKiir(boolean joHely, int melyik) throws UnsupportedEncodingException {
        if (joHely) {
            kiirasf("Az %s karakter jó helyen van\n", beSzo);
            nyilEldontes(melyik);
        } else {
            kiirasf("Az %s karakter rossz helyen van\n", beSzo);
            nyilEldontes(melyik);
        }
    }

    private static void beker() throws UnsupportedEncodingException {
        Scanner scan = new Scanner(new InputStreamReader(System.in, "ISO-8859-2"));
        String szo = "";
        kiiras("Kérem adjon meg egy szót: ");
        szo = scan.nextLine();
        while (!(szo.matches("[a-záéíóöőúüű]{2}"))) {
            kiiras("Csak két BETŰS szavakat fogadunk el! Próbálja újra.");
            kiiras("Kérem adjon meg egy szót: ");
            szo = scan.nextLine();
        }
        beSzo = szo;

    }

    private static void randomSzo() throws UnsupportedEncodingException {
        Random rnd = new Random();
        String[] szavak = {"ás", "íz", "ős"};
        int rndszam = rnd.nextInt(szavak.length);
        String randomSzo = szavak[rndszam];
        rndSzo = randomSzo;

    }

    private static void karakterEllenorzes() throws UnsupportedEncodingException {
        int n = 0;
        int dbNemJo = 0;
        int hossz = rndSzo.length();
        while (n < hossz) {
            boolean benneVan = benneVanE(beSzo.charAt(n));

            if (benneVan) {
                boolean joHelyenVan = joHelyenVanE(beSzo.charAt(n), n);
                melyikJoKiir(joHelyenVan, n);
            } else {
                dbNemJo++;
            }
            if (dbNemJo == 2) {
                nemTalalteEl();
            }

            n++;
        }

    }

    private static boolean benneVanE(char betu) throws UnsupportedEncodingException {
        int i = 0;
        int hossz = rndSzo.length();
        while (i < hossz && !(betu == rndSzo.charAt(i))) {
            i++;
        }
        boolean benneVan = (i < hossz);
        return benneVan;
    }

    private static boolean egyezik() throws UnsupportedEncodingException {
        return beSzo.equals(rndSzo);
    }

    private static void nyilEldontes(int melyik) {
        if (melyik == 0) {
            kiiras("   ^");
        } else {
            kiiras("    ^");
        }
    }

    private static boolean ujra() throws UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        kiiras("Szeretne Újra játszani?(igen/nem)");
        String valasz = scan.nextLine();
        while (!(!(valasz == "nem" || valasz == "igen"))) {
            kiiras("Szeretne Újra játszani?(igen/nem)");
            valasz = scan.nextLine();
        }
        if (valasz.equals("igen")) {
            return true;
        } else {
            return false;
        }
    }

}
