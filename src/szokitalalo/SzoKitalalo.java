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

    static String rndSzo = "űs";
    static String beSzo = "";

    public static void main(String[] args) throws UnsupportedEncodingException {
        torzs();

    }

    private static void torzs() throws UnsupportedEncodingException {

        //rndSzo = randomSzo();
        boolean megVan = false;
        do {
            beSzo = beker();
            megVan = egyezik();
            if (!megVan) {
                karakterEllenorzes();
            }

        } while (!megVan); //karakterEllenorzes();
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

    private static void kiirasf(String szoveg, String szo) throws UnsupportedEncodingException{
        System.out.printf(szoveg, szo);
    }

    private static void nemTalalteEl() {
        System.out.println("Nem találta el szót és egyik se karakter jó!");
    }

    private static void melyikJoKiir(boolean joHely, int melyik) throws UnsupportedEncodingException{
        if (joHely) {
            kiirasf("Az %s karakter jó helyen van\n", beSzo);
            if (melyik == 0) {
                kiiras("   ^");
            } else {
                kiiras("    ^");
            }
        } else {
            kiirasf("Az %s karakter rossz helyen van\n", beSzo);
            if (melyik == 0) {
                kiiras("   ^");
            } else {
                kiiras("    ^");
            }
        }
    }

    //  static char[] 
    private static String beker() throws UnsupportedEncodingException {
        Scanner scan = new Scanner(new InputStreamReader(System.in, "ISO-8859-1"));
        //Scanner sc = new Scanner(System.in);
        String szo = "";
        do {
            System.out.println("Kérem adjon meg egy szót: ");
            //scan = new Scanner(new InputStreamReader(System.in, "ISO-8859-1"));
            szo = scan.nextLine();
        } while (!(szo.matches("[a-záéíóöőúüű]{2}")));
        return szo;
        // ellenorizni a random szot

    }

    private static String randomSzo() throws UnsupportedEncodingException {
        Random rnd = new Random();
        int rndszam = rnd.nextInt(3);
        String[] szavak = {"ás", "íz", "ős"};
        String randomSzo = szavak[rndszam];
        return randomSzo;

    }

    private static void karakterEllenorzes() throws UnsupportedEncodingException{
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

    private static boolean benneVanE(char betu) throws UnsupportedEncodingException{
        int i = 0;
        int hossz = rndSzo.length();
        while (i < hossz && !(betu == rndSzo.charAt(i))) {
            i++;
        }
        boolean benneVan = (i < hossz);
        return benneVan;
    }

    private static boolean egyezik() throws UnsupportedEncodingException{
        return beSzo.equals(rndSzo);
    }

}
