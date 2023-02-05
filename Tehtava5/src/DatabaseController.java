import javax.naming.Context;
import java.awt.desktop.AppForegroundListener;

/**
 * @author rasmushy
 * Example databaseController class to use abstract singleton class DatabaseExample
 */
public class DatabaseController {
    private UserDao userDao;

    public DatabaseController(Context context) {
        DatabaseExample dbExample = DatabaseExample.getInstance(context);
        userDao = dbExample.userDao();
    }

    public User getUser(String username) {
        return userDao.getUser(username);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    public void printUser(String username) {
        User user = userDao.getUser(username);
        System.out.println(user);
    }

}
