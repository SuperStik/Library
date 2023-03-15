package Library;

public class CardHolder {
	String firstName;
	String lastName;
	LibraryCard libraryCard;
	int numAudioBooks;
	int numDVDs;

	CardHolder() {
		firstName = "unknown";
		lastName = "unknown";
		libraryCard = new LibraryCard();
	}
}