import csv

fullDict = 'dictionaries/dictA.csv'
newDict = []
testLetters = 'abcdefghijkl'
testIllegalPairs = ["aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "dd", "de", "df",
            "ed", "ee", "ef", "fd", "fe", "ff", "gg", "gh", "gi", "hg", "hh", "hi", "ig", "ih", "ii", "jj", "jk",
            "jl", "kj", "kk", "kl", "lj", "lk", "ll"]
fields = ["Word", "Normalized Score", "Unique Letter Count", "Unique Letters"]

with open(fullDict,  newline="") as full:
        reader = csv.DictReader(full)
        for row in reader:
            word = row['Word'].lower()
            uniqueLetters = row['Unique Letters']
            wordPairs = []
            for l in uniqueLetters:
                if l not in testLetters:
                    break
            for char1 in word:
                for char2 in word:
                    wordPairs.append(char1 + char2)
            for pair in testIllegalPairs:
                if pair in wordPairs:
                    break
            newDict.append(row)

        print(len(newDict))
        print(newDict[100])

with open('dictionaries/testDictA.csv', 'w', newline='') as new:
    writer = csv.DictWriter(new, fieldnames=fields, delimiter=",")
    writer.writeheader()
    for entry in newDict:
        word = entry['Word']
        score = entry['Normalized Score']
        uniqueCount = entry['Unique Letter Count']
        uniqueLetters = entry['Unique Letters']

        writer.writerow({'Word': word, 'Normalized Score': score, 'Unique Letter Count': uniqueCount, 'Unique Letters': uniqueLetters})
