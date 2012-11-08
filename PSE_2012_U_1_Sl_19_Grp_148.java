/*
*****************************************************************
*	    Name: Peter Faber, Clemens Mayer, Han Ngoc Phan	
*	   Datum: Tue Oct 30 18:33:09 CET 2012			
*	 Aufgabe: Klassendefinition				
*	 Version: 1.0						
*	Funktion: keine 					
*****************************************************************
*/

class Library		{
	
	String Name;
	String Owner;	
	int NumberOfItems;
	String LocationOnDisk;

	void addItem();
	void removeItem();
	void refresh();
	void sort();
	Item search( String foo );
	void play( Item item );	
	
	void selfdestruct();

}

class Song	{

	String Name;
	String Artist;
	String Album;
	int length; //in seconds
	
	String getName();
	String getArtist();
	String getAlbum();
	int getLength();
		
}

class Playlist	{

	String Name;
	Item Items[];
	int NumberofSongs;
	int SortingMethod;
		
	Song getCurrentSong();
	int getNumberofSongs();
	void addSong();
	void removeSong();
	void sortSongs( int SortingMethod  );
	
}

class Player	{

	Item currentItem;
	Button play;
	Button stop;
	Button next;
	Button prev;

	void play(Song song);
	void stop();
	void nextSong();
	void prevSong();
	void getCurrentNameOfItem( Item item );
	
}

class StoreItem	{

	String Name;
	float Price;
	float Rating;
	float FileSize;
	float Author;

	float convertToEuro(float dollar);
	
	
}

class MusicPlayer	{

	//Example Libraries

	Library lib = new Library();
	
	lib.Name = "I love donuts";
	lib.Owner = "Homer";
	lib.NumberOfItems = 2;
	lib.LocationOnDisk = "C:\\Users\Homer\Music";

	Library lib2 = new Library();
	
	lib2.Name = "Universe";
	lib2.Owner = "Deepthought";
	lib2.NumberOfItems = 42;
	lib2.LocationOnDisk = "/home/deepthought/Music";
	
	
	//Example Songs
	
	Song song1 = new Song();
	song1.Name = "Drogensong";
	song1.Artist = "Bilbo Baggins";
	song1.Album = "Lord of the Weed OST"
	song1.length = 45;

	Song song2 = new Song();	
	song2.Name = "GanagnamStyle";
	song2.Artist = "PSY";
	song2.Album = "Gangnam Style"
	song2.length = 200;
	

	//Example Playlists

	Playlist listA = new Playlist();
	
	static final NAME = 1;
	static final RATING = 2;

	listA.Name = "K-Pop und Drogenmusik";
	listA.Items[1] = a;
	listA.Items[2] = b;
	listA.NumberOfSongs = countItems();
	listA.SortingMethod = NAME;

	Playlist listB = new Playlist();

	listB.Name = "foobar";
	listB.Item[1]= foo;
	listB.Item[2]= bar;
	//...
	listB.NumberOfSongs = 10;
	listB.SortingMethod = RATING;
	

	//Example StoreItems

	StoreItem storeitem1 = new StoreItem();

	storeitem1.Name = "Templerun";
	storeitem1.Price = 0.0;
	storeitem1.Rating = 10.0;
	storeitem1.FileSize = 10;
	storeitem1.Author = "Imangi Studios";

	StoreItem storeitem2 = new StoreItem();

	storeitem2.Name = "Yeah Yeah"
	storeitem2.Price = 0.99;
	storeitem2.Rating = 8.9;
	storeitem2.FileSize = 3.34;
	storeitem2.Author = "Willy Moon";

}

