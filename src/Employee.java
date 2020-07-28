public class Employee extends User {
    private String fullName;
    private int age;
    private String gender;
    private int id;
    private String emailAddress;
    private String description;

    public Employee(String firstName, String lastName, String eMail, String address,
                    String zip, String city, String phone, String name, int age, String gender,
                    int iD, String emailAddress, String description) {
        super(firstName, lastName, eMail, address, zip, city, phone);
        this.fullName = name;
        this.age = age;
        this.gender = gender;
        this.id = iD;
        this.emailAddress = emailAddress;
        this.description = description;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getiD() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setiD(int iD) {
        this.id = iD;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", iD=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


