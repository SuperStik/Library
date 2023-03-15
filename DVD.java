public Class DVD {
    private String title;
    private String genre;
    private boolean isAvailable;

    public DVD() {
        title = "Spider-Man";
        genre = "Action";
        isAvailable = "True";
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
        copyDVD++;
    }

    public void checkOut() {
        if (this.isAvailable.equals(True)) {
            this.isAvailable = False;
        }
        else {
            System.out.println("DVD Currently not Available")
        }
    }

    public void checkIn(){
        this.isAvailable = True;
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