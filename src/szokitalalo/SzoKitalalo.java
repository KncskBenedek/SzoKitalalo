package szokitalalo;
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
    static char[] 
    public static void main(String[] args) {
        torzs();
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
}
