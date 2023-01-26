import java.io.*;
class GenArray{
   
    public static void main(String args[]){
        Integer[] ia= {1,3,5,2,6,3};
        Double[] da={2.44,5.63,6.82,8.21,4.59};
        Float[] fa={45.57f,55.58f,94.56f,44.68f,22.46f};
        print(ia);
        print(da);
       print(fa);
    }
    public static <Gii> void print(Gii[] a){
         int n=0;
        for(Gii el:a){
            System.out.println(el);
            n++;
        }
        System.out.println("length of array is "+n);
    }
}
