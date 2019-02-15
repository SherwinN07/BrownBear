
/**
 * Write a description of class ZooAnimal here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public class ZooAnimal
{
    // instance variables - replace the example below with your own
    private int age;
    private int weight;
    private double height;
    private String animal;
    private Boolean canSwim = true;

    public ZooAnimal()
    {
        age = 0;
        weight = 0;
        height = 0;
        animal = "";
        canSwim = true;
    }
    public ZooAnimal(int age, int weight, double height,
                        String animal, boolean canSwim)
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.animal = animal;
        this.canSwim = canSwim;  
    }
    public void toString()
    {
        System.out.println("The Brown Bear 
    
    public void animalInfo()
    {
        System.out.println("This animal is a(n) " + animal + ". It weighs " + weight +
        "pounds" + "and is " + height + "inches tall");
        if(canSwim == true)
        {
            System.out.println("This " + animal + "can swim well");
        }
    }
    
    public String hungryAnimal()
    {
        int num1;
        String food = "";
        num1 = (int)(Math.random() * 5);
        if(num1 == 0)
        {
            food = "grass";
        }
        if(num1 == 1)
        {
            food = "fruits";
        }
        if(num1 == 2)
        {
            food = "fish";
        }
        if(num1 == 3)
        {
            food = "insects";
        }
        if(num1 == 4)
        {
            food = "meat";
        }
        return "This " + animal + " is hungry for: " + food;
    }
}
