
Hanging of the Man Concept
==========

Hanging of the Man (HotM) is an Android application based on the classic Hangman game.



A list of database tables and fields (and their types) that you’ve decided to implement;
-------------
*	SQLite Database voor tabel met naam en score, alleen voor top 10 scores.
* 	Woorden die gebruikt worden komen uit een xml file dus niet in database zetten. 


A list of classes and methods (and their return types and/or arguments) that you’ve decided to implement;
-------------
* SplashActivity
			*splashscreen

* MainActivity 	
			* menu met 4 buttons: new game, load game, highscores, quit.
			* newgame roept PregameActivity aan, load game roept LoadgameActivity, highscores roept HighscoreActivity aan.

* PregameActivity 	
			* Kies de settings voor je nieuwe game, de app slaat deze op in sharedpreferences en roept NewgameActivity aan en sluit zichzelf.

* NewgameActivity 
			* Start een nieuw game met gekozen settings

* SaveActivity 
			* Popup of je game wilt saven bij terug naar menu in newgame 

* EndofgameActivity 
			* Popup met score en naam invoeren, slaat deze dan op in SQLite Database.

* HighscoreActivity 
			* Leest de SQLite database met daarin de highscores en laat deze als tabel zien.
