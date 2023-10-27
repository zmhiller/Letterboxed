Letterboxed
======

## Progress

- ### GameBoard 
	- [x] Define Sides
	- [x] Define Illegal Pairs (i.e. pairs of letters on the same side, which can never be used)
	- [x] Define Valid Words List (parse `DICTIONARY` for all words which DO contain ONLY valid letters (i.e. letters on the board), and which DO NOT contain illegal pairs)

- ### I/O
	- [x] Import dictionary.csv (word, raw base score, normalized base score, length)
    - [ ] User input & selection #In_Progress
      - [ ] Letters input
      - [ ] Primary / Secondary scoring preference (presets)
      - [ ] User-adjustable weighting & scaling

- ### Wordlist	
	- ###### Scoring
		- [ ] Adjustable weighting system
			- Word length (shortest <> longest)
			- Letters used (least <> most)
			- Number of words (least <> most)
	- ###### Output
		- [ ] Sort by weighted score
		- [ ] Output formatting (table)

- ### Game Logic
  - [ ] Start / End / Reset game
  - 
- ### GUI
	- [ ] Coming Soon™



## Changelog
- Created GameBoardTests class, w/ tests for:
	- Sides
    - Illegal pairs 
    - Dictionary read 
    - Valid word parsing
- testMain now calls individual test methods from other Tests classes (e.g. GameBoardTests)
- defineSides working (parse String `letters` into sides `[1/2/3] [4/5/6] [7/8/9] [10/11/12]`)
- defineIllegalPairs working (finds all possible pairings of letters on the same side of the board)
- Dictionary reader working
- Dictionary parsing for valid words (ONLY valid letters, NO illegal pairs)