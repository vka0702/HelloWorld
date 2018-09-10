public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  more() {
        System.out.println("Cat " + this.name + " is moving");
    }
}
