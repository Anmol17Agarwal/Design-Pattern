package SingletonPattern;

public class Cutlet {

    private static Cutlet cutlet;

    private Cutlet(){
    }

    public static Cutlet getCutlet(){
        if(cutlet == null){
            synchronized (Cutlet.class){
                if(cutlet == null){
                    cutlet = new Cutlet();
                }
            }
        }
        return cutlet;
    }
}
