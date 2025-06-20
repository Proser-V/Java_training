public class Cat
{
    private String catName;
    private int catAge;

    public Cat(String name, int age)
    {
        this.catName = name;
        this.catAge = age;
        System.out.println(catName + " -> " + catAge + " years old");
    }
}