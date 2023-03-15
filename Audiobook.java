package Library;

public class Audiobook {
    private String title;
    private String author;
    private int runtime;
    private boolean isAvailalle;

    //default
    public Audiobook() {
        this.title = "none";
        this.author = "none";
        this.runtime = 0;
        this.isAvailalle = true;
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

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String author() {
        return this.author;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public int runtime() {
        return this.runtime;
    }

    public void setRuntime(int newRuntime){
        this.runtime = newRuntime;
    }

    public boolean isAvailable() {
        return this.isAvailalle;
    }

    public boolean setAvailable(boolean availability){
        this.isAvailalle = availability;
    }

    public void checkOut(){
        if (this.isAvailalle){
            this.isAvailalle = false;
        }
        else{
            System.out.println("Audiobook is currently unavailable");
        }
    }

    public void checkIn(){
        this.isAvailalle = true;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + 
        "Author: " + this.author + "\n" + 
        "Runtime: " + this.runtime + "\n" +
        "Availability: " + this.isAvailalle;
    }
}

