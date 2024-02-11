public class SingletonClass {

    private static SingletonClass singletonClass = new SingletonClass();

    // private constructor will guarantee this class will not be instantiated
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return singletonClass;
    }

    public void showMessage(){
        System.out.println("Message from singleton class...");
    }
}