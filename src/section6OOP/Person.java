package section6OOP;

public class Person {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Roy");
        person.setLastName("Jones");
        person.setAge(77);
        System.out.println("is teen = " + person.isTeen());
        System.out.println("full name is " + person.getFullName());

    }

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age < 0 || age > 100){
           age = 0;
       }
        this.age = age;
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty()) {
            return lastName;
        }

        return firstName + " " + lastName;
    }


}
