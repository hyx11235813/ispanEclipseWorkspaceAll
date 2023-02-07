package userDao;

import java.util.ArrayList;

import bean.User;

public interface IUserDAO {

	// c
	boolean createPerson(User person);

	// r
	User findPersonByName(String name);
	// ArrayList<User> findAllPerson();

	// u
	boolean updatePerson(User person);

	// d
	boolean deletPersonByid(int id);
}
