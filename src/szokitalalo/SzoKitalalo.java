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
    
    static String beSzo = "az";

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
    
    
}
