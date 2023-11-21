Letterboxed
======

## Done

#### Done... like actually ***done*** done <sup><sup><sup>_I swear_</sup></sup></sup>


#### Working

- Building GameBoard sides & illegal pairs list from initial input `(needs cleanup)`
- Dictionary parsing
- Word validation based on valid letters & illegal pairs
- `Word` object construction `(needs cleanup)`
- List of valid words for game's letters w/ parameters for length, unique letters,\
a base (normalized) score, and an adjusted score based on weighted multipliers of the base


### Working (kinda...)



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
- [ ] Adjustable weighting system
  - word length (shortest <> longest)
  - Letters used (least <> most)
  - Number of words (least <> most)
- [ ] Game Logic
- [ ] Coming Soon™



## Changelog

#### v0.0.2
- Learned that JUnit's `TestSuite` is a thing - testing is much easier now <sub>but soo much wasted time...</sub>
  - *GameBoard*
   	- Building sides from input correctly
    - Identifying illegal pairs correctly
  - *Parsing*
    - Reading `Dictionary` correctly
    - Validating words correctly
    - Building `Word` objects correctly
    - Building valid words lists correctly
- `Dictionary` now includes base (log-normalized) scores & unique letter counts for each word

---

#### v0.0.1
- ~~Implemented custom Tests~~
  - ~~GameBoardTests class, w/ tests for:~~
  - ~~Sides~~
  - ~~Illegal pairs~~ 
  - ~~Parsers read~~ 
  - ~~Valid word parsing~~
  - ~~testMain now calls individual test methods from other Tests classes (e.g. GameBoardTests)~~

- Defining sides working (ex: `String "abcdefghijkl"` ->  `char[][] {[a/b/c][d/e/f][g/h/i][j/k/l]}`)
- Getting illegal pairs working (finds all possible pairings of letters on the same side of the board)
- Dictionary parser working
- Word parsers working (finding valid words & building `Word` objects)