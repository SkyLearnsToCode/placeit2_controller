package PlaceItDB;

import java.util.List;

import Models.CPlaceIt;
import Models.PlaceIt;

public interface iPlaceItModel {

	// Adding new PlaceIt
	public void addPlaceIt(PlaceIt PlaceIt);
	
	public void addCPlaceIt(CPlaceIt cplaceit);

	// Getting single PlaceIt
	public PlaceIt getPlaceIt(int id);

	// Getting All PlaceIts
	public List<PlaceIt> getAllPlaceIts();

	// Getting PlaceIts Count
	public int getPlaceItsCount();

	// Updating single PlaceIt
	public int updatePlaceIt(PlaceIt placeit);

	// Deleting single PlaceIt
	public void deletePlaceIt(PlaceIt PlaceIt);
	
	// deleteAll 
	public void deleteAll();
	
	public void deactivatePlaceit(PlaceIt placeit);

}
