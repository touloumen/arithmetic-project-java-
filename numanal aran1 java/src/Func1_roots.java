public class Func1_roots {
    private Func1 func_of_x = new Func1();
    private int number_of_roots = 0;
    private double i = 0;
    private double adder = 0.01;
    private double tail;
    private double head;

    public Func1_roots(){
        tail=func_of_x.get_func(0);
        head=func_of_x.get_func(adder);
        for (i=(-2+(2*adder)); i<=2; i+=adder){
            if (tail * head < 0) number_of_roots++;
            tail = head;
            head = func_of_x.get_func(i);
        }
    }

    public int get_roots() {
        return number_of_roots;
    }

}
