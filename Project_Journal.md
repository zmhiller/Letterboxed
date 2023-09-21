# Letterboxed

## Notes
- Replaced old dictionary; now uses log-normalized scores instead of bare Scrabble scores.

## Ideas
- New Scoring System:
	Log-normalized scores as base
	Weighted multipliers based on user preference (longest words, shortest words,
		most letters, fewest letters, etc.)
	(?) Re-normalized final scores before sorting


### Implemented
- Log-normalized base scores in dictionary.csv


### Not Implemented


## To-Do
- More scoring system testing - base scores work fine, need to test different methods for
	weighted multipliers.  Final words lists need to show true variation based on preference;
	old system proved far too static - same words routinely in top 20 list w/ little change no matter
	what properties were weighted most heavily, even at *absurd* weights (i.e. 1,1,1,100) 
