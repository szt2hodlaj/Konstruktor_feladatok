public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        if (isCorrectDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Hibás dátum!");
        }
    }

    public boolean isCorrectDate(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else {
            return day <= 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void printDate() {
        System.out.println("Dátum: " + year + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isCorrectDate(year, month, day)) {
            this.month = month;
        } else {
            System.out.println("Hibás hónap!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isCorrectDate(year, month, day)) {
            this.day = day;
        } else {
            System.out.println("Hibás nap!");
        }
    }
}
