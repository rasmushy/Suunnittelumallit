import javax.naming.Context;

/**
 * @author rasmushy
 * Example builder class to build database
 */
public class Giga {

    private static Context context;
    private static Class<DatabaseExample> entities;
    private static String version;

    public Giga() {
    }

    public static DatabaseExample databaseBuilder(Context context, Class<DatabaseExample> entities, String version) {
        Giga.context = context;
        Giga.entities = entities;
        Giga.version = version;
        return buildDatabase();
    }

    private static DatabaseExample buildDatabase() {
        // build database from abstract class DatabaseExample
        return null;
    }

}
