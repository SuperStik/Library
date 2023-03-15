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
		numAudioBooks = 0;
		numDVDs = 0;
	}

	CardHolder(CardHolder ch) {
		firstName = ch.firstName;
		lastName = ch.lastName;
		libraryCard = new LibraryCard(ch.libraryCard);
		numAudioBooks = ch.numAudioBooks;
		numDVDs = ch.numDVDs;
	}
}