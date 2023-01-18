public class Func2_bisection {

    private int[] loops = new int[10];
    private double[] root_matrix = new double[10];
    private int number_of_roots = 0;
    private int i = 0;
    private double x = 0 , a = 0 , b = 0 , start , end , difference , tail , head , adder = 0.01 , j;
    private boolean found=false;
    private Func2 function_of_x = new Func2();

    public void ex_2_Bisection_Method(int roots) {

        number_of_roots = roots;
        i = 0;

        for (j=-2; j<=2-adder; j=j+adder){
            tail = function_of_x.get_func(j);
            head = function_of_x.get_func(j+adder);
            found = false;

            if (tail * head < 0){
                a = j;
                b = j + adder;

                while (!found){
                    loops[i]++;
                    start = Math.min(a, b);
                    end = Math.max(a, b);
                    difference = end - start;
                    x = start + Math.random() * difference;

                    if (Math.abs(function_of_x.get_func(x)) < 0.000001){
                        root_matrix[i] = x;
                        i++;
                        found = true;
                    } else {
                        if (function_of_x.get_func(a) * function_of_x.get_func(x) < 0) b = x;
                        else a = x;
                    }
                }
            }
        }
    }

    public void results() {

        System.out.printf("\n\nResults for Modified Bisection Method:");
        System.out.printf("\nRoot 1:  x=%.5f  y=%.5f  loops=%d", root_matrix[0],function_of_x.get_func(root_matrix[0]),loops[0]);

        if (number_of_roots == 5){
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1],function_of_x.get_func(root_matrix[1]),loops[1]);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2],function_of_x.get_func(root_matrix[2]),loops[2]);
            System.out.printf("\nRoot 4:  x=%.5f  y=%.5f  loops=%d", root_matrix[3],function_of_x.get_func(root_matrix[3]),loops[3]);
            System.out.printf("\nRoot 5:  x=%.5f  y=%.5f  loops=%d", root_matrix[4],function_of_x.get_func(root_matrix[4]),loops[4]);
        } else if (number_of_roots == 2) System.out.printf("\nRoot: 2  x=%.5f  y=%.5f  loops=%d", root_matrix[1],function_of_x.get_func(root_matrix[1]),loops[1]);

    }

    public int[] get_tables() {

        return loops;

    }
}
