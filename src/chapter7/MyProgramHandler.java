package chapter7;

public class MyProgramHandler {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.err.println("usage: myapp");
            System.exit(1);
        }
        System.out.println("It worked");

    }

}
