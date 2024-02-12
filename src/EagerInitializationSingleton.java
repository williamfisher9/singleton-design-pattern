public class EagerInitializationSingleton {

    // Eager instantiation of the class
    private static EagerInitializationSingleton singleton = new EagerInitializationSingleton();

    // private constructor will guarantee this class will not be instantiated
    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Message from singleton class (Eager initialization)");
    }
}