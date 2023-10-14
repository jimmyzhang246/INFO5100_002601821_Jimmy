public class Video {
    public int id;
    private int time;
    private int price;
    private String[] comments;
    private String source;
    public String company;
    public int rating;
    public boolean adult;
    private int count = 0;
    public class Movie {
        private String[] artist;
        private int year;

        public Movie(String[] artist, int year) {
            this.artist = artist;
            this.year = year;
        }
    }

    public class Documentary {
        private String area;
        private int year;

        public Documentary(String area, int year) {
            this.area = area;
            this.year = year;
        }
    }

    public Video(int time, int price, String[] comments, String source, String company, int rating, boolean adult) {
        id = count++;
        this.time = time;
        this.price = price;
        this.comments = comments;
        this.source = source;
        this.company = company;
        this.rating = rating;
        this.adult = adult;
        System.out.println("Created Video instance with id:" + id);
    }
    public static void main(String[] args) {
        String[] comments1 = {"Great video!", "Interesting content."};
        String[] comments2 = {"Nice work!", "I enjoyed it."};
        String[] comments3 = {"Awesome video!", "Very informative."};

        Video video1 = new Video(120, 5, comments1, "YouTube", "TechVideos Inc.", 4, false);
        Video video2 = new Video(90, 3, comments2, "Vimeo", "CreativeMedia", 4, false);
        Video video3 = new Video(150, 6, comments3, "YouTube", "EduVision", 5, false);
    }

}
