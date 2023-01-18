public class Func1_Newton_Raphson {
    private Func1 func_of_x = new Func1();
    private double n;
    private double n_2;
    private double[] root_matrix = new double[10]; //για τις ριζες τις μεθοδου
    private int i = 0;
    private int numbers_of_roots = 0;
    private int[] loops = new int[10];

    public void func1_Newton_Raphson(double guess, int roots) {
        numbers_of_roots = roots;
        n = guess;
        n_2 = (n - ((func_of_x.get_func(n) * func_of_x.get_func_1der(n)) / ((func_of_x.get_func_1der(n) * func_of_x.get_func_1der(n)) - (func_of_x.get_func(n) * func_of_x.get_func_2der(n)))));

        while (n - n_2 > 0.0000001 || n - n_2 < -0.000001) {
            n = n_2;
            n_2 = (n - ((func_of_x.get_func(n) * func_of_x.get_func_1der(n)) / ((func_of_x.get_func_1der(n) * func_of_x.get_func_1der(n)) - (func_of_x.get_func(n) * func_of_x.get_func_2der(n)))));
            loops[i]++;
        }
        root_matrix[i] = n_2;
        i++;
    }

    public void results() {

        String s;
        System.out.printf("\n\nResults for Newton-Raphson Method:");
        System.out.printf("\nRoot 1:  x=%.5f  y=%.5f  loops=%d", root_matrix[0], func_of_x.get_func(root_matrix[0]), loops[0]);
        s = ((Math.abs(func_of_x.get_func_1der(root_matrix[0])) < 0.00001) ? "follows quadratic convergence" : "does not follow quadratic convergence");
        System.out.printf("\nRoot: x=%.5f %s", root_matrix[0], s);
        if (numbers_of_roots == 3) {
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1], func_of_x.get_func(root_matrix[1]), loops[1]);
            s = ((Math.abs(func_of_x.get_func_1der(root_matrix[1])) < 0.00001) ? "follows quadratic convergence" : "does not follow quadratic convergence");
            System.out.printf("\nRoot: x=%.5f %s", root_matrix[1], s);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2], func_of_x.get_func(root_matrix[2]), loops[2]);
            s = ((Math.abs(func_of_x.get_func_1der(root_matrix[2])) < 0.00001) ? "follows quadratic convergence" : "does not follow quadratic convergence");
            System.out.printf("\nRoot: x=%.5f %s", root_matrix[2], s);
        } else if (numbers_of_roots == 2) {
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1], func_of_x.get_func(root_matrix[1]), loops[1]);
            s = ((Math.abs(func_of_x.get_func_1der(root_matrix[1])) < 0.00001) ? "follows quadratic convergence" : "does not follow quadratic convergence");
            System.out.printf("\nRoot: x=%.5f %s", root_matrix[1], s);
        }

    }

    }

