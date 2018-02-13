// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
	    Yorkshire ys = new Yorkshire("Yorkshire");
	    Labrador lb = new Labrador("Labrador", "Blue");

        System.out.println(String.format("%s says %s", ys.getName(), ys.speak()));
        System.out.println(String.format("%s says %s", lb.getName(), lb.speak()));

        System.out.println(String.format("%s average weight: %d", ys.getName(), ys.avgBreedWeight()));
        System.out.println(String.format("%s average weight: %d", lb.getName(), lb.avgBreedWeight()));
    }
}