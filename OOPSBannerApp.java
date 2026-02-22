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

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // UC4: Store full banner lines in array
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}