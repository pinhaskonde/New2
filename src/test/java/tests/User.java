package tests;

public class User {

    String firstName;
    String lastName;
    String personalId;
    String phone;
    String dateOfBirth;
    String gender;

    public User() {
    }

    public User(String firstName, String lastName, String personalId,
                String phone, String dateOfBirth, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
}
