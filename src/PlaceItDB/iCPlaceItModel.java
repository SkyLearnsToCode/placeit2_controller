package PlaceItDB;

import java.util.List;

import Models.CPlaceIt;
import Models.PlaceIt;

public interface iCPlaceItModel extends iPlaceItModel {
		// Adding new PlaceIt
		public long addCPlaceIt(CPlaceIt CPlaceIt);

		// Getting single PlaceIt
		public CPlaceIt getCPlaceIt(String id);

		// Getting All PlaceIts
		public List<CPlaceIt> getAllCPlaceIts();

		// Getting PlaceIts Count
		public int getCPlaceItsCount();

		// Updating single PlaceIt
		public int updateCPlaceIt(CPlaceIt Cplaceit);

		// Deleting single PlaceIt
		public void deleteCPlaceIt(CPlaceIt CPlaceIt);
		
		// deleteAll 
		public void deleteAll();
		
		public void deactivateCPlaceit(CPlaceIt Cplaceit);
}
