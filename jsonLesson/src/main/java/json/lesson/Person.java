package json.lesson;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Course course;
    private List<String> personalContacts;

    public Person() {}

    public Person(String firstName, String lastName, Course course, List<String> personalContacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.personalContacts = personalContacts;
    }

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    public void setPersonalContacts(List<String> personalContacts) {
        this.personalContacts = personalContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", personalContacts=" + personalContacts +
                '}';
    }
}
