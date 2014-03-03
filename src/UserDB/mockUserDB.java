package UserDB;

import java.util.ArrayList;

import Models.user;

public class mockUserDB implements UserDB {

	ArrayList<user> userdb = new ArrayList<user>(); 
	@Override
	public void deleteUser(user theUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(user theUser) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addUser(user newUser) {
	
		userdb.add(newUser); 
	}

	@Override
	public boolean isLoggedIn(user theUser) {
		for(int i = 0; i< userdb.size(); i++){
			if(userdb.get(i) == theUser){
				if(userdb.get(i).getLoggedIn()){
					return true; 
				}
				
			}
		}
		return false;
	}

	@Override
	public int dbsize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public user getUser(int i) {
		// TODO Auto-generated method stub
		return userdb.get(i); 
	}

	@Override
	public ArrayList<user> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(user theUser) {
		// TODO Auto-generated method stub
	}

	@Override
	public void login(user theUser) {

		
	}

}
