package SingletonPattern;

public class Pakoda {

    private static Pakoda pakoda = new Pakoda();

    private Pakoda(){

    }
    public static Pakoda getPakoda(){
        return pakoda;
    }
}
