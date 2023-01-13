import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String owner;
    private Person person=new Person();

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public   void  hasOwner(){
        if (Objects.equals(owner, person.getName())) {
            System.out.println("Ээси бар, анын аты -> " + getOwner());
        }else {
            System.out.println("Бездомный " );
        }
    }

}
