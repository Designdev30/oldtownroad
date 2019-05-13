package array;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		king.whoareyou();
		rose.whoareyou();
		travis.whoareyou();



}   //instantiating new constructor called human //
	static Human rose = new Human( "rose", 5.3F, "female", 12 ); 
	static Human king = new Human ( "king", 6.0F, "male", 30);
	static Human jane = new Human ( "jane", 6.0F, "male", 90);
	static Human jenny = new Human ( "jenny", 6.0F, "male", 100);
	static Human travis = new Human ( "travis", 6.0F, "male", 80);
	
// these are the attributes//
	  int age = 12;
	  String gender;
	  float height;
	  String eyecolor;
	  String name;
	  
	  ///This is the constructor
	  Human(String name, float height, String gender, int Age ){
		this.name= name;
		this.gender=gender;
		this.height= height;
		this.age=age;
		this.eyecolor=eyecolor;
		this.age= Age;
		
	  }
		
	  
 public void whoareyou() {
	 this.age += 5;
			 System.out.println ("wisdom is now " + this.age);
			 System.out.println ("your name is " + this.name);
			 System.out.println ("your height is " + this.height);

}

}
