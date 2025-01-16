public class GenericMethod {

    public static void main(String[] args) {

        printData(123);
        printData("rahul");
    }


    static <E> void printData(E data){
        System.out.println(data);
    }

}
