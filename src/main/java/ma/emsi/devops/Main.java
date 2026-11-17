package ma.emsi.devops;

public final class Main {
    private Main() {}

    public static String greeting(String name) {
        String recipient = name == null || name.isBlank() ? "DevOps" : name.strip();
        return "Bonjour, " + recipient + " !";
    }

    public static void main(String[] args) {
        System.out.println(greeting(args.length == 0 ? null : args[0]));
    }
}
