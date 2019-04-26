var littleOne = [];
var howTheyMarch = ["one by one", "two by two", "three by three", "four by four", "five by five", "six by six", "seven by seven", "eight by eight", "nine by nine", "ten by ten"];


debugger

littleOne[0] = "The little one stops to suck her thumb";
littleOne[1] = "The little one stops to tie his shoe";
littleOne[2] = "The little one stops to climb a tree";
littleOne[3] = "The little one stops to shut the door";
littleOne[4] = "The little one stops to take a dive";
littleOne[5] = "The little one stops to pick up sticks";
littleOne[6] = "The little one stops to pray to heaven";
littleOne[7] = "The little one stops to roll a skate";
littleOne[8] = "The little one stops to check the time";
littleOne[9] = "The little one stops to shut The End";


function theAntsGoMarching(){
	for (var i = 0; i < 9; i++){
		 howManyByHowMany(i);
		console.log(littleOne[i]);
		console.log("And they all go marching down to the ground to get out of the rain, BOOM! BOOM! BOOM!");
	}}
theAntsGoMarching();

function howManyByHowMany(numbers){
	var numbers = howTheyMarch[numbers];
	var hurrah = " hurrah, hurrah";
	var march = "The ants go marching " + numbers;
console.log(march + hurrah + march + hurrah + march);
}

