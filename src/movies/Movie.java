package movies;

public class Movie {

    private String movieName;
    private String movieCat;

    public Movie(String name, String category) {
        this.movieName = name;
        this.movieCat = category;
    }

    public String getCategory() {
        return movieCat;
    }

    public void setCategory(String category) {
        this.movieCat = category;
    }

    public String getName() {

        return movieName;
    }

    public void setName(String name) {
        this.movieName = name;
    }
//end of class
}


