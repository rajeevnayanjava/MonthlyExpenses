package Enum;

public enum Months {
	// Inside enum toString() method is implemented to return name of the
	// constant.
	JANUARY(31) {
		public void info() {
			System.out.println("First Month");
		}
	},
	FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(
			30), DECEMBER(31) {
				public void info() {
					System.out.println("Last Month");
				}
			};
	int days;

	private Months(int days) {
		this.days = days;
		System.out.println("Constructor called.");
	}

	public void info() {
		System.out.println("Intermediate Months of the year.");
	}
}
