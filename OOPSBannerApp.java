public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for letter P
    public static String[] getP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method for letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        String[] banner = {
            String.join("   ", 
                " ***** ", 
                " ***** ", 
                " ******", 
                " ******"),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*     *", 
                "*     "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*     *", 
                "*     "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "****** ", 
                " ***** "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*      ", 
                "      *"),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*      ", 
                "      *"),

            String.join("   ", 
                " ***** ", 
                " ***** ", 
                "*      ", 
                " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}