import mypackage.MyClass;

public class UserDefined_package {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage();
    }
}

// javac -d . UserDefined_package.java
// java UserDefined_package