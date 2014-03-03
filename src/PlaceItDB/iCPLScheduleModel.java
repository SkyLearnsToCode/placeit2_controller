package PlaceItDB;

import java.util.List;

import Models.CPlaceIt;
import Models.PlaceIt;

public interface iCPLScheduleModel extends iPLScheduleModel {

	public CPlaceIt addSchedule(CPlaceIt placeit, List<Integer> day);

	public CPlaceIt removeSchedule(CPlaceIt placeit, List<Integer> day);
	
	public List<Integer> getSchedule(CPlaceIt placeit);
	
	
}
