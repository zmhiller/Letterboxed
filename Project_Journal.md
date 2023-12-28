# Letterboxed

## Notes
- ~~Replaced old dictionary~~ 12/28/23 Separated dictionaries by first letter<br>(If Q isn't a valid letter, why process any words that start with Q?)
  - includes raw scores, base (normalized) scores, and unique letter counts \
  (no need to run those calculations for *every* valid word *every* time the program runs)
  - uses log-normalized scores instead of bare Scrabble scores
- Final words lists need to show true variation based on preference.\
Old system proved far too static; same words routinely in top 20 list w/ little change, no matter\
how properties were weighted, even at ***absurd*** weights like 1 / 1 / 1 / **100**

- Learned about JUnit's `TestSuite`, implemented more formalized test suite:


#### Working

- Building GameBoard sides & illegal pairs list from initial input `(needs cleanup)`
- Dictionary parsing
- Word validation based on valid letters & illegal pairs
- Word() object construction `(needs cleanup)`
- List of valid words for game's letters w/ parameters for length, unique letters,\
a base (normalized) score, and an adjusted score based on weighted multipliers of the base

##### Working (kinda...)



#### In Progress

- New Scoring System
  - [x] Log-normalized scores as base
  - [ ] Weighted multipliers based on user preference (longest words, shortest words,\
  most letters, fewest letters, etc.) 
    - Re-normalize final scores before sorting (?)
- [ ] Clean up GameBoard class & separate some functionality


### To-Do
- [ ] Matching class (TBD) to build full solutions from list of valid words
- [ ] Sorting functionality based on user preference
  
Full - 286408

A 