alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
fields = ['Word', 'Normalized Score', 'Unique Letter Count',
              'Unique Letters']

for l in alpha:
    print(f"with open('split_dicts/dict{l}.csv', 'w', newline = '') as new:\n\t\
writer = csv.writer(new, delimiter=',')\n\twriter.writerow(fields)\n\tfor entry in {l}\
:\n\t\twriter.writerow(entry)\n")