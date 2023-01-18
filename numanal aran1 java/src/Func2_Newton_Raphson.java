public class Func2_Newton_Raphson {
    private Func2 func_of_x = new Func2();
    private double x_n;
    private double x_n_2;
    private double[] root_matrix = new double[10]; // Roots for Newton-Raphson
    private int i = 0;
    private int number_of_roots = 0;
    private int[] loops = new int[10]; // Loops counter

    public void ex_2_Newton_Raphson(double guess,int roots) {

        number_of_roots = roots;
        x_n = guess;
        x_n_2 = x_n - 1/((func_of_x.get_func_1der(x_n)/func_of_x.get_func(x_n))-((1/2)*((func_of_x.get_func_2der(x_n))-func_of_x.get_func_1der(x_n))));

        while (x_n-x_n_2>0.00001||x_n-x_n_2<-0.00001) {
            x_n = x_n_2;
            x_n_2 = x_n - 1/((func_of_x.get_func_1der(x_n)/func_of_x.get_func(x_n))-((1/2)*((func_of_x.get_func_2der(x_n))-func_of_x.get_func_1der(x_n))));
            loops[i]++;
        }
        root_matrix[i] = x_n_2;
        i++;
    }

    public void results() {

        System.out.printf("\n\nResults for Modified Newton-Raphson Method:");
        System.out.printf("\nRoot 1:  x=%.5f  y=%.5f  loops=%d", root_matrix[0],func_of_x.get_func(root_matrix[0]),loops[0]);
        if (number_of_roots == 5){
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1],func_of_x.get_func(root_matrix[1]),loops[1]);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2],func_of_x.get_func(root_matrix[2]),loops[2]);
            System.out.printf("\nRoot 4:  x=%.5f  y=%.5f  loops=%d", root_matrix[3],func_of_x.get_func(root_matrix[3]),loops[3]);
            System.out.printf("\nRoot 5:  x=%.5f  y=%.5f  loops=%d", root_matrix[4],func_of_x.get_func(root_matrix[4]),loops[4]);
        } else if (number_of_roots == 2) System.out.printf("\nRoot #2  x=%.6f  y=%.6f  loops=%d", root_matrix[1],func_of_x.get_func(root_matrix[1]),loops[1]);

    }
}
