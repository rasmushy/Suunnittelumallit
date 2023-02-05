/**
 * Interface for user data access object
 *
 * @author rasmushy
 */
public interface UserDao {

    User getUser(String username);

    void updateUser(User user);

    void insertUser(User user);

    void deleteUser(User user);
}
