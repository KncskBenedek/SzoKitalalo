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
    
    static String beSzo = "az";

<<<<<<< HEAD
    public static void main(String[] args) {
        torzs();
        
    }
    private static void torzs(){
        melyikJoKiir(false,1);
    }
//    private static boolean joHelyenVanE (char karakter, int melyik){
//        //String szo = randomSzó();
//        
////        if (karakter == rndSzo.charAt(melyik)){
////            return true;
////        }else{
////            return false;
////        }
//        
//    }

    private static void kiiras(String szoveg) {
        System.out.println(szoveg);
    }
    private static void kiirasf(String szoveg,String szo) {
        System.out.printf(szoveg, szo);
    }

    private static void nemTalalteEl(int dbNemjo) {
        if (dbNemjo == 2){
            System.out.println("Nem találta el szót és egyik se karakter jó!");
        }
    }

    private static void melyikJoKiir(boolean joHely, int melyik) {
        if(joHely){
            kiirasf("Az %s karakter jó helyen van\n", beSzo );
            if (melyik == 0){  
                kiiras("   ^");
            }else{ 
                //kiirasf("Az %s karakter jó helyen van", beSzo);
                kiiras("    ^");
            }
        }else{
           kiirasf("Az %s karakter rossz helyen van\n", beSzo );
            if (melyik == 0){  
                kiiras("   ^"); 
            }else{ 
                //kiirasf("Az %s karakter jó helyen van", beSzo);
                kiiras("    ^"); 
            }
        }        
    }
    
    
=======
    static String rndSzo = "";
    static String beSzo = "";
  //  static char[] 

    public static void main(String[] args) throws UnsupportedEncodingException {
        //torzs();

 //       beker();
        randomSzo();
        beker();
    }
    private static void torzs(){
        randomSzo();
//        karakterEllenorzes();
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

//    private static benneVanE(char betu){
//        
//        
//    }

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
    
    
    
>>>>>>> 07dd1b7c2c71be4120f570c55e72f69f8ad360c6
}
