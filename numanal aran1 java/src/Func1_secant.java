import java.util.ArrayList;

public class Func1_secant {
    private Func1 func_of_x = new Func1();
    private double[] root_matrix = new double[10];
    ArrayList<Double> matrix = new ArrayList<>();
    private double new_c;
    private int number_of_roots;
    private int i = 0;
    private int[] loops = new int[10];
    private int j = 0;

    public void func1_secant(double n, double m, int roots) {

        matrix.clear();
        j = 0;
        matrix.add(n);
        j++;
        matrix.add(m);
        j++;
        matrix.add(-2.0);
        number_of_roots = roots;
        loops[i]++;

        while (Math.abs(func_of_x.get_func(matrix.get(j))) > 0.00001) {
            new_c = matrix.get(j - 1) - (((matrix.get(j - 1) - matrix.get(j - 2)) / (func_of_x.get_func(matrix.get(j - 1)) - func_of_x.get_func(matrix.get(j - 2)))) * func_of_x.get_func(matrix.get(j - 1)));
            matrix.add(new_c);
            j++;
            loops[i]++;
        }
        root_matrix[i] = matrix.get(j);
        i++;
    }

    public void results() {

        System.out.printf("\n\nResults for Secant Method:");
        System.out.printf("\nRoot 1:  x=%.5f  y=%.5f  loops=%d", root_matrix[0], func_of_x.get_func(root_matrix[0]), loops[0]);
        if (number_of_roots == 3) {
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1], func_of_x.get_func(root_matrix[1]), loops[1]);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2], func_of_x.get_func(root_matrix[2]), loops[2]);
        } else if (number_of_roots == 2)
            System.out.printf("\nRoot #2  x=%.5f  y=%.5f  loops=%d", root_matrix[1], func_of_x.get_func(root_matrix[1]), loops[1]);

    }
}
