public class Func2_secant {

    private Func2 function_of_x = new Func2();
    private double[] root_matrix = new double[10];
    private int number_of_roots , i = 0;
    private int[] loops = new int[10];
    private double q , r , s , a1 = 0 , a2 = 0 , a3 = 0;

    public void ex_2_Secant_Method(double a,double b,double c,int roots) {

        number_of_roots = roots;
        a1=a;
        a2=b;
        a3=c;
        loops[i]++;

        while (Math.abs(function_of_x.get_func(a1)) > 0.000001) {
            q = (function_of_x.get_func(a1)/(function_of_x.get_func(a2)) );
            r = (function_of_x.get_func(a3)/(function_of_x.get_func(a2)) );
            s = (function_of_x.get_func(a3)/(function_of_x.get_func(a1)) );
            a1 = a3 - ((  (r*(r-q)*(a3 - a2) ) + ( (1-r)*s*(a3 - a1) ) ) / ((q-1)*(r-1)*(s-1)));
            loops[i]++;
        }

        root_matrix[i] = a1;
        i++;

    }

    public void results() {

        System.out.printf("\n\nResults for Modified Secant Method:");
        System.out.printf("\nRoot 1:  x=%.5f  y=%.5f  loops=%d", root_matrix[0],function_of_x.get_func(root_matrix[0]),loops[0]);

        if (number_of_roots == 5){
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1],function_of_x.get_func(root_matrix[1]),loops[1]);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2],function_of_x.get_func(root_matrix[2]),loops[2]);
            System.out.printf("\nRoot 4:  x=%.5f  y=%.5f  loops=%d", root_matrix[3],function_of_x.get_func(root_matrix[3]),loops[3]);
            System.out.printf("\nRoot 5:  x=%.5f  y=%.5f  loops=%d", root_matrix[4],function_of_x.get_func(root_matrix[4]),loops[4]);
        } else if (number_of_roots == 2) System.out.printf("\nRoot #2  x=%.5f  y=%.5f  loops=%d", root_matrix[1],function_of_x.get_func(root_matrix[1]),loops[1]);

    }

}
