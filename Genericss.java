public class Genericss {

    public static void main(String[] args) {

        Dog d1 = new Dog("abc",12);
        Dog d2 = new Dog("def",14);

        Dog d3 = new Dog(12,"abc");
    }
}


class Dog<E,V>{
    E id;
    V name;

    public Dog(E id, V name){
        this.id=id;
        this.name=name;
    }



    E getId(){
       return id;
    }

}

