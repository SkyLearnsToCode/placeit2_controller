package PlaceItDB;

import java.util.List;
import java.util.ListIterator;

import Models.CPlaceIt;
import Models.Category;
import Models.PlaceIt;

public class mockCPlaceItHandler implements iCPlaceItModel {
	
	public List<PlaceIt> mockplist;
	public List<CPlaceIt> mockcplist;
	public static boolean deletecall = false; 

	//constructor
	public mockCPlaceItHandler (List<PlaceIt> userInput, List<CPlaceIt> userInput2){
		mockplist = userInput;
		mockcplist = userInput2;
	}
	
	@Override
	public long addPlaceIt(PlaceIt PlaceIt) {
		// TODO Auto-generated method stub
		mockplist.add(PlaceIt);
		return 1;
	}

	@Override
	public PlaceIt getPlaceIt(String id) {
		
		PlaceIt result = null;
		// TODO Auto-generated method stub
		for (ListIterator<PlaceIt> iter = mockplist.listIterator(); iter.hasNext(); ) {
		    PlaceIt element = iter.next();
		    if (element.getID() == id){
		    	result = element;
		    }
		}
		return result;
	}

	@Override
	public List<PlaceIt> getAllPlaceIts() {
		// TODO Auto-generated method stub
		return mockplist;
	}

	@Override
	public int getPlaceItsCount() {
		// TODO Auto-generated method stub
		return mockplist.size();
	}

	@Override
	public int updatePlaceIt(PlaceIt placeit) {
		// TODO Auto-generated method stub
		int num = 0;
		String id = placeit.getID();
		String title = placeit.getTitle();
		String description = placeit.getDescription();
		Double latitude = placeit.getLatitude();
		Double longitutde = placeit.getLongitude();
		java.util.Date activeDate= placeit.getActiveDate();
		
		// TODO Auto-generated method stub
		for (PlaceIt p:mockplist ) {
		    if (p.getID() == id){
		    	boolean e = p.getTitle().equals(title) 
		    			&& p.getDescription().equals(description) 
		    			&& ((Double)p.getLatitude()).equals(latitude)
		    			&& ((Double)p.getLongitude()).equals(longitutde)
		    			&& p.getActiveDate().equals(activeDate);
		    	if (!e){
		    		int i = mockplist.indexOf(p);
		    		mockplist.set(i,placeit);
		    	}
		    	num++;
		    }
		}
		return num;
	}

	@Override
	public void deletePlaceIt(PlaceIt PlaceIt) {
		deletecall = true; 
		// TODO Auto-generated method stub
		String id = PlaceIt.getID();
		String title = PlaceIt.getTitle();
		String description = PlaceIt.getDescription();
		Double latitude = PlaceIt.getLatitude();
		Double longitutde = PlaceIt.getLongitude();
		java.util.Date activeDate= PlaceIt.getActiveDate();
		
		// TODO Auto-generated method stub
		for (int i = 0; i < mockplist.size() -1; i++ ) {
			PlaceIt p = mockplist.get(i); 
		    if (p.getID() == id){
		    	boolean e = p.getTitle().equals(title) 
		    			&& p.getDescription().equals(description) 
		    			&& ((Double)p.getLatitude()).equals(latitude)
		    			&& ((Double)p.getLongitude()).equals(longitutde)
		    			&& p.getActiveDate().equals(activeDate);
		    	if (e){
		    		mockplist.remove(p);
		    	}
		    }
		}
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		mockplist = null;
	}

	@Override
	public void deactivatePlaceit(PlaceIt placeit) {
		// TODO Auto-generated method stub
		placeit.setActiveDate(0); /* maybe...*/
		this.updatePlaceIt(placeit);
	}

	@Override
	public long addCPlaceIt(CPlaceIt CPlaceIt) {
		// TODO Auto-generated method stub
		mockcplist.add(CPlaceIt);
		return 1;
	}

	@Override
	public CPlaceIt getCPlaceIt(String id) {
		// TODO Auto-generated method stub
		CPlaceIt result = null;
		// TODO Auto-generated method stub
		for (ListIterator<CPlaceIt> iter = mockcplist.listIterator(); iter.hasNext(); ) {
		    CPlaceIt element = iter.next();
		    if (element.getID() == id){
		    	result = element;
		    }
		}
		return result;
	}

	@Override
	public List<CPlaceIt> getAllCPlaceIts() {
		// TODO Auto-generated method stub
		return mockcplist;
	}

	@Override
	public int getCPlaceItsCount() {
		// TODO Auto-generated method stub
		return mockcplist.size();
	}

	@Override
	public int updateCPlaceIt(CPlaceIt Cplaceit) {
		// TODO Auto-generated method stub
		int num = 0;
		String id = Cplaceit.getID();
		String title = Cplaceit.getTitle();
		String description = Cplaceit.getDescription();
		List<Category> clist = Cplaceit.getCat();
		java.util.Date activeDate= Cplaceit.getActiveDate();
		
		// TODO Auto-generated method stub
		for (CPlaceIt p:mockcplist ) {
		    if (p.getID() == id){
		    	boolean e = p.getTitle().equals(title) 
		    			&& p.getDescription().equals(description) 
		    			&& p.getCat().equals(clist)
		    			&& p.getActiveDate().equals(activeDate);
		    	if (!e){
		    		int i = mockcplist.indexOf(p);
		    		mockcplist.set(i,Cplaceit);
		    	}
		    	num++;
		    }
		}
		return num;
	}

	@Override
	public void deleteCPlaceIt(CPlaceIt CPlaceIt) {
		// TODO Auto-generated method stub
		deletecall = true; 
		// TODO Auto-generated method stub
		String id = CPlaceIt.getID();
		String title = CPlaceIt.getTitle();
		String description = CPlaceIt.getDescription();
		List<Category> clist = CPlaceIt.getCat();
		java.util.Date activeDate= CPlaceIt.getActiveDate();
		
		// TODO Auto-generated method stub
		for (int i = 0; i < mockcplist.size() -1; i++ ) {
			CPlaceIt p = mockcplist.get(i); 
		    if (p.getID() == id){
		    	boolean e = p.getTitle().equals(title) 
		    			&& p.getDescription().equals(description) 
		    			&& p.getCat().equals(clist)
		    			&& p.getActiveDate().equals(activeDate);
		    	if (e){
		    		mockcplist.remove(p);
		    	}
		    }
		}
	}

	@Override
	public void deactivateCPlaceit(CPlaceIt Cplaceit) {
		// TODO Auto-generated method stub
		Cplaceit.setActiveDate(0); /* maybe...*/
		this.updateCPlaceIt(Cplaceit);
	}
}
