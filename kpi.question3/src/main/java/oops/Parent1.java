package oops;

class Parent1 {

    // Method of parent class
    void Print()
    {
 
        // Print statement
        System.out.println("parent class");
    }
}
 
// Class 2
// Helper class
class subclass1 extends Parent1 {
 
    // Method
    void Print() { System.out.println("subclass1"); }
}
 
// Class 3
// Helper class
class subclass2 extends Parent1 {
 
    // Method
    void Print()
    {
 
        // Print statement
        System.out.println("subclass2");
    }
}
