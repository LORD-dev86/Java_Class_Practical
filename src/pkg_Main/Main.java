package pkg_Main;

import pkg_Singer.Singer;
import pkg_Singer.SingerRecord;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Singer[] singers = new Singer[3];

        singers[0] = new Singer("Tsoi", 10.0, 8);
        singers[1] = new Singer("Letov", 10.0, 56);
        singers[2] = new Singer("Pushnoy", 10.0, 15);
        SingerRecord.sortRevName(singers);

        for (Singer sin: singers)
            System.out.println(sin);
    }
}