package Library;

public class Audiobook {
    private String title;
    private String author;
    private int runtime;
    private boolean isAvailable;

    //default
    public Audiobook() {
        this.title = "none";
        this.author = "none";
        this.runtime = 0;
        this.isAvailable = true;
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
        this.isAvailable = audiobookToCopy.isAvailable;
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
        return this.isAvailable;
    }

    public void setAvailable(boolean availability){
        this.isAvailable = availability;
    }

    public boolean checkOut(){
        if (this.isAvailable){
            return this.isAvailable = false;
        }
        else{
            System.out.println("Audiobook is currently unavailable");
            return this.isAvailable = false;
        }
    }

    public void checkIn(){
        this.isAvailable = true;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + 
        "Author: " + this.author + "\n" + 
        "Runtime: " + this.runtime + "\n" +
        "Availability: " + this.isAvailable;
    }
}

