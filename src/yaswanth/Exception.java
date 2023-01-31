package yaswanth;

public class Exception{
    public static void main(String[]args){
        int num[]={1,2,3,4};
        try{
            System.out.println("first line"+num[2]);
            System.out.println(("second line"+num[6]));
            System.out.println((10/0));
        }catch (ArrayIndexOutOfBoundsException as){
            System.out.println(as.getMessage());
        }catch (ArithmeticException ae){
            System.out.println((ae.getMessage()));

        }



    }
}