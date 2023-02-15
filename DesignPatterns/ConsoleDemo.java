public class ConsoleDemo{

    public static void main(String[] args){
        SingletonDemo singleton = SingletonDemo.getInstance();
        singleton.display();

        Singleton2Demo singleton2 = Singleton2Demo.getInstance();
        singleton2.display();

        Singleton3Demo singleton3 = Singleton3Demo.SINGLETON_INSTANCE;

        //singleton3.setTestVar(100);
        singleton3.getTestVar();

        singleton3.display();
    }

}