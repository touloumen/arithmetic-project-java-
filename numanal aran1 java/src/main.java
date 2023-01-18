public class main {
    /**
     * @author Touloumenidis John
     * AEM: 3516
     */

        static int function_ex_1_roots = 0;
        static int function_ex_2_roots = 0;

        static Func1_roots roots_for_ex_1 = new Func1_roots();
        static Func1_bisection bisection_func_1 = new Func1_bisection();
        static Func1_Newton_Raphson new_raph_func_1 = new Func1_Newton_Raphson();
        static Func1_secant sec_func_1 = new Func1_secant();

        static Func2_roots roots_for_ex_2 = new Func2_roots();
        static Func2_Newton_Raphson new_raph_func_2 = new Func2_Newton_Raphson();
        static Func2_bisection bisection_func_2 = new Func2_bisection();
        static Func2_secant sec_func_2 = new Func2_secant();
        static Func2_bisection_10_times bisection_func_2_10_times = new Func2_bisection_10_times();

        static Exc3_Gauss_Seidel gaus_sied = new Exc3_Gauss_Seidel();

        public static void main(String[] args) {

            function_ex_1_roots = roots_for_ex_1.get_roots();
            function_ex_2_roots = roots_for_ex_2.get_roots();

            // Exercise 1 section starts here
            // Exercise_1: Bisection Method
            bisection_func_1.func1_bisection(function_ex_1_roots);
            bisection_func_1.results();

            // Exercise_1: Newton-Raphson Method
            new_raph_func_1.func1_Newton_Raphson(0.3, function_ex_1_roots);
            new_raph_func_1.func1_Newton_Raphson(1, function_ex_1_roots);
            new_raph_func_1.func1_Newton_Raphson(3, function_ex_1_roots);
            new_raph_func_1.results();

            // Exercise_1: Secant Method
            sec_func_1.func1_secant(0.6,1, function_ex_1_roots);
            sec_func_1.func1_secant(1.8, 2.5, function_ex_1_roots);
            sec_func_1.func1_secant(1.4, 1.5, function_ex_1_roots);
            sec_func_1.results();

            // Exercise 2 section starts here
            // Exercise_2: Modified Newton-Raphson Method
            new_raph_func_2.ex_2_Newton_Raphson(-1.9, function_ex_2_roots);
            new_raph_func_2.ex_2_Newton_Raphson(-0.9, function_ex_2_roots);
            new_raph_func_2.ex_2_Newton_Raphson(0.1, function_ex_2_roots);
            new_raph_func_2.ex_2_Newton_Raphson(0.4, function_ex_2_roots);
            new_raph_func_2.ex_2_Newton_Raphson(1, function_ex_2_roots);
            new_raph_func_2.results();

            // Exercise_2: Modified Bisection Method and 10 times execution
            bisection_func_2.ex_2_Bisection_Method(function_ex_2_roots);
            bisection_func_2.results();
            bisection_func_2_10_times.ex_2_Bisection_Method_10_times_exec(function_ex_2_roots);

            // Exercise_2: Modified Secant Method
            sec_func_2.ex_2_Secant_Method(-1.9, -1.7, -1.8, function_ex_2_roots);
            sec_func_2.ex_2_Secant_Method(-1, -0.9, -0.7, function_ex_2_roots);
            sec_func_2.ex_2_Secant_Method(0.1, 0.2, 0.3, function_ex_2_roots);
            sec_func_2.ex_2_Secant_Method(0.3, 0.4, 0.5, function_ex_2_roots);
            sec_func_2.ex_2_Secant_Method(1, 1.1, 1.2, function_ex_2_roots);
            sec_func_2.results();

            // Exercise 3 section starts here
            // Exercise_3: Gauss-Seidel Method
            System.out.printf("\n\n For n = 100 the solution equals to:\n");
            gaus_sied.ex_3_Gauss_Seidel(100);
            System.out.printf("\n\n For n = 10000 the solution equals to:\n");
            gaus_sied.ex_3_Gauss_Seidel(10000);

        }

    }
