import csv

alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

for l in alpha:
    file = f'dict{l}.csv'
    with open(file, newline='') as dictionary:
        reader = csv.reader(new, delimiter=',')
        print(len(reader))