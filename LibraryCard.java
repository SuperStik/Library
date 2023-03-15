public class LibraryCard{

    private int id;
    private String slogan;
    private boolean isActive;
    private static int cardID = 0;

    //Constructor
    public LibraryCard(){
        this.id = cardID++;
        this.slogan = "We Love Books";
        this.isActive = true;
        cardID++;
    }

    public LibraryCard(String id, String slogan){
        this.id = id;
        this.slogan = slogan;
        this.isActive = true;
        cardID++;
    }

    //Copy Constructor
    public LibraryCard(LibraryCard cardToCopy){
        this.id = cardToCopy.id;
        this.slogan = cardToCopy.slogan;
        this.isActive = true;
    }

    //Accessors & Mutators
    public String getId(){
        return this.id;
    }

    public String getSlogan(){
        return this.slogan;
    }
    
    public boolean getIsActive(){
        return this.isActive;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public void setSlogan(String newSlogan){
        this.slogan = newSlogan;
    }

    public void setIsActive(boolean newActive){
        this.isActive = newActive;
    }

    //toString
    public String toString(){
        return "ID: " + this.id + "\nSlogan: " + this.slogan + "\nActive: " + this.isActive;
    }

    //deactivate
    public void deactivate(LibraryCard card){
        if (this.isActive){
            this.isActive = false;
        } else {
            this.isActive = true;
        }
    }




}