package libraryStream;

public class EmailAddress {
    private String email; // адрес почты
    private String someData;  // доп информация

    public EmailAddress(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "email='" + email + '\'' +
                ", someData='" + someData + '\'' +
                '}';
    }
}
