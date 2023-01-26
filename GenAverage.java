import java.io.*;
class GenAverage{
    public static<G extends Number> double print(G[] a){
        double sum=0.0;
        int n=0;
        for(G el:a){
            sum=sum+el.doubleValue();
            n++;
        }
        double t=sum/n;
        return t;
    }
    public static void main(String args[]){
        Integer[] ia={2,6,4,9,5};
        Double[] da={2.8,5.8,4.7,8.6,3.4};
        print(ia);
        double c=print(ia);
        print(da);
        double d=print(da);
        if(c>d){
            System.out.println("ave of Integer array is"+c+", thus it is greater");
        }
        else{
            System.out.println("ave of double array is"+d+", thus it is greater");
        }
    }
}