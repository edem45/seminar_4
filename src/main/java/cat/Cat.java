package cat;

public class Cat {
    protected String name;
    protected int age;
    public void printInfo(){
        System.out.println("meow! my name is " + name
                + " my age is " + age );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}