package classroom;

public class java_constructer {
    // Create a Main class
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public java_constructer () {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            java_constructer myObj = new java_constructer(); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
    }


