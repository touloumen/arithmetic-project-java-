public class Func2_roots {
    private Func2 function_of_x = new Func2();
    private int number_of_roots = 0;
    private double i = 0;
    private double adder = 0.01;
    private double tail;
    private double head;

    public Func2_roots(){

        tail=function_of_x.get_func(0);
        head=function_of_x.get_func(adder);
        for (i=(-2+(2*adder)); i<=2; i+=adder){
            if (tail * head < 0) number_of_roots++;
            tail = head;
            head = function_of_x.get_func(i);
        }
    }
    public int get_roots() {
        return number_of_roots;
    }

}
