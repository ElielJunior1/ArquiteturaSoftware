public class Nome {
    public static void main(String[] args) {
        char[][] arrE = AlfabetoE();
        escrever(arrE);
        char[][] arrL = AlfabetoL();
        escrever(arrL);
        char[][] arrI = AlfabetoI();
        escrever(arrI);
        char[][] arrE2 = AlfabetoE2();
        escrever(arrE2);
        char[][] arrL2 = AlfabetoL2();
        escrever(arrL2);
    }

    public static char[][] AlfabetoE() {
        char[][] arrE = {
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'-','-','-','-','-','-'}

        };
        return arrE;
    }
    public static char[][] AlfabetoL() {
        char[][] arrL = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', ' '},
                {'-','-','-','-','-','-'}

        };
        return arrL;
    }
    public static char[][] AlfabetoI() {
        char[][] arrI = {
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {'-','-','-','-','-','-'}

        };
        return arrI;
    }
    public static char[][] AlfabetoE2() {
        char[][] arrE2 = {
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'-','-','-','-','-','-'}

        };
        return arrE2;
    }
    public static char[][] AlfabetoL2() {
        char[][] arrL2 = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', ' '},
                {'-','-','-','-','-','-'}

        };
        return arrL2;
    }
    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
