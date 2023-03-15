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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LibraryCard getLibraryCard() {
		return libraryCard;
	}

	void checkOut(DVD dvd) {
		if (numDVDs < 3) {
			if (dvd.checkOut()) {
				System.out.println(libraryCard.getSlogan());
				++numDVDs;
			}
		}
	}

	void checkOut(Audiobook book) {
		if (numAudioBooks < 3) {
			if (book.checkOut()) {
				System.out.println(libraryCard.getSlogan());
				++numAudioBooks;
			}
		}
	}

	public void checkIn(DVD dvd) {
		if (numDVDs > 0) {
			dvd.checkIn();
			--numDVDs;
		}
	}

	public void checkIn(Audiobook book) {
		if (numAudioBooks > 0) {
			book.checkIn();
			--numAudioBooks;
		}
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
