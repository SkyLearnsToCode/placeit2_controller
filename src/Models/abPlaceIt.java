package Models;

import com.google.android.gms.maps.model.Marker;

public class abPlaceIt {

		String _id;
		String _title;
		String _description;
		//double _latitude;
		//double _longitude;
		long _activeDate;
		String _displayType;

		// Empty constructor
		public abPlaceIt() {
			Double id = Math.floor(Math.random() * 100);
			this._id = id.toString();
		}

		// constructor

		public abPlaceIt(String id, String title, String description, long date) {
			this._id = id;
			this._title = title;
			this._description = description;
			//this._latitude = latitude;
			//this._longitude = longitude;
			this._activeDate = date;
		}

		public abPlaceIt(String title, String description, long date) {
			this._title = title;
			this._description = description;
			//this._latitude = latitude;
			//this._longitude = longitude;
			this._activeDate = date;
		}

		public abPlaceIt(String title, String description) {
			this._title = title;
			this._description = description;
			//this._latitude = latitude;
			//this._longitude = longitude;
			this._activeDate = new java.util.Date().getTime();
		}

		// getting ID
		public String getID() {
			return this._id;
		}

		// setting ID
		public void setID(String id) {
			this._id = id;
		}

		// getting title
		public String getTitle() {
			return this._title;
		}

		// setting title
		public void setTitle(String title) {
			this._title = title;
		}

		// getting description
		public String getDescription() {
			return this._description;
		}

		// setting description
		public void setDescription(String description) {
			this._description = description;
		}

		/*
		// getting longitude
		public double getLongitude() {
			return this._longitude;
		}

		// setting description
		public void setLongitude(double longitude) {
			this._longitude = longitude;
		}

		// getting longitude
		public double getLatitude() {
			return this._latitude;
		}

		// setting description
		public void setLatitude(double latitude) {
			this._latitude = latitude;
		}
		*/
		
		// getting date
		public java.util.Date getActiveDate() {
			return new java.util.Date(this._activeDate);
		}

		// setting description
		public void setActiveDate(long sd) {
			this._activeDate = sd;
		}

		
		public boolean isActive() {
			return this._activeDate != 0;
		}
}
