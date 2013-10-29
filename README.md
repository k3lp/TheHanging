Hanging of the Man
==========

Hanging of the Man is an Android application based on the classic Hangman game.




Features:
•	On boot, gameplay must start.
•	The app’s front side must display placeholders (e.g., hyphens) for yet-unguessed letters that make clear the word’s length.
•	Show how many incorrect guesses can be made before losing.
•	Show guessed letters.
•	Input letter guesses via an on-screen keyboard.
•	Filter invalid input
•	Simple game menu (new game/check highscores)
•	End of game screen, either fail or win.
•	Two settings: the length of words to be guessed (the allowed range for which must be [1,n], where n is the length of the longest word in words.plist/xml); and the maximum number of incorrect guesses allowed (the allowed range for which must be [1,26]).
•	Multiple games at the same time
•	High score table





During game play, the user should be allowed to hit the MENU button on the Android device (or emulator) to cause a menu to appear and allow the user to reset the game, or to open the settings menu. This menu should only appear during game play and not during display of the high scores.

Your app must come with default values for the app’s two settings; those defaults should be set through a PreferenceActivity.

You must implement each of the numeric settings with a slider control.
