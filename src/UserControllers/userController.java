package UserControllers;

import Models.user;
import UserDB.UserDB;
import UserDB.mockUserDB;

import com.classproj.placeit.iView;

public class userController {
	
	iView viewController; 	//used to call things
	mockUserDB dbcontroller; 
	
	public boolean checkLogin(user theUser) {
		return dbcontroller.isLoggedIn(theUser); 
	}
	
	//Signing up as a user
	public void signup(String username, String password) {
		
		//Check to see if username already exists
		
		for(int i = 0; i< dbcontroller.dbsize(); i++){
			if(dbcontroller.getUser(i).getUsername() == username){
				System.out.println("can you not use the same name"); 
			}
		}
		user newUser = new user(username, password);  
		dbcontroller.addUser(newUser); 
	}
	
	//When a user does a login
	public void login(user theUser) {
		
		for(int i = 0; i<dbcontroller.dbsize(); i++){
			if(dbcontroller.getUser(i) == theUser){
				theUser.setLogin(); //Idk if you want me to change the login and logout stuff for you
			}
		}
		dbcontroller.login(theUser); 
		
	}
	
	//When the user logs out
	public void logout(user theUser){
		
		for(int i = 0; i<dbcontroller.dbsize(); i++){
			if(dbcontroller.getUser(i) == theUser){
				theUser.setLogout(); //Idk if you want me to change the login and logout stuff for you
			}
		dbcontroller.logout(theUser); 
		
	}
   }
}

