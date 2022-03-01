    def setup_game(self):
        engine = pyttsx3.init()  # Speak Initialization
        voices = engine.getProperty('voices')
        engine.setProperty('voice', voices[0].id)
        r = sr.Recognizer()  # Voice Recognition
        audio = ''
        with sr.Microphone() as source:
            engine.say('Your Choice')
            try:
                engine.runAndWait()
            except Exception as e:
                pass
            print('Listening...')
            self.p1Listening.configure(text='''Listening''')
            voice = r.listen(source)
            self.p1Listening.configure(text='''Processing...''')
            print('Processing...')
            print(r.recognize_google(voice))
        # self.engine = pyttsx3.init()  # Speak Initialization
        # voices = self.engine.getProperty('voices')
        # self.engine.setProperty('voice', voices[0].id)
        # self.r = sr.Recognizer()  # Voice Recognition
        # ch = self.show_menu()
        # print(ch)
        # random_number = random.randint(1, 4)
        # print(random_number)
        # random_number = self.get_name(random_number)
        # print(random_number)
        # print(f'Your Choice : {ch} | Computer Choice : {random_number}')
        # winner = self.game_play(random_number, ch)
        # print(winner)
        # if winner == 'Tie':
        #     print('Tie')
        # elif winner == 'computer':
        #     self.score_computer += 1
        # else:
        #     self.score_player += 1
        # print(f'Computer: {self.score_computer} |  Player: {self.score_player}')
        # self.Score_Board.configure(text=f'{self.score_computer} | {self.score_player}')
        # self.final_result()

    # def get_name(self, num):
    #     if num == 1:
    #         self.img1 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/stone.png")
    #         self.p2Image.configure(image=self.img1)
    #         return 'Rock'
    #     elif num == 2:
    #         self.img1 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/paper.png")
    #         self.p2Image.configure(image=self.img1)
    #         return 'Paper'
    #     elif num == 3:
    #         self.img1 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/scissors.png")
    #         self.p2Image.configure(image=self.img1)
    #         return 'Scissors'
    #     elif num == 4:
    #         self.img1 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/thread.png")
    #         self.p2Image.configure(image=self.img1)
    #         return 'Thread'


    # def game_play(self, computer, player):
    #     if computer == 'Rock':
    #         print('F1')
    #         if player == 'Rock':
    #             return 'Tie'
    #         elif player == 'Paper':
    #             return 'computer'
    #         elif player == 'Scissors':
    #             return 'computer'
    #         elif player == 'Thread':
    #             return 'player'
    #
    #     elif computer == 'Paper':
    #         print('F2')
    #         if player == 'Rock':
    #             return 'computer'
    #         elif player == 'Paper':
    #             return 'Tie'
    #         elif player == 'Scissors':
    #             return 'player'
    #         elif player == 'Thread':
    #             return 'player'
    #
    #     elif computer == 'Scissors':
    #         print('F3')
    #         if player == 'Rock':
    #             return 'player'
    #         elif player == 'Paper':
    #             return 'computer'
    #         elif player == 'Scissors':
    #             return 'Tie'
    #         elif player == 'Thread':
    #             return 'computer'
    #
    #     elif computer == 'Thread':
    #         print('F4')
    #         if player == 'Rock':
    #             return 'computer'
    #         elif player == 'Paper':
    #             return 'computer'
    #         elif player == 'Scissors':
    #             return 'player'
    #         elif player == 'Thread':
    #             return 'Tie'

    # def show_menu(self):
    #     audio = ''
    #     with sr.Microphone() as source:
    #         self.engine.say('Your Choice')
    #         self.engine.runAndWait()
    #         print('Listening...')
    #         self.p1Listening.configure(text='''Listening''')
    #         voice = self.r.listen(source)
    #         self.p1Listening.configure(text='''Processing...''')
    #         print('Processing...')
    #     try:
    #         audio = self.r.recognize_google(voice)
    #     except Exception:
    #         self.engine.say('Please Try Again')
    #         self.engine.runAndWait()
    #         self.show_menu()
    #     print(audio)
    #     if audio in ['rock', 'fred']:
    #         self.image2 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/stone.png")
    #         self.p1Image.configure(image=self.image2)
    #         return 'Rock'
    #     elif audio in ['paper']:
    #         self.image2 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/paper.png")
    #         self.p1Image.configure(image=self.image2)
    #         return 'Paper'
    #     elif audio in ['Caesar', 'scissors']:
    #         self.image2 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/scissors.png")
    #         self.p1Image.configure(image=self.image2)
    #         return 'Scissors'
    #     elif audio in ['thread', 'tred', 'tread', 'red', 'tried']:
    #         self.image2 = tk.PhotoImage(
    #             file="/Users/adarshkumar/Documents/PycharmProjects/PythonProject/Images/thread.png")
    #         self.p1Image.configure(image=self.image2)
    #         return 'Thread'
    #     else:
    #         self.engine.say('Please Try Again')
    #         self.engine.runAndWait()

    # def final_result(self):
    #     if self.score_computer == self.score_player and (self.score_player or self.score_computer == 5):
    #         print('Tie')
    #     elif self.score_computer != self.score_player:
    #         if self.score_computer == 5:
    #             self.engine.say('computer wins')
    #             self.engine.runAndWait()
    #             self.engine.say('You Lose')
    #             self.engine.runAndWait()
    #             self.engine.say('Try Next Time')
    #             self.engine.runAndWait()
    #             exit(0)
    #         elif self.score_player == 5:
    #             self.engine.say('Congratulations!')
    #             self.engine.runAndWait()
    #             self.engine.say('You Win')
    #             self.engine.runAndWait()
    #             exit(0)
