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
<<<<<<< HEAD
    static String rndSzo = "";
    static String beSzo = "";
    static char[] 
    public static void main(String[] args) {
        torzs();
=======

    public static void main(String[] args) throws UnsupportedEncodingException {
        //torzs();
<<<<<<< HEAD
 //       beker();
        randomSzo();
=======
        beker();
>>>>>>> 115f05197d48f74f403136570474b094ee2cd3df
>>>>>>> ba67238f587ec4248dc53d92ef98ba28a15fe820
    }
    private static void torzs(){
        randomSzo();
        karakterEllenorzes();
    }
    private static void karakterEllenorzes(tomb){
        int i  = 0;
        //int dbNemJo = 0;
        int hossz = tomb.lenght;
        while (i<hossz) {
            
            boolean benneVan = benneVanE(tomb[i]);
            
            //if(benneVan){
                //boolean joHelyenVan = jóhelyenvan
                //kiir()
                //String szoveg = joHelyenVan?"":"";
                //kiir(szoveg);            
            //}else{
                //dbNemJo++;
            //}
            
              //boolean ar =   joHelyenVanE();  
            //i++;
            
            //System.out.printf(ar?"":"");
        }
    }

    private static benneVanE(char betu){
        
        
    }

    private static String beker() throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String szo = "";
        do {
            System.out.println("Kérem adjon meg egy szót: ");
            Scanner scan = new Scanner(new InputStreamReader(System.in, "ISO-8859-1"));
            szo=scan.nextLine();
        } while (!(szo.matches("[a-záéíóöőúüű]{2}")));
        return szo;
        // ellenorizni a random szot
      
        
    } 

    private static void randomSzo() {
        Random rnd = new Random();
        int rndszam = rnd.nextInt(3);
        String[] szavak = {"ás", "íz", "ős"};
        String randomSzo = szavak[rndszam];
        System.out.println(randomSzo);
        
    }
    
    
    
}
