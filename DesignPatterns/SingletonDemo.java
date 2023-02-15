public class SingletonDemo implements SuperClass{
    
    private static SingletonDemo singletonInstance = null;
    
    private SingletonDemo(){}

    public static SingletonDemo getInstance(){

       //thread safety
       synchronized(SingletonDemo.class){
       
        if(singletonInstance == null){
            singletonInstance = new SingletonDemo();
        }
       }
        return singletonInstance;
    }

    public void display(){
        System.out.println("Singleton Instance Display");
    }
}