

var computerInput = Math.ceil(Math.random() * 3);
var game = "Let's play a game!"
var name = prompt("What is your name?");


 console.log("What's up, "+ name + "?" + " " + game)

var userAnswer = prompt("Rock, Paper, Scissors");

var computerAnswer = Math.ceil(Math.random() * 3);

var Rock = 1;
var Paper = 2;
var Scisscors = 3;

console.log(computerAnswer);

if (userAnswer == "Rock" || userAnswer == "rock" && computerAnswer == Rock) {
 alert("Tie Game");
}

else if (userAnswer == "Rock" || userAnswer == "rock" && computerAnswer == Paper) {
 alert("You Lost");
}
else if (userAnswer == "Rock" || userAnswer == "rock" && computerAnswer == Scissors) {
 alert("You Won");
}

else if (userAnswer == "Paper" || userAnswer == "rock" && computerAnswer == Paper) {
 alert("You Lost");
}
else if (userAnswer == "Paper" || userAnswer == "rock" && computerAnswer == Scissors) {
 alert("You Won");
}
else if (userAnswer == "Paper" || userAnswer == "rock" && computerAnswer == Paper) {
 alert("You Lost");
}
else if (userAnswer == "Scissors" || userAnswer == "rock" && computerAnswer == Scissors) {
 alert("You Won");
}
else if (userAnswer == "Scissors" || userAnswer == "rock" && computerAnswer == Paper) {
 alert("You Lost");
}
else if (userAnswer == "Scissors" || userAnswer == "rock" && computerAnswer == Scissors) {
 alert("You Won");
}
else{
 alert("Pick Rock, Paper or Scissors")
}