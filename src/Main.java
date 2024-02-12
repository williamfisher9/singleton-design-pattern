public class Main {
    public static void main(String[] args) {
        EagerInitializationSingleton object1 = EagerInitializationSingleton.getInstance();
        object1.showMessage();

        SynchronizedThreadSafeSingleton object2 = SynchronizedThreadSafeSingleton.getInstance();
        object2.showMessage();

        LazyInitializationSingleton object3 = LazyInitializationSingleton.getInstance();
        object3.showMessage();
    }
}