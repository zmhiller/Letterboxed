oldDictData = []

with open("/home/zach/Projects/Java/Letterboxed/src/main/resources/dictionary.csv", "r") as dict:
    for line in dict:
        oldDictData.append(line)

def test():
    i = 0
    while i < 5:
        i = i + 1
        print(jsonWriter(oldDictData[i]))
        #print(jsonWriter(source[i]))

def jsonWriter(line: str ) -> str:
    line = line.split(",")
    word = line[0]; raw = line[1]; base = line[2]; uniqueCount = line[3]; uniqueList = line[4]
    json = f'"{word.lower()}": <\n\t"rawScore": {int(raw)},\n\t"baseScore": {float(base)},\n\t"uniqueCount": {int(uniqueCount)},\n\t"letters": {list(uniqueList)[:-1]},\n\t"letterStr": "{str(uniqueList[:-1])}"\n>,\n\n'
    json = json.replace("<", "{").replace(">", "}").replace("'", "\"")

    return json



def writeDict(oldDict: []):
    i = 0
    with open("/home/zach/Projects/Java/Letterboxed/src/main/resources/dictionary.json", "x") as newDict:
        for line in oldDict[1:]:
            newDict.write(jsonWriter(line))

writeDict(oldDictData)
test()
