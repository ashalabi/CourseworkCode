import java.lang.Math;


public class RussianMultiply {

public static int multiply(int a, int b){
	//System.out.println("Multiplying "+a+" and "+b); //tracker
	if (a==1){
	//	System.out.println("returning b: "+b); //tracker
		return b;}
	int output = multiply(a/2,b*2); 
	//System.out.println("value of temp: "+temp); //tracker
	if (a%2==1){
			output+=b;
	//		System.out.println("the new sum is " +temp);//tracker
		}
	//System.out.println("returning temp: "+temp);//tracker
	return output;
	}
	
}
	




