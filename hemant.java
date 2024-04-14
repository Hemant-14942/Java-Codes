class hemant {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 7 || i == (n + 1) / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 7 || i == (n + 1) / 2 || j == 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (((i == j || i + j == n + 1) && i <= 4) || j == 1 || j == 7) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i >= 4 && j == 1) || (i + j == (n + 1) / 2 && i < 4) || (j == 4 && i < 2)
                        || (j > 4 && j - i == (n + 1) / 2) || (i >= 3 && j == 7) || i == (n + 1) / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 7 || i == j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == (n + 1) / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}