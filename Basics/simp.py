k = 0
queries = [1,2,3,4,5,90]
intLength = 3
palindrome = [0]
for x in range (pow(10 , intLength-1) , (pow(10 , intLength))):
    reverse = 0
    copyx = x

    while(x!= 0):
        reverse = (reverse * 10 ) + (x%10)
        x//=10
    if reverse == copyx :
        palindrome.append(reverse)
# print(palindrome)
# print(len(palindrome))
Answer = []
for element in queries :
    Answer.append(palindrome[element])
    
print(Answer)