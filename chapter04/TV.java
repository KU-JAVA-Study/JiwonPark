package chapter04;

public class TV {
    private String company;
    private int year;
    private int inch;

    public TV(String company, int year, int inch) {
        this.company = company;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.printf("%s에서 만든 %d년형 %d인치 TV", company, year, inch);
    }
}
