package support;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class CalendarTest {

	private Calendar calendar;
	private Meeting meeting;

	@Before
	public void setUp() {
		calendar = new Calendar();
		meeting = new Meeting(LocalDate.of(2023, 12, 15), "Team Meeting");
	}

	@Test
	public void testAddAndRemoveMeeting() {
		Calendar calendar = new Calendar();
		Meeting meeting = new Meeting(LocalDate.of(2023, 12, 13), "Project Discussion");

		calendar.addMeeting(meeting);
		assertTrue(calendar.getMeetings().contains(meeting));

		calendar.removeMeeting(meeting);
		assertFalse(calendar.getMeetings().contains(meeting));
	}

	@Test
	public void testAddAndRemoveDate() {
		Calendar calendar = new Calendar();
		LocalDate date = LocalDate.of(2023, 12, 14);

		calendar.addDate(date);
		assertTrue(calendar.getDates().contains(date));

		calendar.removeDate(date);
		assertFalse(calendar.getDates().contains(date));
	}

	@Test
	public void testPrepareMeetingReminder() {
		String reminder = "Don't forget the discussion points!";
		String expectedMessage = "Meeting Reminder for: " + meeting.getAgenda() + " - " + reminder;
		String actualMessage = calendar.prepareMeetingReminder(meeting, reminder);
		assertEquals(expectedMessage, actualMessage);
	}
}
