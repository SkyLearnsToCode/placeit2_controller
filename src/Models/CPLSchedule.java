package Models;

import java.util.LinkedList;
import java.util.List;

public class CPLSchedule {

	String _id;
	String cplaceitID; // this is a foreign key to placeIt
	List<Integer> schedules;

	protected CPLSchedule(String placeitID) {
		this.cplaceitID = placeitID;
		this.schedules = new LinkedList<Integer>();
	}

	protected CPLSchedule(String placeitID, List<Integer> schedules) {
		this.cplaceitID = placeitID;
		this.schedules = schedules;
	}

	public String getCPlaceItId() {
		return this.cplaceitID;
	}

	public void setCPlaceItId(String placeitID) {
		this.cplaceitID = placeitID;
	}

	public List<Integer> getInteger() {
		return this.schedules;
	}

	public void setInteger(List<Integer> schedules) {
		this.schedules = schedules;
	}

	public boolean addDay(Integer day) {
		if (this.schedules.contains(day)) {
			return false;
		}
		this.schedules.add(day);
		return true;
	}

	public boolean removeDay(Integer day) {
		if (this.schedules.contains(day)) {
			this.schedules.remove(day);
			return true;
		} else {
			return false;
		}

	}
}
