public class Func1 {
    private static final double e =Math.E;
    private static double y;
    public Func1(){
        y=0;
    }
    public double get_func(double x){

        y=(14*x*(Math.pow(e,x-2)))-(12*(Math.pow(e,x-2)))-(7*(Math.pow(x,3)))+(20*Math.pow(x,2))-26*x+12;
        return y;
    }
    public double get_func_1der(double x){
        y=(14*x*Math.pow(e,x-2))+(2*Math.pow(e,x-2))-(21*Math.pow(x,2))+ 40*x-26;
        return y;
    }
    public double get_func_2der(double x){
        y=(14*x*Math.pow(e,x-2))+(16*Math.pow(e,x-2))-42*x+40;
        return y;
    }
}
