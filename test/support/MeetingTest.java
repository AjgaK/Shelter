package support;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class MeetingTest {

	@Test
	public void testMeetingDetailsAndReport() {
		LocalDate date = LocalDate.of(2023, 12, 15);
		String agenda = "Team Sync-Up";

		Meeting meeting = new Meeting(date, agenda);

		meeting.addReport("Progress discussed during the meeting");

		assertEquals(date, meeting.getDate());
		assertEquals(agenda, meeting.getAgenda());
		assertEquals("Progress discussed during the meeting", meeting.getReport());
	}

	@Test
	public void testScheduleMeeting() {
		Calendar calendar = new Calendar();
		Meeting meeting = new Meeting(LocalDate.of(2023, 12, 16), "Sprint Planning");

		meeting.scheduleMeeting(calendar);
		assertTrue(calendar.getMeetings().contains(meeting));
	}

	@Test
	public void testAddReport() {
		LocalDate date = LocalDate.of(2023, 12, 17);
		String agenda = "Report Meeting";

		Meeting meeting = new Meeting(date, agenda);
		meeting.addReport("Discussion on quarterly reports");

		assertEquals("Discussion on quarterly reports", meeting.getReport());
	}
}