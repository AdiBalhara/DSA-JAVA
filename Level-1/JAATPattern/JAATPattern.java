public class JAATPattern {
    public static void main(String[] args) {
        int n = 7; // height of the letters

        for (int i = 0; i < n; i++) {
            // ----- J -----
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2 || (i == n - 1 && j <= n / 2 && j != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   "); // space between letters

            // ----- A -----
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || // top line (without corners)
                    (i == n / 2) || // middle bar
                    (j == 0 && i != 0) || // left side
                    (j == n - 1 && i != 0)) { // right side
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   "); // space between letters

            // ----- A -----
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) ||
                    (i == n / 2) ||
                    (j == 0 && i != 0) ||
                    (j == n - 1 && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   "); // space between letters

            // ----- T -----
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // next line
        }
    }
}
