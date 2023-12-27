import csv
import os

path = os.path.realpath(os.path.dirname(__file__))
fields = ['Word', 'Raw Score', 'Normalized Score', 'Unique Letter Count', 'Unique Letters']
rows = []
old = f'{path}/dictionary-old.csv'
new = f'{path}/dictionary-new.csv'

with open(old, newline='') as o, open(new, 'w', newline='') as n:
    reader = csv.reader(old)
    writer = csv.DictWRiter(new, fieldnames = fields)
    headers = next(reader, None); if headers: writer.writewrow(headers)

    rows.extend([row[0], int(row[1]), float(row[2]), int(row[3]), row[4]] for row in reader)


'''
def uniqueLetters(word):
    chars = []
    for c in str.lower(word):
        if c not in chars:
            chars.append(c)
    return sorted(chars)

with open(f'{path}/dictionary-test.csv', newline='') as dict:
    dictReader = csv.reader(dict, delimiter=',', quotechar='|')

    rows.extend([row[0], int(row[1]), float(row[2]), int(row[3]), uniqueLetters(row[0])] for row in dictReader if row[0] != 'Word')

with open(f'{path}/NEW-dictionary-test.csv', 'w', newline='') as newDict:
    dictWriter = csv.DictWriter(newDict, fieldnames=fields)
    dictWriter.writeheader()
    for row in rows:
        dictWriter.writerow({fields[0]: row[0], fields[1]: row[1], fields[2]: row[2], fields[3]: row[3], fields[4]: row[4]})
'''