package SingletonPattern;

public class Jalebi {

    private static Jalebi jalebi;

    private Jalebi(){
        if(jalebi != null){
            throw new RuntimeException("Object already created");
        }
    }

    public static Jalebi getCutlet(){
        if(jalebi == null){
            synchronized (Jalebi.class){
                if(jalebi == null){
                    jalebi = new Jalebi();
                }
            }
        }
        return jalebi;
    }
}
