package Library;

public class CardHolder {
	private String firstName;
	private String lastName;
	private LibraryCard libraryCard;
	private int numAudioBooks;
	private int numDVDs;

	public CardHolder() {
		firstName = null;
		lastName = null;
		libraryCard = new LibraryCard();
		numAudioBooks = 0;
		numDVDs = 0;
	}

	public CardHolder(CardHolder ch) {
		firstName = ch.firstName;
		lastName = ch.lastName;
		libraryCard = new LibraryCard(ch.libraryCard);
		numAudioBooks = ch.numAudioBooks;
		numDVDs = ch.numDVDs;
	}

	public String toString() {
		return "CardHolder[First Name: " + (firstName == null ? "<Unknown>" : firstName) + ", Last Name: " + (lastName == null ? "<Unknown>" : lastName) + ", Library Card[" + libraryCard.toString() + "], Audio Books: " + numAudioBooks + ", DVDs: " + numDVDs + ']';
	}
}
