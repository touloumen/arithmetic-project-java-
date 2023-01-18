public class Func1_bisection {
    private Func1 func_of_x = new Func1();
    private int number_of_roots=0;
    private int i=0;
    private int[] loops=new int[10];
    private double[] root_matrix= new double[10];
    private double tail,head, x=0,a=0,b=0,adder=0.1,j;
    private boolean found=false;

    public void func1_bisection(int roots){
        number_of_roots=roots;
        i=0;

        for(j=0;j<=3-adder;j=j+adder){
            tail=func_of_x.get_func(j);
            head=func_of_x.get_func(j+adder);
            found=false;

            if(tail*head<0){
                a=j;
                b=j+adder;
                while (!found){
                    loops[i]++;
                    x=(a+b)/2;
                    if(Math.abs(func_of_x.get_func(x)) <0.000001){
                        root_matrix[i]=x;
                        i++;
                        found=true;
                    } else{
                        if(func_of_x.get_func(a)* func_of_x.get_func(x)<0) b=x;
                        else a=x;
                    }
                }
            }
        }

    }
    public void results(){
        System.out.println("\n\nresult of bisection method:");
                System.out.printf("\nRoot 1: x=%.5f y=%.5f loops=%d",root_matrix[0],func_of_x.get_func(root_matrix[0]),loops[0]);
        if (number_of_roots == 3){
            System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1],func_of_x.get_func(root_matrix[1]),loops[1]);
            System.out.printf("\nRoot 3:  x=%.5f  y=%.5f  loops=%d", root_matrix[2],func_of_x.get_func(root_matrix[2]),loops[2]);
        } else if (number_of_roots == 2) System.out.printf("\nRoot 2:  x=%.5f  y=%.5f  loops=%d", root_matrix[1],func_of_x.get_func(root_matrix[1]),loops[1]);

    }


    }




