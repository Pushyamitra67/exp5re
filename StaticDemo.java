public class StaticDemo {

    // 1. Static Variable: Shared across all instances of the class
    static int objectCounter = 0;

    // Instance variable for contrast (unique to every object)
    String objectName;

    // 2. Static Block: Runs exactly once when the class is first loaded
    static {
        System.out.println("--- Static Block: Class loaded into memory ---");
    }

    // Constructor
    public StaticDemo(String name) {
        this.objectName = name;
        objectCounter++; // Increments the shared class counter
    }

    // 3. Static Method: Can be called without creating an object
    public static void displayTotalObjects() {
        // Can access static variables directly
        System.out.println("Total objects created so far: " + objectCounter);
        
        // Cannot access instance variables directly! 
        // System.out.println(objectName); // This would cause a compile-time error
    }

    // 4. Main Method: Always static so the JVM can run it without creating an object
    public static void main(String[] args) {
        System.out.println("--- Main Method Started ---");

        // Call static method using the Class Name (No object needed)
        StaticDemo.displayTotalObjects();

        // Creating objects
        StaticDemo obj1 = new StaticDemo("Object A");
        StaticDemo obj2 = new StaticDemo("Object B");

        // Call the static method again
        StaticDemo.displayTotalObjects();
        
        // Notice that both objects share the same static counter
        System.out.println(obj1.objectName + " sees counter as: " + StaticDemo.objectCounter);
        System.out.println(obj2.objectName + " sees counter as: " + StaticDemo.objectCounter);
    }
}
