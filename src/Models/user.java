package Models;

public class user {
	
	String username; 
	String password;  
	boolean isLoggedIn; 
	
	public user(String inputusername, String inputpassword) {
		username = inputusername; 
		password = inputpassword; 
		isLoggedIn = false; 
	}
	
	public String getUsername(){
		return this.username; 
	}
	
	public String getPassword() {
		return this.password; 
	}
	
	public void setUsername(String newusername) {
		this.username = newusername; 
	}
	
	public void setPassowrd(String newusername) {
		this.username = newusername; 
	}
	
	public void setLogin(){
		this.isLoggedIn= true; 
	}
	
	public void setLogout(){
		this.isLoggedIn = false; 
	}

	public boolean getLoggedIn() {
		// TODO Auto-generated method stub
		return isLoggedIn; 
	}
	
}
