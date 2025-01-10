class CalculateProfitAndLoss{
  public static void main(String[] args){
	  
	  //Creating the variable.
      int costPrice= 129;
	  int sellingPrice= 191;
	  int profit= sellingPrice-costPrice;
	  
	  //Evaluting the profitPercentage.
	  float profitPercentage= ((float)profit/(float)costPrice)*100;
	  
	  // Display the results.
	  System.out.println("The Cost Price is INR "+ costPrice +
	  " and selling Price is INR "+ sellingPrice+
	  "\nThe Profit is INR "+ profit + " and the Profit Percentage is "
	  +profitPercentage);
  }
}