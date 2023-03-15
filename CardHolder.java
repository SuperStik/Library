package Library;

public class CardHolder {
	String firstName;
	String lastName;
	LibraryCard libraryCard;
	int numAudioBooks;
	int numDVDs;

	CardHolder() {
		firstName = null;
		lastName = null;
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

	String toString() {
		return "CardHolder[First Name: " + (firstName == null ? "<Unknown>" : firstName) + ", Last Name: " + (lastName == null ? "<Unknown>" : lastName) + ", Library Card[" + libraryCard.toString() + "], Audio Books: " + numAudioBooks + ", DVDs: " + numDVDs + ']';
	}
}
