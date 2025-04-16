# RockPaperScissors_Game
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Rock Paper Scissors - Java Game</title>
</head>
<body>

  <h1>🎮 Rock Paper Scissors - Java Console Game</h1>

  <p>This is a fun and interactive console-based Rock Paper Scissors game written in Java. It allows a user to play against the computer, keeps track of the score, and displays the winner at the end of the game.</p>

  <hr>

  <h2>🧩 Game Features</h2>
  <ul>
    <li>Text-based console interaction</li>
    <li>User enters their name and age (validated input)</li>
    <li>Score tracking for both user and computer</li>
    <li>Real-time feedback for each round</li>
    <li>Game ends on user request or invalid input</li>
    <li>Final winner is declared based on scores</li>
  </ul>

  <hr>
  
  <h2>🧠 How It Works</h2>
<ul>
  <li>The game starts by asking the user for their name and age.</li>
  <li>The player can choose between Rock (1), Paper (2), Scissors (3), or to End the Game (4).</li>
  <li>The computer randomly selects its choice each round.</li>
  <li>The result of each round is calculated and scores are updated and displayed.</li>
  <li>When the player chooses to end the game, final scores are displayed and a winner is declared.</li>
</ul>

 <hr>

  <h2>🔍 Game Rules</h2>
  <p>The winner of each round is decided based on the classic rules:</p>
  <ul>
    <li><strong>Rock</strong> beats <strong>Scissors</strong></li>
    <li><strong>Scissors</strong> beats <strong>Paper</strong></li>
    <li><strong>Paper</strong> beats <strong>Rock</strong></li>
  </ul>

  <hr>

<h2>📋 Notes</h2>
<ul>
  <li>Make sure to enter a valid age (&gt; 0) and valid choices (1–4).</li>
  <li>This is a beginner-friendly Java project – feel free to improve and build on top of it!</li>
</ul>

  <hr>

  <h2>📋 How to Play</h2>
  <ol>
    <li>Download the <code>RockPaperScissors.java</code> file.</li>
    <li>Open a terminal or command prompt.</li>
    <li>Compile the program:
      <pre><code>javac RockPaperScissors.java</code></pre>
    </li>
    <li>Run the compiled program:
      <pre><code>java RockPaperScissors</code></pre>
    </li>
    <li>Follow the on-screen prompts to play the game.</li>
  </ol>

   <hr>

  <h2>📺 Sample Gameplay</h2>
  <pre>
Enter your name: John
Enter your age: 22

Available choices:
1. Rock
2. Paper
3. Scissors
4. End Game

Enter your choice (1-4): 1
You chose : Rock
Computer chose : Scissors
Score - [John] : [1]
Score - [Computer] : [0]

Enter your choice (1-4): 3
You chose : Scissors
Computer chose : Paper
Score - [John] : [1]
Score - [Computer] : [1]

Enter your choice (1-4): 2
You chose : Paper
Computer chose : Paper

It's a tie!
Score - [John] : [1]
Score - [Computer] : [1]

Enter your choice (1-4): 2
You chose : Paper
Computer chose : Rock
Score - [John] : [2]
Score - [Computer] : [1]

...

Final Score - [John] : [2]
Final Score - [Computer] : [1]

John wins the game! 🎉
  </pre>

  <hr>

  <h2>🚀 Future Enhancements (Ideas)</h2>
  <ul>
    <li>Add difficulty levels (Easy, Medium, Hard)</li>
    <li>Implement a leaderboard using file handling</li>
    <li>Build a GUI version with JavaFX or Swing</li>
    <li>Track game history</li>
  </ul>

  </body>
</html>

<hr>

<h2>📄 License</h2>
<p>This project is open-source and free to use under the <a href="LICENSE">MIT License</a>.</p>

<hr>

<h2>🙌 Acknowledgements</h2>
<p>Built with ❤️ using basic Java concepts for learning and fun.</p>
