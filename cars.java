package array;
import java.util.*;
import java.util.Scanner; 
public class cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userChoice();

	}
	public static String userChoice() {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("what make car would you like?"); 
	    String userAnswer = myObj.nextLine();   
	    System.out.println ("You chose " + userAnswer);  
	    myObj.close();
	    return userAnswer;
	}
	//static makes it global 
	    
	public static HashMap<String, String> cars = new HashMap<>();

	
	

	public static void main(String[] args) {
	cars.put("honda","accord");
	cars.put("nissan", "altima");
	cars.put("honda", "civic");
	
	
	cars.containsKey("Honda");
	for (Map.Entry<String, Integer> entry : cars.entrySet()){
		String key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println(key + ":" + value);
		}
	
	 System.out.println(cars);

	}}
