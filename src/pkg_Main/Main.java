package pkg_Main;

import pkg_Singer.Singer;
import pkg_Singer.SingerRecord;

public class Main {
    public static void main(String[] args) {
        Singer[] singers = new Singer[5];
        // or using input method
        // singers = SingerRecord.setSingerArr(5);

        singers[0] = new Singer("Kino", 9.8, 8);
        singers[1] = new Singer("GrOb", 8.5, 23);
        singers[2] = new Singer("Metallica", 2.8, 14);
        singers[3] = new Singer("AC/DC", 10.0, 25);
        singers[4] = new Singer("Queen", 8.0, 25);


        System.out.println("Array of artist: ");
        SingerRecord.showArray(singers);

        int mp = SingerRecord.mostPopular(singers);
        System.out.println("\nNumber of the most popular artist: " + mp);

        int avgAl = SingerRecord.avgAlbum(singers);
        System.out.println("\nAverage released albums: " + avgAl);

        int uAS = SingerRecord.upAvgSingers(singers);
        System.out.println("Number of artists, " +
                "who released more than average albums: " + uAS);

        System.out.println("\nReverce sort array from name: ");
        SingerRecord.sortRevName(singers);
        SingerRecord.showArray(singers);

        int search = SingerRecord.searchName(singers, "Metallica");
        System.out.println("\nNumber of Metallica: " + search);

        SingerRecord.ReflRating(singers[search], 9.0);
    }
}