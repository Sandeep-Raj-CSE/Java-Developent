import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) throws MyException{

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();


        if(age > 100){
            throw new MyException();
        }
    }
}


class MyException extends Exception {


}
