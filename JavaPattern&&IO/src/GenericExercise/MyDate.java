package GenericExercise;

public class MyDate implements Comparable<MyDate>{
  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "MyDate{" +
        "year=" + year +
        ", month=" + month +
        ", day=" + day +
        '}';
  }

  @Override
  public int compareTo(MyDate e2) { // compare the Date
    // name equal, compare birthday
    int yearDiff = year - e2.getYear();
    if (yearDiff != 0) return yearDiff;
    // year equal, compare month

    int monthDiff = month - e2.getMonth();
    if (monthDiff != 0) return monthDiff;

    // compare day
    return day - e2.getDay();
  }
}
