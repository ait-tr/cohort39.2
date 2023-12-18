package oop.repository;

public class UserEntity {

    /*
Создать класс UserEntity с учетом, что вы уже знаете, что такое инкапсюляция.
У класса UserEntity должны быть поля:
  - id
  - имя
  - фамилия
  - персональный код

 */

    private Integer id;
    private String userName;
    private String userSurname;
    private String userPersonalCode;

    public UserEntity(Integer id, String userName, String userSurname, String userPersonalCode) {
        this.id = id;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userPersonalCode = userPersonalCode;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserPersonalCode() {
        return userPersonalCode;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userPersonalCode='" + userPersonalCode + '\'' +
                '}';
    }
}
