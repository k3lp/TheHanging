Hanging of the Man Concept
==========

Hanging of the Man (HotM) is an Android application based on the classic Hangman game.



Database tables and fields:
-------------
*	SQLite Database voor tabel met naam en score, alleen voor top 10 scores.
* 	Woorden die gebruikt worden komen uit een xml file dus niet in database zetten. 


Classes and methods:
-------------
* SplashActivity
	* splashscreen
* MainActivity 	
	* menu met 4 buttons: new game, load game, highscores, quit.
	* newgame roept PregameActivity aan, load game roept LoadgameActivity, highscores roept HighscoreActivity aan.
	* ![Alt text](/menu_sketch.jpg)
* PregameActivity 	
	* Kies de settings voor je nieuwe game, de app slaat deze op in sharedpreferences en roept NewgameActivity aan en sluit zichzelf.
	* ![Alt text](/pregame_sketch.jpg)
* NewgameActivity 
	* Start een nieuw game met gekozen settings
	* ![Alt text](/sketch.jpg)
* SaveActivity 
	* Popup of je game wilt saven bij terug naar menu in newgame 
	* ![Alt text](/savepopup_sketch.jpg)
* EndofgameActivity 
	* Popup met score en naam invoeren, slaat deze dan op in SQLite Database.
	* ![Alt text](/endgame_sketch.jpg)
* HighscoreActivity 
	* Leest de SQLite database met daarin de highscores en laat deze als tabel zien.
	* ![Alt text](/highscores_sketch.jpg)

Styleguide:
==========
Comments
-------------
Comments van één regel worden als volgt gedaan:
```
//dit is een comment
```
Comments van meerdere regels worden anders gedaan:
```
/*
 * Dit is een comment.
 * Met meerdere regels.
 */
```
Loops
-------------
	
	
