package chapter04;

class Song {
    private final String title;
    private final String artist;
    private final int year;
    private final String country;

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.printf("%d년 %s 국적의 %s(이)가 부른 %s\n", year, country, artist, title);
    }
}