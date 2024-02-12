## Singleton Design Pattern
- It is a Creational Design Pattern.
- A single class is responsible for creating one single object.
- This class provides a way to access its only object without instantiating an object of the class.
- To create the singleton class, we need to have static member of class, private constructor and static factory method.
- Static member gets memory only once. Private constructor prevents instantiation of the singleton class. Static factory method provides a global access to the Singleton object and returns the instance to the caller.