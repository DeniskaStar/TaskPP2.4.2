package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByEmail (String email);

    void save(User user);

    void update(Long id, User userUpdate);

    void delete(Long id);
}
