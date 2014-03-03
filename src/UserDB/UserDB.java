package UserDB;

import java.util.ArrayList;

import Models.user;

public interface UserDB {
	
	//Delete user
	public void deleteUser(user theUser); 
	
	//Update user
	public void updateUser(user theUser);

	//Add User
	public void addUser(user newUser); 
	
	//Check to make sure the user has a login
	public boolean isLoggedIn(user theUser);
	
	//Returns the size of the database
	public int dbsize(); 
	
	//Get the user
	public user getUser(int i);
	
	//Get a list of all the current users
	public ArrayList<user> getAllUser(); 
	
	//Called when user logs out
	public void logout(user theUser);
	
	//Called when user logs in
	public void login(user theUser);
	
	
}
