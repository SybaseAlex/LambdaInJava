
package com.alex.collections;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author akrivokonev
 */
public class LambdaWithCollection {
    private List<User> listOfUsers;
    
    public LambdaWithCollection(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    public void fiterAndMap() {
               listOfUsers.stream()
               .filter(user -> user.getName().equals("vasya"))
               .map(user -> user.getName())
               .collect(Collectors.toList())
               .forEach(item -> System.out.println(item));

    }
}
