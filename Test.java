package classobject;

public class Test {
    public static void main(String[] args) {
        //int prod_id;
        Agora o1 = new Agora(101, "Lays", 50, 20);
        Agora o2 = new Agora(102, "Kitkat", 60, 10);
        Agora o3 = new Agora(103, "Juice", 20, 10);
        Agora o4 = new Agora(104, "BodySpray", 300, 5);

        o1.display();
        o2.display();
        o3.display();
        o4.display();

    if (o1.prod_price*o1.quantity > 500){
        System.out.println("Higher Than 500, Product id and Name: "+o1.prod_id+ " "+ o1.prod_name);
        o1.discount();
    }
    if (o2.prod_price*o2.quantity > 500){
            System.out.println("Higher Than 500, Product id and Name: "+o2.prod_id+ " "+ o2.prod_name);
            o2.discount();
        }
    if (o3.prod_price*o3.quantity > 500){
            System.out.println("Higher Than 500, Product id and Name: "+o3.prod_id+ " "+ o3.prod_name);
            o3.discount();
        }
    if (o4.prod_price*o4.quantity > 500){
            System.out.println("Higher Than 500, Product id and Name: "+o4.prod_id+ " "+ o4.prod_name);
            o4.discount();
        }
    }

}
