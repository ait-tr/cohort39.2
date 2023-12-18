package oop.repository;

public interface UserRepository {

    public void add(UserEntity entity);

    public void changeUserName(int userId, String newUserName);

    public UserEntity[] getDatabase();
}
