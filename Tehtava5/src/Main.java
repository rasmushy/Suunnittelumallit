import javax.naming.Context;

/**
 * @author: rasmushy
 * Example Singleton class can be found under DatabaseExample.java
 * Note: no real database implementation, just example how to use singleton
 */
public class Main {
    public static void main(String[] args) {
        // Init singleton database, in example its null thought
        Context context = null; // program wont run cause we have no application context
        DatabaseController dbController = new DatabaseController(context);
        // We use DatabaseController instead of DatabaseExample abstract singleton class
        //User user = dbController.getUser("rasmushy");
        //System.out.println(user);
    }
}