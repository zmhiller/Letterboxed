import csv

fullDict = 'dictionaries/dictA.csv'
letters = 'abcdefghijkl'
illegalPairs = ["aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"]

with open(fullDict,  newline="") as full:
    
    reader = csv.DictReader(full)
    for row in reader:
        add = true
        word = row['Word']:
        uniqueLetters = row['Unique Letters']
        wordPairs = []

        for l in uniqueLetters:
            if l not in letters:
                add = false

        for char1 in word:
            for char2 in word:
                wordPairs.append(char1 + char2)
        print(wordPairs)


