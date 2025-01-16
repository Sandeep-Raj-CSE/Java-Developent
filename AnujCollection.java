import java.util.Arrays;

public class AnujCollection {
    public static void main(String[] args) {

        /*
        Exception example
        int a[] = new int[5];
        System.out.println(a[0]);
        System.out.println(a[8]);
        System.out.println("Hello Guys");

         */

/*
        int arr[] = new int[5];
        System.out.println("Hey Guys");


        try{
//            try {
//                int rs = 5/0;
//            }catch (ArithmeticException e){
//                System.out.println("Airthmetic exception");
//            }

            int rs = 5/0;

            System.out.println(arr[8]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of Bound");
        }catch (ArithmeticException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getMessage());
           System.out.println(e);
        }



 */



        int arr[] = new int[5];
        System.out.println("Hey Guys");

        try{


            int rs = 5/0;

            System.out.println(arr[8]);

        } catch (Exception e) {
            System.out.println("ALl HANDKING ");
        }



        System.out.println("By Guys");


        try{
            getNum(arr);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

    static int getNum (int a[]) throws ArithmeticException{
        return a[8];
    }
}
