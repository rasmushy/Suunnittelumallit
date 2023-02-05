import javax.naming.Context;

/**
 * @author rasmushy
 * Singleton class
 */
public abstract class DatabaseExample extends Giga {

    private static volatile DatabaseExample INSTANCE;

    static DatabaseExample getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseExample.class) {
                if (INSTANCE == null) {
                    INSTANCE = Giga.databaseBuilder(context, DatabaseExample.class, "example_db_version_1");
                }
            }
        }
        return INSTANCE;
    }

    // initialize example dao's
    public abstract UserDao userDao();

}
