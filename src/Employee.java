public class Employee extends User {
    private String name;
    private int age;
    private String gender;
    private int iD;
    private String emailAddress;
    private String description;

    public Employee(String firstName, String lastName, String eMail, String address,
                    String zip, String city, String phone, String name, int age, String gender,
                    int iD, String emailAddress, String description) {
        super(firstName, lastName, eMail, address, zip, city, phone);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.iD = iD;
        this.emailAddress = emailAddress;
        this.description = description;
    }




}


