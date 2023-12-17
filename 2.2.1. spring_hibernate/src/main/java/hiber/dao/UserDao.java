package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   /**
    * У разных User могут быть одинаковые Car
    */

   List<User> getUsersCarAndSeries(String model,int series);
}
