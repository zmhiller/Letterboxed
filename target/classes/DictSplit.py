import csv

alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

fields = ['Word', 'Normalized Score', 'Unique Letter Count',
              'Unique Letters']

A = []
B = []
C = []
D = []
E = []
F = []
G = []
H = []
I = []
J = []
K = []
L = []
M = []
N = []
O = []
P = []
Q = []
R = []
S = []
T = []
U = []
V = []
W = []
X = []
Y = []
Z = []

def splitLetters(row):
    first = entry[0][0]
    if first == 'A':
        A.append(row)
    elif first == 'B':
        B.append(row)
    elif first == 'C':
        C.append(row)
    elif first == 'D':
        D.append(row)
    elif first == 'E':
        E.append(row)
    elif first == 'F':
        F.append(row)
    elif first == 'G':
        G.append(row)
    elif first == 'H':
        H.append(row)
    elif first == 'I':
        I.append(row)
    elif first == 'J':
        J.append(row)
    elif first == 'K':
        K.append(row)
    elif first == 'L':
        L.append(row)
    elif first == 'M':
        M.append(row)
    elif first == 'N':
        N.append(row)
    elif first == 'O':
        O.append(row)
    elif first == 'P':
        P.append(row)
    elif first == 'Q':
        Q.append(row)
    elif first == 'R':
        R.append(row)
    elif first == 'S':
        S.append(row)
    elif first == 'T':
        T.append(row)
    elif first == 'U':
        U.append(row)
    elif first == 'V':
        V.append(row)
    elif first == 'W':
        W.append(row)
    elif first == 'X':
        X.append(row)
    elif first == 'Y':
        Y.append(row)
    elif first == 'Z':
        Z.append(row)

with open('test_dictionary.csv', newline='') as old:
    reader = csv.DictReader(old)
    for row in reader:
        entry = [str(row['Word']), float(row['Normalized Score']), int(row['Unique Letter Count']), str(row['Unique Letters'])]
        splitLetters(entry)

for l in alpha:

    with open('split_dicts/dictA.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in A:
                writer.writerow(entry)

    with open('split_dicts/dictB.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in B:
                writer.writerow(entry)

    with open('split_dicts/dictC.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in C:
                writer.writerow(entry)

    with open('split_dicts/dictD.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in D:
                writer.writerow(entry)

    with open('split_dicts/dictE.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in E:
                writer.writerow(entry)

    with open('split_dicts/dictF.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in F:
                writer.writerow(entry)

    with open('split_dicts/dictG.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in G:
                writer.writerow(entry)

    with open('split_dicts/dictH.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in H:
                writer.writerow(entry)

    with open('split_dicts/dictI.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in I:
                writer.writerow(entry)

    with open('split_dicts/dictJ.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in J:
                writer.writerow(entry)

    with open('split_dicts/dictK.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in K:
                writer.writerow(entry)

    with open('split_dicts/dictL.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in L:
                writer.writerow(entry)

    with open('split_dicts/dictM.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in M:
                writer.writerow(entry)

    with open('split_dicts/dictN.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in N:
                writer.writerow(entry)

    with open('split_dicts/dictO.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in O:
                writer.writerow(entry)

    with open('split_dicts/dictP.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in P:
                writer.writerow(entry)

    with open('split_dicts/dictQ.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in Q:
                writer.writerow(entry)

    with open('split_dicts/dictR.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in R:
                writer.writerow(entry)

    with open('split_dicts/dictS.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in S:
                writer.writerow(entry)

    with open('split_dicts/dictT.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in T:
                writer.writerow(entry)

    with open('split_dicts/dictU.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in U:
                writer.writerow(entry)

    with open('split_dicts/dictV.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in V:
                writer.writerow(entry)

    with open('split_dicts/dictW.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in W:
                writer.writerow(entry)

    with open('split_dicts/dictX.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in X:
                writer.writerow(entry)

    with open('split_dicts/dictY.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in Y:
                writer.writerow(entry)

    with open('split_dicts/dictZ.csv', 'w', newline = '') as new:
        writer = csv.writer(new, delimiter=',')
        writer.writerow(fields)
        for entry in Z:
                writer.writerow(entry)
