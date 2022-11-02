package pkg_Singer;

public class Singer implements Comparable<Singer>{
    String Name; //name of singer
    double Rating; //rating of singer
    int Album_count;//number of released albums

    //Class Constructor
    public Singer(String name, double rating, int album_count) {
        this.Name = name;
        this.Rating = rating;
        this.Album_count = album_count;
    }

    @Override
    public String toString (){
        return "Name: " + this.Name +
                "\tRating: " + this.Rating +
                "\tRealeased Albums: " + this.Album_count;
    }

    public int compareTo(Singer singer) {
        return toString().compareTo(singer.toString());
    }
}

