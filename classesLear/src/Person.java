import java.time.OffsetDateTime;

public class Person {
    private final String name;
    private int age;

    //Getter and Setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int lastAgeYearIncremented = OffsetDateTime.now().getYear();

    public void incAge(){
        if(this.lastAgeYearIncremented >= OffsetDateTime.now().getYear())return;
        // No increment if the year hasn't changed

        this.age++;
        this.lastAgeYearIncremented = OffsetDateTime.now().getYear();
    }

    //constructors
    public Person(String name) {
        this.name = name;
        this.age = 1;
    }
}