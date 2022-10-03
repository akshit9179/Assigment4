package oops;
public class AbstractionTest {
public static void main(String[] args)
{
Shape1 s1 = new Circle("Red", 2.2);
Shape1 s2 = new Rectangle("Yellow", 2, 4);

System.out.println(s1.toString());
System.out.println(s2.toString());
}
}