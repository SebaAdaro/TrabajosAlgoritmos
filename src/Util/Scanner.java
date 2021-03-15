package Util;

public class Scanner {

    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    private Scanner() { }

    /** Displays the given message and waits for user to enter some text.
     * @param message to be displayed.
     * @return text entered by the user.
     */
    public static String getString(String message) {
        System.out.print(message);
        final String result = scanner.nextLine().trim();
        if(result.isEmpty()) {
            System.out.println("Please enter a.txt text.");
            return getString(message);
        }
        return result;
    }

    /** Displays the given message and waits for user to enter a.txt character.
     * @param message to be displayed.
     * @return char entered by the user.
     */
    public static char getChar(String message) {
        return getString(message).charAt(0);
    }

    /** Displays the given message and waits for user to enter an int.
     * @param message to be displayed.
     * @return integer entered by the user.
     */
    public static int getInt(String message) {
        System.out.print(message);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer.");
            return getInt(message);
        }
    }

    /** Displays the given message and waits for user to enter a.txt long.
     * @param message to be displayed.
     * @return long entered by the user.
     */
    public static long getLong(String message) {
        System.out.print(message);
        try {
            return Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a.txt long.");
            return getLong(message);
        }
    }

    /** Displays the given message and waits for user to enter a.txt float.
     * @param message to be displayed.
     * @return float entered by the user.
     */
    public static float getFloat(String message) {
        System.out.print(message);
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a.txt float.");
            return getFloat(message);
        }
    }

    /** Displays the given message and waits for user to enter a.txt double.
     * @param message to be displayed.
     * @return double entered by the user.
     */
    public static double getDouble(String message) {
        System.out.print(message);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a.txt double.");
            return getDouble(message);
        }
    }

    /** Test */

    public static void main(String[] args) {
        final String text = Scanner.getString("Enter some text: ");
        System.out.println("The entered text was: " + text);

        final char c = Scanner.getChar("Enter a.txt char: ");
        System.out.println("The entered char is: " + c);

        final int i = Scanner.getInt("Enter an int: ");
        System.out.println("The entered int is: " + i);

        final long l = Scanner.getLong("Enter a.txt long: ");
        System.out.println("The entered long is: " + l);

        final float f = Scanner.getFloat("Enter a.txt float: ");
        System.out.println("The entered float is: " + f);

        final double d = Scanner.getDouble("Enter a.txt double: ");
        System.out.println("The entered double is: " + d);
    }
}