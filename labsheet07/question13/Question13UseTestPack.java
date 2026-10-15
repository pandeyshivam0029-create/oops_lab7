package labsheet07.question13;

import testpack.PublicClass;

public class Question13UseTestPack {
    public static void main(String[] args) {
        PublicClass publicObject = new PublicClass();
        publicObject.display();

        // DefaultClass cannot be used here because it is not public.
    }
}
