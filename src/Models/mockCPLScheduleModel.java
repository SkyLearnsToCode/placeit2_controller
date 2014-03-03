package Models;

import java.util.ArrayList;
import java.util.List;

import PlaceItDB.iCPLScheduleModel;

public class mockCPLScheduleModel implements iCPLScheduleModel {

List<PLSchedule> lscheduleList = new ArrayList<PLSchedule>();
List<CPLSchedule> cscheduleList = new ArrayList<CPLSchedule>();
	
	private PLSchedule findSchedule(String placeitID){
		for(PLSchedule s : lscheduleList){
			if (s.getPlaceItId()==placeitID){
				return s;
			}
		}
		return null;
	}
	
	@Override
	public PlaceIt addSchedule(PlaceIt placeit, List<Integer> day) {
		// TODO Auto-generated method stub
		String id = placeit.getID();
		PLSchedule ns = this.findSchedule(id);
		if(ns != null){
			ns.setInteger(day);
		}else{
			ns = new PLSchedule(id,day);
		}
		lscheduleList.set(lscheduleList.indexOf(ns), ns);
		return placeit;
	}
	/*
	 * (non-Javadoc)
	 * @see PlaceItDB.iPLScheduleModel#removeSchedule(Models.PlaceIt, java.util.List)
	 * This will remove the schedule for the placeit
	 */
	@Override
	public PlaceIt removeSchedule(PlaceIt placeit, List<Integer> day) {
		// TODO Auto-generated method stub
		String id = placeit.getID();
		PLSchedule rs = this.findSchedule(id);
		if(rs!=null){
			lscheduleList.remove(rs);
		}
		return placeit;
	}

	/*
	 * (non-Javadoc)
	 * @see PlaceItDB.iPLScheduleModel#getSchedule(Models.PlaceIt)
	 * This will get the schedule of the placeit
	 */
	@Override
	public List<Integer> getSchedule(PlaceIt placeit) {
		// TODO Auto-generated method stub
		PLSchedule gs = this.findSchedule(placeit.getID());
		return gs.getInteger();
	}

	private CPLSchedule findcSchedule(String cplaceitID){
		for(CPLSchedule s : cscheduleList){
			if (s.getCPlaceItId()==cplaceitID){
				return s;
			}
		}
		return null;
	}
	
	@Override
	public CPlaceIt addSchedule(CPlaceIt placeit, List<Integer> day) {
		// TODO Auto-generated method stub
		String id = placeit.getID();
		CPLSchedule ns = this.findcSchedule(id);
		if(ns != null){
			ns.setInteger(day);
		}else{
			ns = new CPLSchedule(id,day);
		}
		cscheduleList.set(cscheduleList.indexOf(ns), ns);
		return placeit;
	}

	@Override
	public CPlaceIt removeSchedule(CPlaceIt placeit, List<Integer> day) {
		// TODO Auto-generated method stub
		String id = placeit.getID();
		CPLSchedule rs = this.findcSchedule(id);
		if(rs!=null){
			cscheduleList.remove(rs);
		}
		return placeit;
	}

	@Override
	public List<Integer> getSchedule(CPlaceIt placeit) {
		// TODO Auto-generated method stub
		CPLSchedule gs = this.findcSchedule(placeit.getID());
		return gs.getInteger();
	}

	
}
