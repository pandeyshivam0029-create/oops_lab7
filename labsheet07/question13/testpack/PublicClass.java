package testpack;

public class PublicClass {
    public void display() {
        System.out.println("This public class can be used from another package.");
    }
}

class DefaultClass {
    public void display() {
        System.out.println("This class can only be used inside testpack.");
    }
}
