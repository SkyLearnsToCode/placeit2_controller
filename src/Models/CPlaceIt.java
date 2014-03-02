package Models;

import java.util.ArrayList;
import java.util.Date;

public class CPlaceIt extends PlaceIt {

	int _id;
    String _title;
    String _description;
    double _latitude;
    double _longitude;
    long _activeDate;
    String _displayType;
    ArrayList<String> _cat;
    
	public CPlaceIt() {
		// TODO Auto-generated constructor stub
		_cat = new ArrayList<String>();
	}


	public CPlaceIt(String title, String description, ArrayList<String> clist) {
		// TODO Auto-generated constructor stub
		_title = title;
		_description = description;
		_cat = clist;
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
