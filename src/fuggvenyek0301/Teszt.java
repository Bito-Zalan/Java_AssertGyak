package fuggvenyek0301;


public class Teszt {
    
    public static void asszertKVegNagyobb() {
        int kapott;
        int vart;
        
        //1.eset
        int k = 4;
        int min = 13;
        kapott = Fuggvenyek0301.kVegNagyobb(k, min);
        vart = 14;
        assert vart == kapott:"Nem működik! min utolsó számjegye kissebb, mint K";
        
        //2. eset
        k = 4;
        min = 10;
        kapott = Fuggvenyek0301.kVegNagyobb(k, min);
        vart = 14;
        assert vart == kapott:"Nem müködik! min utolsó számjegye nagyobb mint K.";
        
        //3. eset
        k = 4;
        min = 14;
        kapott = Fuggvenyek0301.kVegNagyobb(k, min);
        vart = 24;
        assert vart == kapott:"Nem müködik! min utolsó számjegye egyenlő K -val.";
        
        //4. eset
        k = 5;
        min = -14;
        kapott = Fuggvenyek0301.kVegNagyobb(k, min);
        vart = -5;
        assert vart == kapott:"Nem müködik! Negatív a min értéke.";
        
        //5. eset
        k = 0;
        min = 14;
        kapott = Fuggvenyek0301.kVegNagyobb(k, min);
        vart = 20;
        assert vart == kapott:"Nem müködik! K = 0";
        
        //szomszedos
        /*int sz = 1;
        kapott = Fuggvenyek0301.szomszedPrimE(sz);
        vart = true;
        assert vart == kapott:""*/
        
    }
    public static void assertkVegVanE(String[] args) {
        //1. eset
        int k = 4;
        int min = 13;
        int max = 25;
        int kapott = Fuggvenyek0301.kVegVanE(k, min, max);
        int vart = 14;
        assert vart == kapott: "Nem működik: Középen van ilyen az intervallumban";
        
        //2. eset
        k = 4;
        min = 14;
        max = 25;
        kapott = Fuggvenyek0301.kVegVanE(k, min, max);
        vart = 14;
        assert vart == kapott: "Nem működik: Elöl van ilyen az intervallumban";
        
        //3. eset
        k = 5;
        min = 7;
        max = 15;
        kapott = Fuggvenyek0301.kVegVanE(k, min, max);
        vart = 15;
        assert vart == kapott: "Nem működik: Hátul van ilyen az intervallumban";
        
        //4. eset
        k = 5;
        min = 7;
        max = 10;
        kapott = Fuggvenyek0301.kVegVanE(k, min, max);
        vart = 0;
        assert vart == kapott: "Nem működik: Nincs ilyen az intervallumban";
        
        //5. eset
        k = 5;
        min = 17;
        max = 10;
        kapott = Fuggvenyek0301.kVegVanE(k, min, max);
        vart = 0;
        assert vart == kapott: "Nem működik: Nincs ilyen az intervallumban";
    }
    
}
