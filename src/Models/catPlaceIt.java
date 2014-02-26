package Models;

import java.util.ArrayList;
import java.util.Date;

public class catPlaceIt extends singlePlaceIt {

	int _id;
    String _title;
    String _description;
    double _latitude;
    double _longitude;
    long _activeDate;
    String _displayType;
    ArrayList<String> _cat;
    
	public catPlaceIt() {
		// TODO Auto-generated constructor stub
		_cat = new ArrayList<String>();
	}

	public catPlaceIt(String title, String description, double latitude,
			double longitude, long date) {
		super(title, description, latitude, longitude, date);
		// TODO Auto-generated constructor stub
		_cat = new ArrayList<String>();
	}

	public catPlaceIt(String title, String description, double latitude,
			double longitude) {
		super(title, description, latitude, longitude);
		// TODO Auto-generated constructor stub
		_cat = new ArrayList<String>();
	}

	public catPlaceIt(String title, String description) {
		super(title, description);
		// TODO Auto-generated constructor stub
		_cat = new ArrayList<String>();
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLongitude(double longitude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLatitude(double latitude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getActiveDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActiveDate(long sd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

}
