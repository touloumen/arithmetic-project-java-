public class Func2 {
    private static double y;

    public Func2() {
        y = 0;
    }

    public double get_func(double x){
        y = 54*Math.pow(x,6)+45*Math.pow(x,5)-102*Math.pow(x,4)-69*Math.pow(x,3)+35*Math.pow(x,2)+16*x-4;
        return y;
    }

    public double get_func_1der(double x){
        y = 324*Math.pow(x,5)+225*Math.pow(x,4)-408*Math.pow(x,3)-207*Math.pow(x,2)+70*x+16;
        return y;
    }

    public double get_func_2der(double x){
        y = 1620*Math.pow(x,4)+900*Math.pow(x,3)-1224*Math.pow(x,2)-414*x+70;
        return y;
    }
}
