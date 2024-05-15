player1_name = input("Enter first player Name:  ")
player2_name = input("Enter second player Name:  ")

while True:

    player1_input = (input("player one Choose any one of the option 'ROCK','SCISSORS','PAPER':  ")).lower()
    player2_input = (input("player two Choose any one of the option 'ROCK','SCISSORS','PAPER':  ")).lower()

    if player1_input == player2_input:
        print("it's a TIE")
    elif player1_input == 'rock':
        if player2_input == 'scissors':
            print(player1_name, "WON")
        elif player2_input == 'paper':
            print(player2_name, "WON")
        else:
            print("Player 2 has choosen worng input")
    elif player1_input == 'scissors':
        if player2_input == 'rock':
            print(player2_name, "WON")
        elif player2_input == 'paper':
            print(player1_name, "WON")
        else:
            print("Player 2 has choosen worng input") 
    elif player1_input == 'paper':
        if player2_input == 'rock':
            print(player1_name, "WON")
        elif player2_input == 'scissors':
            print(player2_name, "WON")
        else:
            print("Player 2 has choosen worng input")
    else:
        print("Choosen wrong input, need to terminate this round")

    user_answer = input("Do you want to play another round? choose yes or no  ").lower()
    if user_answer == 'yes':
        pass
    elif user_answer == 'no':
        break
    else:
        print("wrong option terminating the game now")
        break