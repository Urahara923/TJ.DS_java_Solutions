public class Q1 {

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
    /*
    A Pascal's triangle has 0 - n rows with each row containing 0 - index of
    elements. Any element in a row can be given by the mathematical formula;
    C(n,k) = n!/(k!*(n-k)!)
    where n = index of row, k = index of column
     */
    public static void generatePascalTriangle(int n) {
        //write your code here
        //generating rows
        for (int i = 0; i < n; i++) {
            //calculating n! at each row
            int nFactorial = 1; //by default, 0 case
            if (i != 0) {
                for (int j = 1; j <= i; j++) {
                    nFactorial = nFactorial * j;
                }
            }
            //printing (beginning spaces - 1) number of spaces
            for (int k = 1; k <= n - i - 1; k++) {
                System.out.print(" ");
            }
            //moving onto printing entries
            for (int l = 0; l <= i; l++) {
                int lFactorial = 1; //by default; 0 case
                int ilFactorial = 1; // by default; 0 case
                if (l != 0) {
                    for (int m = 1; m <= l; m++) {
                        lFactorial = lFactorial * m;
                    }
                }
                if (i - l != 0) {
                    for (int o = 1; o <= i - l; o++) {
                        ilFactorial = ilFactorial * o;
                    }
                }
                System.out.print(" " + (nFactorial) / (ilFactorial * lFactorial));
            }
            System.out.println("");//next line
        }

    }
}


