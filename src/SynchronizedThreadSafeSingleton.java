public class SynchronizedThreadSafeSingleton {
    private static SynchronizedThreadSafeSingleton singleton;

    private SynchronizedThreadSafeSingleton() {}

    public static synchronized SynchronizedThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedThreadSafeSingleton();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Message from synchronized singleton class (Thread safe singleton)");
    }
}