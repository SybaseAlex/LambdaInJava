package lambdainjava;

import com.alex.collections.LambdaWithCollection;
import com.alex.collections.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lambdainjava.radionov.FunctionManager;

/**
 *
 * @author Alex
 */
public class LambdaInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FunctionManager.run(8.8);
        
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("vasya", "1", 20));
        listOfUsers.add(new User("sergey", "2", 20));
        listOfUsers.add(new User("kolya", "3", 20));
        
        LambdaWithCollection lambda = new LambdaWithCollection(listOfUsers);
        lambda.fiterAndMap();
        
        //sort the list of users
        listOfUsers.sort((User o1, User o2) -> o1.getName().compareTo(o2.getName()));
        listOfUsers.forEach(user -> System.out.println(user.getName()));
        listOfUsers.forEach(System.out::println);
        
        System.out.println(listOfUsers.stream().map(user -> user.getName()).collect(Collectors.joining(", ")));
        
        
    }
    
}
