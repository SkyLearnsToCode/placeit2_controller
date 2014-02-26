/**
 * 
 */
package Models;

/**
 * @author SKY
 *
 */
public class singlePlaceIt extends PlaceIt {

	/**
	 * 
	 */
	int _id;
    String _title;
    String _description;
    double _latitude;
    double _longitude;
    long _activeDate;
    String _displayType;
    
	public singlePlaceIt() {
		// TODO Auto-generated constructor stub
	}

	
	public singlePlaceIt(String title, String description, double latitude,
			double longitude, long date) {
		super(title, description, latitude, longitude, date);
		// TODO Auto-generated constructor stub
		 	this._title = title;
	        this._description = description;
	        this._latitude = latitude;
	        this._longitude = longitude;
	        this._activeDate = date;
	}

	
	public singlePlaceIt(String title, String description, double latitude,
			double longitude) {
		super(title, description, latitude, longitude);
		// TODO Auto-generated constructor stub
		 	this._title = title;
	        this._description = description;
	        this._latitude = latitude;
	        this._longitude = longitude;
	        this._activeDate = new java.util.Date().getTime();
	}

	/**
	 * @param title
	 * @param description
	 */
	public singlePlaceIt(String title, String description) {
		super(title, description);
		// TODO Auto-generated constructor stub
		this._title = title;
        this._description = description;
	}
	
	 public int getID(){
	    	return this._id;
	    }
	     
	    // setting ID
	    public void setID(int id){
	        this._id = id;
	    }
	     
	    // getting title
	    public String getTitle(){
	        return this._title;
	    }
	     
	    // setting title
	    public void setTitle(String title){
	        this._title = title;
	    }
	     
	    // getting description
	    public String getDescription(){
	        return this._description;
	    }
	     
	    // setting description
	    public void setDescription(String description){
	        this._description = description;
	    }
	    
	    // getting longitude
	    public double getLongitude(){
	        return this._longitude;
	    }
	     
	    // setting description
	    public void setLongitude(double longitude){
	        this._longitude = longitude;
	    }
	    
	    // getting longitude
	    public double getLatitude(){
	        return this._latitude;
	    }
	     
	    // setting description
	    public void setLatitude(double latitude){
	        this._latitude = latitude;
	    }
	    
	    // getting date
	    public java.util.Date getActiveDate(){
	        return new java.util.Date(this._activeDate);
	    }
	     
	    // setting description
	    public void setActiveDate(long sd){
	        this._activeDate = sd;
	    }

		public boolean isActive() {
			return this._activeDate != 0;
		}

}
