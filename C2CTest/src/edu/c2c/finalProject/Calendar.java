package edu.c2c.finalProject;

public class Calendar {

	// Storing weeks
	String days[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
	
	// Storing months
	String months[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
			"OCTOBER", "NOVEMBER", "DECEMBER" };

	int year = 0;
	int month = 0;

	// Contractor with parameters
	public Calendar(int yy, int mm) {
		this.year = yy;
		this.month = mm;
	}

	public void printCalendar() {

		int d = 1;
		int m = 1;
		int y = 1;
		int dy = 1;

		//Array storing number of days in some special month
		int ar[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		while (true) {

			if (d == 1 && m == this.month && y == this.year) {
				break;
			}

			if (y % 4 == 0 && y % 100 != 0 || y % 100 == 0) {
				ar[1] = 29;
			}

			else {
				ar[1] = 28;
			}
			dy++;
			d++;

			if (d > ar[m - 1]) {
				m++;
				d = 1;
			}

			if (m > 12) {
				m = 1;
				y++;
			}

			if (dy == 7) {
				dy = 0;
			}
		}


		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			ar[1] = 29;
		} else {
			ar[1] = 28;
		}

		// Print the desired month of input year
		System.out.println("MONTH: " + months[this.month - 1]);

		for (int k = 0; k < 7; k++) {
			System.out.print("   " + days[k]);
		}

		System.out.println();

		for (int j = 1; j <= (ar[this.month - 1] + dy); j++) {
			if (j > 6) {
				dy = dy % 6;
			}
		}

		int spaces = dy;
		if (spaces < 0)
			spaces = 6;

		// Printing the calendar
		for (int i = 0; i < spaces; i++)
			System.out.print("      ");
		for (int i = 1; i <= ar[this.month - 1]; i++) {
			System.out.printf(" %4d ", i);

			if (((i + spaces) % 7 == 0) || (i == ar[month - 1]))
				System.out.println();
		}
	}

}
