public class constructor {  // Class name should start with an uppercase letter
  
    int A;
    String name; // Corrected declaration

    // Constructor
    constructor() {  
        A = 0;
        name = null;
    }

    // Method to display values
    void show() {  
        System.out.println(A + " " + name); // Fixed variable name and missing semicolon
    }

    public static void main(String[] args) {
        constructor obj = new constructor(); // Creating an object
        obj.show(); // Calling the method
    }
}

