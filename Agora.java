package classobject;

public class Agora {
    int prod_id;
    String prod_name;
    int prod_price;
    int quantity;
    Agora(){
        // default constructor
    }
    Agora(int prod_id, String prod_name, int prod_price,  int quantity){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.quantity = quantity;
    }
    void display(){
        System.out.println("Product Information:" + prod_id +" "+ prod_name + " "+ prod_price +" "+quantity);
    }
    void discount(){
        int main_price = prod_price*quantity;
        float discounted_price = (float) (main_price*.10);
        float after_discount = main_price - discounted_price;
        System.out.println("product name:" +prod_name + " " +main_price+ " after 10% discount" +after_discount);
    }
}

