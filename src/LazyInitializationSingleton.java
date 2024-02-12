public class LazyInitializationSingleton {
    private static LazyInitializationSingleton singleton;

    private LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyInitializationSingleton();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Message from singleton class (Lazy initialization)");
    }
}