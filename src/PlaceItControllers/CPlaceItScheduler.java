package PlaceItControllers;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import android.util.Log;
import Models.CPlaceIt;
import PlaceItDB.iCPLScheduleModel;
import PlaceItDB.iCPlaceItModel;


public class CPlaceItScheduler {

	private iCPlaceItModel PLrepository;
	private iCPLScheduleModel scheduleRepository;

	public CPlaceItScheduler(iCPLScheduleModel scheduleDB, iCPlaceItModel db) {
		this.PLrepository = db;
		this.scheduleRepository = scheduleDB;
	}

	public void setUpSchedules() {
		List<CPlaceIt> placeits = this.PLrepository.getAllCPlaceIts();
		for (CPlaceIt placeit : placeits) {
			if (placeit.isActive() == true) {
				List<Integer> schedules = this.scheduleRepository
						.getSchedule(placeit);
				placeit = this.initializeSchedule(placeit, schedules);
			}
		}
	}

	/*
	 * Will modify PLSchedule database and then return a new placeit to be
	 * updated. Given that it has been initialized
	 */
	public CPlaceIt initializeSchedule(CPlaceIt placeit, List<Integer> schedules) {
		Date currDate = placeit.getActiveDate();
		Calendar cal = Calendar.getInstance();
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		Calendar min = Calendar.getInstance();
		min.setTime(placeit.getActiveDate());
		min.add(Calendar.YEAR, Integer.MAX_VALUE);
		Date minDate = min.getTime();

		for (Integer schedule : schedules) {
			Calendar date = this.nextDayOfWeek(currDate, schedule);
			Date curr = date.getTime();
			if (minDate.before(curr) == true) {
				minDate = curr;
			}
		}

		placeit.setActiveDate(minDate.getTime());
		this.PLrepository.updateCPlaceIt(placeit);
		return placeit;
	}

	public CPlaceIt startSchedule(CPlaceIt placeit, List<Integer> days) {
		this.addSchedules(placeit, days);
		return this.initializeSchedule(placeit, days);
	}

	/*
	 * Will add schedule to PLSchedule database and return a new placeit to be
	 * updated.
	 */
	public void addSchedules(CPlaceIt placeit, List<Integer> days) {
		this.scheduleRepository.addSchedule(placeit, days);
	}

	/* Will remove schedule from placeit and return a new placeit to be updated. */
	public CPlaceIt removeSchedule(CPlaceIt placeit, List<Integer> days) {
		return this.scheduleRepository.removeSchedule(placeit, days);
	}

	/*
	 * Upon receiving a placeit, it will look for the next scheduled time and
	 * return the place it with the activated date.
	 */
	public CPlaceIt scheduleNextActivation(CPlaceIt placeit) {
		List<Integer> schedules = this.scheduleRepository.getSchedule(placeit);
		if (schedules.size() == 0) {
			return this.repostCPlaceit(placeit, new Date(0));
		} else if (schedules.contains(0) == true) {
			return this.repostCPlaceit(placeit, Calendar.MINUTE, 1);
		} else {
			return this.initializeSchedule(placeit, schedules);
		}
	}

	public CPlaceIt repostCPlaceit(CPlaceIt placeit, int TIMEVAL, int timeAMT) {

		java.util.Date date = placeit.getActiveDate();
		Calendar cal = Calendar.getInstance(); // creates calendar
		cal.setTime(date); // sets calendar time/date
		cal.add(TIMEVAL, timeAMT); // adds amt
		java.util.Date newDate = cal.getTime(); // returns new date object, one
												// hour in the future
		placeit.setActiveDate(newDate.getTime());
		this.PLrepository.updateCPlaceIt(placeit);
		return placeit;
	}

	public CPlaceIt repostCPlaceit(CPlaceIt placeit, Date date) {
		placeit.setActiveDate(date.getTime());
		this.PLrepository.updateCPlaceIt(placeit);
		return placeit;
	}
	
	public List<CPlaceIt> checkActive(List<CPlaceIt> placeits){
		List<CPlaceIt> newActive = new Vector<CPlaceIt>();
		for(CPlaceIt placeit : placeits){
			if(placeit.isActive() && placeit.getActiveDate().before(new Date())){		
				newActive.add(placeit);
			}
		}
		return newActive;
	}

	private Calendar nextDayOfWeek(Date curr, int dow) {
		Calendar date = Calendar.getInstance();
		date.setTime(curr);
		int diff = dow - date.get(Calendar.DAY_OF_WEEK);
		if (!(diff > 0)) {
			diff += 7;
		}
		date.add(Calendar.DAY_OF_MONTH, diff);
		return date;
	}
}
