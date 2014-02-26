package Models;

public abstract class PlaceIt {
    
    // Empty constructor
    public PlaceIt(){
         
    }
    // constructor
    
    public PlaceIt(String title, String description, double latitude, double longitude, long date){
       
    }
    
    public PlaceIt(String title, String description, double latitude, double longitude){
       
    }
    

     
    // constructor
    public PlaceIt(String title, String description){
        
    }
    // getting ID
    abstract public int getID();
     
    // setting ID
    abstract public void setID(int id);
     
    // getting title
    abstract public String getTitle();
     
    // setting title
    abstract public void setTitle(String title);
     
    // getting description
    abstract public String getDescription();
     
    // setting description
    abstract public void setDescription(String description);
    
    // getting longitude
    abstract public double getLongitude();
     
    // setting description
    abstract public void setLongitude(double longitude);
    
    // getting longitude
    abstract public double getLatitude();
     
    // setting description
    abstract public void setLatitude(double latitude);
    
    // getting date
    abstract public java.util.Date getActiveDate();
     
    // setting description
    abstract public void setActiveDate(long sd);

    abstract public boolean isActive();
}