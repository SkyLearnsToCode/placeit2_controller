package PlaceItControllers;

import java.util.List;
import java.util.Vector;

import Models.CPlaceIt;
import Models.Category;
import PlaceItDB.iCPlaceItModel;
import PlaceItDB.iPlaceItModel;
import android.content.Context;
import android.location.Location;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.location.Location;

import com.classproj.placeit.iCView;
import com.classproj.placeit.iView;
import com.google.android.gms.maps.model.LatLng;

public class CPlaceItController {

	private iCPlaceItModel db;
	private iCView view;
	private List<CPlaceIt> cplaceits;
	List<CPlaceIt> nonActive = new Vector<CPlaceIt>();
	List<CPlaceIt> active = new Vector<CPlaceIt>();
	
 	public CPlaceItController(iCPlaceItModel db, iCView view) {
		this.db = db;
		this.view = view;

		this.cplaceits = new Vector<CPlaceIt>();
	}
	
	public CPlaceIt AddCPlaceIt(String titleText, String descText,
			List<Category> clist) {
		
		// If title and description empty. no Place-It is created, and return null.
		if (titleText.length() == 0 && descText.length() == 0 && clist == null) {
			return null;
		}
		
		// If title is empty but description is not, take first 10 chars of the description to be the title.
		if (titleText.length() == 0) {
			int descLength = descText.length();
			if (descLength < 10) {
				titleText = descText.substring(0, descLength);
			}
			else {
				titleText = descText.substring(0, 10);
			}
		}

		CPlaceIt cplaceit = new CPlaceIt(titleText, descText, clist);
		
		Long insertId = db.addCPlaceIt(cplaceit);
		cplaceit.setID(insertId.toString());
		cplaceits.add(cplaceit);
		return cplaceit;
	}
	
	public void deactivateCPlaceIt(CPlaceIt placeit){
		db.deactivateCPlaceit(placeit);
	}
	
	public void removeCPlaceIt(CPlaceIt placeit){
		
		db.deleteCPlaceIt(placeit);
	}
	
	public List<CPlaceIt> getList()
	{
		return cplaceits;
	}
	
	public boolean checkViscinity (Location currLoc, Location checkLoc)
	{
		return false;
		
	}
	public void deleteFromList(CPlaceIt placeit) {
		int i = -1;
		for (CPlaceIt cp : cplaceits){
			if (cp.equals(placeit)){
				i = cplaceits.indexOf(cp);
			}
		}
		if (i != -1)
			this.cplaceits.remove(i);
	}

	public List<CPlaceIt> checkCoordinates(Location coords) {
		return null;
	}
	public List<CPlaceIt> getNonActivePlaceIts()
	{
		nonActive = new Vector<CPlaceIt>();
		for (CPlaceIt i : cplaceits)
		{
			if (!i.isActive())
			{
				nonActive.add(i);
			}
		}
		
		return nonActive;
	}
	
	public List<CPlaceIt> getActiveList()
	{
		active = new Vector<CPlaceIt>();
		for (CPlaceIt i : cplaceits)
		{
			if (i.isActive())
			{
				active.add(i);
			}
		}
		
		return active;
	}
	
	public String moveCPlaceIts(int id)
	{
		deactivateCPlaceIt(cplaceits.get(id));
		return cplaceits.get(id).getTitle();
	}

	public void deletePlaceIts(int id, Context cont)
	{
		Toast.makeText(cont, "Did it", Toast.LENGTH_LONG).show();
		this.removeCPlaceIt(cplaceits.get(id));
	}

	public iCPlaceItModel getDB() {
		return this.db;
	}

	public iCView getView() {
		return this.view;
	}
	

}
