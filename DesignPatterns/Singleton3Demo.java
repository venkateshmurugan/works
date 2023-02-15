public enum Singleton3Demo{
    SINGLETON_INSTANCE;
    
    int testVar;

    public void setTestVar(int testVar){
        this.testVar = testVar;
    }

    public int getTestVar(){
        return testVar;
    }

    public void display(){
        System.out.println("Singleton3 Instance Display Test Var: " + testVar);

    }
}