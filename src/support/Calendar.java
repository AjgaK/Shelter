package support;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<Meeting> meetings;
	private List<LocalDate> dates;

	public Calendar() {
		this.meetings = new ArrayList<>();
		this.dates = new ArrayList<>();
	}

	public void addMeeting(Meeting meeting) {
		meetings.add(meeting);
	}

	public void removeMeeting(Meeting meeting) {
		meetings.remove(meeting);
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public String prepareMeetingReminder(Meeting meeting, String reminder) {
		// Logic to prepare meeting reminder
		// This could be sending an email, notification, etc.
		return "Meeting Reminder for: " + meeting.getAgenda() + " - " + reminder;
	}

	public void addDate(LocalDate date) {
		dates.add(date);
	}

	public void removeDate(LocalDate date) {
		dates.remove(date);
	}

	public List<LocalDate> getDates() {
		return dates;
	}
}