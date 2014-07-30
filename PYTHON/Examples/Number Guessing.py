import random

guesses_made = 0

name = raw_input('Hello! What is your name?\n')
day = raw_input('How is your day going?\n')
number = random.randint(1, 50)
print 'Well, {0}, I am thinking of a number between 1 and 50.'.format(name)
print 'Do you think you can Guess the Program in less than 10 trys?'
raw_input("")
while guesses_made < 10:

    guess = int(raw_input('Take a guess: '))

    guesses_made += 1

    if guess < number:
        print 'Your guess is too low.'

    if guess > number:
        print 'Your guess is too high.'

    if guess == number:
        break

if guess == number:
    	print '\n\n\n\n********************************************************************************'
	print 'Good job, {0}! You guessed my number in {1} guesses!'.format(name, guesses_made)
	print '********************************************************************************'
else:
	print '\n\n\n\n********************************************************************************'
    	print 'Nope. The number I was thinking of was {0}'.format(number)
	print '********************************************************************************'
raw_input("\n\n\nPress enter to close me...")