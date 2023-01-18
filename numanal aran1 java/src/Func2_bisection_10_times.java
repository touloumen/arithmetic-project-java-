public class Func2_bisection_10_times {
    private Func2_bisection bisection_func_2 = new Func2_bisection();
    private double i=0;
    private int[] exec_loops = new int[10];
    private int[] loops = new int[30];
    private int number_of_roots , sum = 0 , low , high;

    public void ex_2_Bisection_Method_10_times_exec(int roots) {

        number_of_roots = roots;

        for (int bisec_count=0;bisec_count<10;bisec_count=bisec_count+1){
            i = 0;
            bisection_func_2.ex_2_Bisection_Method(number_of_roots);
            exec_loops = bisection_func_2.get_tables();
            loops[bisec_count] = exec_loops[0];
            if (number_of_roots == 2) loops[bisec_count+1] = exec_loops[1];
            else if (number_of_roots == 5) {
                loops[bisec_count+1] = exec_loops[1];
                loops[bisec_count+2] = exec_loops[2];
            }

        }
        results();
    }

    public void results() {

        if (number_of_roots == 5) {
            System.out.printf("\n\nResults for Modified Bisection (x10 times run):\n");
            low = 10000000;
            high = loops[0];
            for (int par_counter = 0; par_counter < 10; par_counter++) {
                sum = loops[par_counter] + loops[par_counter + 1] + loops[par_counter + 2];
                if (sum < low) low = sum;
                if (sum > high) high = sum;
                System.out.printf("Total for run number %2d:%5d", par_counter + 1, sum);
                System.out.printf("\n");
            }
            System.out.printf("\nFastest and slowest loops difference: %d.\n", high - low);
        } else if (number_of_roots == 2) {
            System.out.printf("\n\nResults for Modified Bisection (x10 run)\n");
            low = loops[0];
            high = loops[0];
            for (int par_counter = 0; par_counter < 10; par_counter++) {
                sum = loops[par_counter] + loops[par_counter + 1];
                if (sum < low) low = sum;
                if (sum > high) high = sum;
                System.out.printf("Total for run number %2d:%5d", par_counter + 1, sum);
                System.out.printf("\n");
            }
            System.out.printf("\nFstest and slowest loops difference: %d.\n", high - low);
        } else if (number_of_roots == 1) {
            System.out.printf("\n\nResults for Modified Bisection (x10 run)\n");
            low = loops[0];
            high = loops[0];
            for (int par_counter = 0; par_counter < 10; par_counter++) {
                sum = loops[par_counter];
                if (sum < low) low = sum;
                if (sum > high) high = sum;
                System.out.printf("Total for loop number %2d:%5d", par_counter + 1, sum);
                System.out.printf("\n");
            }
            System.out.printf("\nFastest and slowest loops difference: %d.\n", high - low);

        }
    }

}
