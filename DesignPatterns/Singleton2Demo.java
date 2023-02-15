public class Singleton2Demo{
    
    private static final Singleton2Demo INSTANCE = new Singleton2Demo();
    private Singleton2Demo(){}

    public static Singleton2Demo getInstance(){
        return INSTANCE;
    }

    public void display(){
        System.out.println("Singleton2 Instance Display");
    }
}