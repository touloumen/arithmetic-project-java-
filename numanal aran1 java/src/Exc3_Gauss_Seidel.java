public class Exc3_Gauss_Seidel {
    static double[] x;

    public  void ex_3_Gauss_Seidel(int n) {

        x = new double[n];
        int i;
        int j;
        int z;

        for (z=0; z<15; z++){
            for (i=0; i<n; i++) {
                for (j=0; j<n; j++) {

                    if (i == n-1 && j == n-1) x[i]=(2+x[i-1])/3;
                    else if (i == 0 && j == 0) x[i]=(2+x[i+1])/3;
                    else if (i == j) x[i]=(1+x[i-1]+x[i+1])/3;
                }
            }
        }

        for (i=0; i<n; i++) {
            System.out.printf("x%d = %.4f\t", i+1, x[i]);
            if (i%20 == 19)
                System.out.printf("\n");
        }

    }

}
