package SingletonPattern;

import java.io.Serializable;

public class Kachori implements Serializable,Cloneable {

    private static Kachori kachori;

    private Kachori(){
    }

    public static Kachori getKachori(){
        if(kachori == null){
            synchronized (Kachori.class){
                if(kachori == null){
                    kachori = new Kachori();
                }
            }
        }
        return kachori;
    }


    // will trying to block the deserialization comment readResolve method
    public Object readResolve() {
        return kachori;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        //to prevent cloning
    return kachori;
    }
}
