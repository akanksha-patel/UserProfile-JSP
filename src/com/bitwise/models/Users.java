package com.bitwise.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
	
	private List<User> users = new ArrayList<User>();
	
	
	
	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}

	public List<User> getUsers() {
		return users;
	}

	public Users(){
		users.add(new User("2608.akanksha@gmail.com","1234"));
		users.add(new User("1106.priyansh@gmail.com","1234"));
		users.add(new User("2205.pooja@gmail.com","1234"));
		users.add(new User("2606.sakshi@gmail.com","1234"));
	}

}
