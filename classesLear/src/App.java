public class App {
    public static void main(String[] args) {
        // var male = new Person("John"); //instancia de masculino

        // var female = new Person("Jane"); //instancia de femenino

        // System.out.printf("Male name: %s, age: %d\n", male.getName(),male.getAge());
        // System.out.printf("Female name: %s, age: %d\n", female.getName(),female.getAge());

        var person = new PersonRec("John", 12);
        System.out.println(person);
        System.out.println(person.name());
        
        person.name = "JANE";
    }
}
