package PlaceItDB;

import java.util.List;

import Models.PlaceIt;

public interface iPLScheduleModel {
	
	/* is set up before db calls to reactivate sleeping placeits
	*/
	public void setUpSchedules();
	
	/* Will modify PLSchedule database and then return a new placeit to be 
	 * updated. 
	 * */
	public PlaceIt initializeSchedule(PlaceIt placeit, List<Integer> schedules);
	
	/* Will add schedule to PLSchedule database and return a new placeit to be
	 * updated. */
	public PlaceIt addSchedule(PlaceIt placeit, Integer day);
	
	/* Will remove schedule from placeit and return a new placeit to be updated.*/
	public PlaceIt removeSchedule(PlaceIt placeit, Integer day);
	
	/* Upon receiving a placeit, it will look for the next scheduled time and 
	 * return the place it with the activated date.*/
	public PlaceIt scheduleNextActivation(PlaceIt placeit);
	
}