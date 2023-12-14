package support;

import java.time.LocalDate;

public class Meeting {
	private LocalDate date;
	private String report;
	private String agenda;

	public Meeting(LocalDate date, String agenda) {
		this.date = date;
		this.agenda = agenda;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getReport() {
		return report;
	}

	public String getAgenda() {
		return agenda;
	}

	public String showMeetingDetails() {
		// Display meeting details
		StringBuilder details = new StringBuilder();
		details.append("Date: ").append(date).append("\n");
		details.append("Agenda: ").append(agenda).append("\n");
		if (report != null) {
			details.append("Report: ").append(report).append("\n");
		}
		return details.toString();
	}

	public void addReport(String report) {
		this.report = report;
	}

	public void scheduleMeeting(Calendar calendar) {
		calendar.addMeeting(this);
	}
}
