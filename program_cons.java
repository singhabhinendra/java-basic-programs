class java {
    String name;
    int id;

    java(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    java(java obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
class abhi {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        java geek1 = new java("avinash", 68);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        java geek2 = new java(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName :" + geek2.name
                + " and GeekId :" + geek2.id);
    }
}
