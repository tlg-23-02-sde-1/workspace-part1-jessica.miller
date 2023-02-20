package net.flix;

public class Movie {
    //fields or instance variables

    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //CONSTRUCTOR
//    public net.flix.Movie() {
//        //no-op deliberate empty
//    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        //delegate to ctor above me for title, handle releaseYear by delegating to setter.
        this(title, genre);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setRating(rating);
    }

    //business oriented methods


    //getter and setters (accessor methods)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //toString methods
    public String toString() {
        return String.format("net.flix.Movie: title=%s, releaseYear=%s, revenue=%,f, rating=%s, genre=%s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//                "net.flix.Movie: title=" + getTitle()
//                + ", releaseYear=" + getReleaseYear()
//                + ", revenue=" + getRevenue()
//                + ", rating=" + getRating()
//                + ", genre=" + getGenre();
    }
}