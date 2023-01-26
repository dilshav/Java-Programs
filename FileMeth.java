import java.io.*;
class FileMeth{
    public static void main(String args[]){
        try{
            FileOutputStream f =new FileOutputStream("test.txt");
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("enter text into file");
            String dt= dis.readLine();
            f.write(dt.getBytes());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}