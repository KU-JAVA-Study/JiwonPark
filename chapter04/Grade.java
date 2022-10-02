package chapter04;

public class Grade {
    private final int math;
    private final int science;
    private final int english;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        return (math + science + english) / 3;
    }
}
