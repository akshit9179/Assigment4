package oops;


 

class PolymorphismTest {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1
        Parent1 a;
 
        // Now we will be calling print methods
        // inside main() method
 
        a = new subclass1();
        a.Print();
 
        a = new subclass2();
        a.Print();
    } 
}
