public class DVD {
    private String title;
    private String genre;
    private boolean isAvailable;

    public DVD() {
        title = "Spider-Man";
        genre = "Action";
        isAvailable = true;
    }

    public DVD(String title, String genre, boolean isAvailable){
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public DVD(DVD copyDVD) {
        this.title = copyDVD.title;
        this.genre = copyDVD.genre; 
        this.isAvailable = copyDVD.isAvailable;
    }

    public Boolean checkOut() {
        if (this.isAvailable) {
            this.isAvailable = false;
            return true;
        }
        else {
            System.out.println("DVD Currently not Available")
            return false;
        }
    }

    public void checkIn(){
        this.isAvailable = true;
    }

    // Accessors + Mutators
    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    // toString Method
    public String toString() {
        return "Title: " + this.title + "\nGenre: " + this.genre + 
        "\nAvailability" + this.isAvailable;
    }




}