package AdvancedKurs.InnerClass;

public class Test {
    public static void main(String[] args) {
        Person.Adress ad =  new Person(). new Adress();

        int x = 10 ;
        int y = 20 ;

        if(x > y){
            System.out.println("X > Y");
        }


        boolean isOkay = false;
        if(isOkay){
            System.out.println("OKAY");
        }

    }
}
