public class Arithmetic<sum> {
    private static int sum;
    private static String sumstr;
    private static float sum_float;
    //String sumstr;
    //  private static int sum;
    int i1,i2,i3;
    float f1,f2,f3;
    double d1,d2;
    //int sum;
    String str1= new String();
    String str2 = new String();
    public static int add(int i1, int i2){

        sum = i1+i2;
        return sum;
    }
    public static int add(int i1, int i2, int i3){
        sum = i1+i2+i3;
        return sum;
    }

    public static String add( String str1, String str2){
        sumstr = str1+str2;
        return sumstr;
    }

    public static float add(float f1, int i2, int i3){
        sum_float = f1+i2+i3;
        return sum_float;
    }
}
