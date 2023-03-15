public class Audiobook {
    private String title;
    private String author;
    private int runtime;
    private boolean isAvailalle;

    //default
    public Audiobook() {
        this.title = "none";
        this.author = "none";
        this.runtime = "none";
        this.isAvailalle = "true";
    }
    
    //overloaded
    public Audiobook(String title, String author, int runtime){
        this.title = title;
        this.author = author;
        this.runtime = runtime;
    }

    //copy
    public Audiobook(Audiobook audiobookToCopy){
        this.title = audiobookToCopy.title;
        this.author = audiobookToCopy.author;
        this.runtime = audiobookToCopy.runtime;
        this.isAvailalle = audiobookToCopy.isAvailalle;
    }

    //accessors and mutators
    public String getTitle(){
        return this.title;
    }

    public String setTitle(String newTitle){
        this.title = newTitle;
    }

    public String author() {
        return this.author;
    }

    public String setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public int runtime() {
        return this.runtime;
    }

    public int setRuntime(int newRuntime){
        this.runtime = newRuntime;
    }

    public boolean isAvailable() {
        return this.isAvailalle;
    }

    public boolean setAvailable(boolean availability){
        this.isAvailalle = availability;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + 
        "Author: " + this.author + "\n" + 
        "Runtime: " + this.runtime + "\n" +
        "Availability: " + this.isAvailalle;

    public 
    }

