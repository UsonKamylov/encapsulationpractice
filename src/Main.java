public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.setName("Tom");
//        animal.setAge(4);
//        System.out.println("name is " + animal.getName());
//        System.out.println("age " + animal.getAge());


        Person person = new Person();
        Cat cat = new Cat();
        person.setName("Alex");
        person.setLastName("Sanches");
        System.out.println("Name Person " + person.getName());
        System.out.println("LastName " + person.getLastName());

        cat.setName("Tom");
        cat.setAge(4);
        cat.setWeight(3.4);
        cat.setOwner("Alex");
        cat.setPerson(person);
        System.out.println("Name Cat " + cat.getName());
        System.out.println("age Cat " + cat.getAge());
        System.out.println("weight Cat " + cat.getWeight());
        System.out.println("owner Cat " + cat.getOwner());
        cat.hasOwner();

    }
}