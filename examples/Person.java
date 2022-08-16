public class Person {
    private String name;
    private int age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return this.name;
    }

}
