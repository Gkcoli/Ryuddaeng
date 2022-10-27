def i(rows=20):
    for k in range(rows):

            print('/'*(rows-k-1) + '*'*(2*k+1) + "\\" *(rows-k-1))
i(20)
