package pkg_Singer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SingerRecord {
    public static Singer[] setSingerArr(int count) {
        Scanner sc = new Scanner(System.in);
        Singer[] singers = new Singer[count];

        System.out.println("Input information of singers: ");

        for (int i = 0; i < singers.length; i++) {
            System.out.print("Name of " + (i + 1) + " singer");
            singers[i].Name = sc.nextLine();

            System.out.print("Rating of " + (i + 1) + " singer");
            singers[i].Rating = sc.nextDouble();

            System.out.print("Released albums of " + (i + 1) + " singer");
            singers[i].Album_count = sc.nextInt();

            sc.nextLine(); //clearing buff
        }

        return singers;
    }

    public static void showArray(Singer[] singers) {
        for (Singer singer : singers)
            System.out.println(singer);
    }

    public static int mostPopular(Singer[] singers) {
        int maxNum = 0;
        double maxRating = singers[maxNum].Rating;

        for (int i = 0; i < singers.length; i++)
            if (singers[i].Rating > maxRating) {
                maxRating = singers[i].Rating;
                maxNum = i;
            }
        return maxNum;
    }

    public static int avgAlbum(Singer[] singers) {
        int avgAlbum = 0;

        for (Singer singer : singers) {
            avgAlbum += singer.Album_count;
        }

        avgAlbum /= singers.length;
        return avgAlbum;
    }

    public static int upAvgSingers(Singer[] singers) {
        int avgAl = avgAlbum(singers);
        int upAvgSin = 0;

        for (Singer singer : singers) {
            if (singer.Album_count > avgAl)
                upAvgSin++;
        }
        return upAvgSin;
    }

    public static void sortRevName(Singer[] singers) {
        Arrays.sort(singers, (s1, s2) -> s2.Name.compareTo(s1.Name));
    }
}