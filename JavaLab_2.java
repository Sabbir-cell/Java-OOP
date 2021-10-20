package ClassObject;
//Lab task two
import java.util.Scanner;

public class JavaLab {
    int id;
    String name;
    int  age;

    JavaLab(){}
    JavaLab(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name +" "+age+" "+id );
    }
    static void display1(){
        System.out.println("Successflly done");
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int id1 = obj.nextInt();
        obj.nextLine();
        String name1 = obj.nextLine();
        int age1 = obj.nextInt();

        JavaLab o1 = new JavaLab(id1, name1, age1);

        int id2 = obj.nextInt();
        obj.nextLine();
        String name2 = obj.nextLine();
        int age2 = obj.nextInt();

        JavaLab o2 = new JavaLab(id2, name2, age2);



        int k = 1;
        switch (k){
            case 1:
                o1.display();
                o2.display();
                break;
            case 2:
                JavaLab.display1();
                break;
        }
    }
}
