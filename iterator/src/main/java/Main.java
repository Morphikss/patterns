import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<User> users = new ArrayList<User>();
    public static void main( String[] args ) {
        users.add(new User("Janusz", "Janusz1"));
        users.add(new User("Andrzej", "Andrzej1"));
        users.add(new User("Jan", "Jan1"));
        users.add(new User("Tomasz", "Tomasz1"));

        printUsers(new UserListIterator(users));
    }

    public static void printUsers(Iterator iterator){
        if(iterator != null){
            while(iterator.hasNext()) System.out.println(iterator.next());
        }
    }

}
