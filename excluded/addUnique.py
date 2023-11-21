import csv
import os

path = os.path.realpath(os.path.dirname(__file__))

rows = []
with open(path + '/dictionary-test.csv', newline='') as dict:
    dictReader = csv.reader(dict, delimiter=',', quotechar='|')
    for row in dictReader:
        if row[0] != 'Word':
            unique = int(len(set(str(row[0].lower()))))
            rows.append([row[0], int(row[1]), float(row[2]), int(row[3]), unique])
    #print(rows[0])
    #print(rows[1])


with open(path + '/NEW-dictionary-test.csv', 'w', newline='') as newDict:
    #writer = csv.writer(newDict, delimiter=',', quotechar='|', quoting=csv.QUOTE_MINIMAL)
    #writer.writerow(['Word', 'Raw Score', 'Normalized Score', 'Length', 'Unique Letters'])
    fields = ['Word', 'Raw Score', 'Normalized Score', 'Length', 'Unique Letters']
    dictWriter = csv.DictWriter(newDict, fieldnames=fields)
    dictWriter.writeheader()
    for row in rows:
        dictWriter.writerow({fields[0]: row[0], fields[1]: row[1], fields[2]: row[2],
                              fields[3]: row[3], fields[4]: row[4]})

        #print(row)
        #writer.writerow(row)