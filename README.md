# Letterboxed

## Changelog
- Created GameBoardTests class
	- Added separate unit tests for sides, illegal pairs
- testMain now calls individual test methods from other Tests classes (e.g. GameBoardTests)
- defineIllegalPairs working (finds all possible pairings of letters on the same side of the board)


## To Do
- [ ] Import dictionary.csv (words & base scores)
- [ ] Define valid words (length >= 3, no illegal pairs)
- [ ] Create weighted scoring system
	- Word length (short <> long)
	- Letters used (least <> most)
	- Number of words (least <> most)
- [ ] Valid Wordlist sorting
- [ ] Wordlist output
- [ ] GUI
