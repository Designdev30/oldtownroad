var comp_answer = Math.ceil(Math.random() * 3);


document.getElementById('paper').addEventListener('click', function() {

console.log("paper");
		player2.choice = "paper";
		console.log(player2);
		var computerAnswer = Math.ceil(Math.random() * 3);
		console.log(decider(player2.choice,comp_answer));
});

document.getElementById('scissors').addEventListener('click', function() {

console.log("scissors");
		player2.choice = "scissors";
		console.log(player2);
		console.log(decider(player2.choice,comp_answer));
		var computerAnswer = Math.ceil(Math.random() * 3);


});

document.getElementById('rock').addEventListener('click', function() {
console.log("rock");
		player2.choice= "rock"
		console.log(player2);
		console.log(decider(player2.choice,comp_answer));
});

//document.getElementById("rock").onclick = function(button){
	


//}
var Rock = 1;
var Paper = 2;
var Scisscors = 3;

var player1= {
				name: "Jane",
				choice: "null"
}

var player2= {
				name: "John",
				choice: "null"
}

function decider (userAnswer,computerAnswer){
if (userAnswer == "rock" || userAnswer == "rock" && computerAnswer == "rock") {
 return ("Tie Game");
}

else if (userAnswer == "rock" || userAnswer == "rock" && computerAnswer == "paper") {
 return ("You Lost");
}
else if (userAnswer == "rock" || userAnswer == "rock" && computerAnswer == "scissors") {
 return ("You Won");
}

else if (userAnswer == "paper" || userAnswer == "rock" && computerAnswer == "paper") {
 return ("You Lost");
}
else if (userAnswer == "paper" || userAnswer == "rock" && computerAnswer == "scissors") {
 return ("You Won");
}
else if (userAnswer == "paper" || userAnswer == "rock" && computerAnswer == "paper") {
 return ("You Lost");
}
else if (userAnswer == "scissors" || userAnswer == "rock" && computerAnswer == "scissors") {
 return ("You Won");
}
else if (userAnswer == "scissors" || userAnswer == "rock" && computerAnswer == "paper") {
 return ("You Lost");
}
else if (userAnswer == "scissors" || userAnswer == "rock" && computerAnswer == "scissors") {
 return ("You Won");
}
else{
 return ("Pick Rock, Paper or Scissors")
}
}