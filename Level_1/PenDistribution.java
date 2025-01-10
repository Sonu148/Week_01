class PenDistribution{
   public static void main(String[] args){
	   
	   //Creating a variable int variablr for noOfPens,
       // noOfStudents, nonDistributedPens, distributedPens.
       int noOfPens =14 , noOfStudents= 3;
	   int distributedPens= noOfPens/noOfStudents;
	   int nonDistributedPens= noOfPens%noOfStudents;
	  
	   //Display thr results.
	   System.out.println("The Pen Per Student is "+ distributedPens+
	   " and the remaining pen not distributed is "
	   + nonDistributedPens);
   }
}