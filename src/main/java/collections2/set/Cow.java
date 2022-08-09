package collections2.set;

import java.util.Objects;

public class Cow implements Comparable<Cow> {

    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return age == cow.age && Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Cow other) {   // tu ustawiłam sortowanie po wieku, a jeśli wiek jest ten sam to sortuje po imieniu
        int ageCompare = age - other.getAge();  // ta metoda jest nadpisana z interfejsu Comparable!
        if (ageCompare == 0) {
            return name.compareTo(other.getName());
        } else return ageCompare;
    }
}
