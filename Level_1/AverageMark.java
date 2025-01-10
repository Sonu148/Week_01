class AverageMark {
	public static void main(String[] args){
		
	  // Creating the variable for storing name, markInPhysic,
      // markInChemistry and markInMath.
	  String name ="Sam's";
	  int markInMath =94;
	  int markInPhysic = 95;
	  int markInChemistry = 96;
	  
	  //Evaluting the age.
	  int average = (markInMath+markInPhysic+markInChemistry)/3;
	  
	  //Display the result.
	  System.out.println(name +" average marks in PCM is : "+ average);
	} 
}