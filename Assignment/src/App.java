public class App {
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String name = "Kshitij Shah";
        String major = "AiMl";
        String university = "BIT R.";

        System.out.println(BLUE + "========================================" + RESET);
        System.out.println(GREEN + "           Assignment By              " + RESET);
        System.out.println(BLUE + "========================================" + RESET);
        System.out.printf(YELLOW + "Name: %s%n" + RESET, name);
        System.out.printf(YELLOW + "Major: %s%n" + RESET, major);
        System.out.printf(YELLOW + "University: %s%n" + RESET, university);
        System.out.println(BLUE + "========================================" + RESET);
    }
}
