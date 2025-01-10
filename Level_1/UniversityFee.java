class UniversityFee{
    public static void main(String[] args){
		
		// Creating a variable fee and discountPercent.
	    int fee= 125000,discountPercent= 10;
		
		// Calculating the discount amount.
        int discount= 125000*10/100;
		
		// Display the result.
		System.out.println("The discount amount is INR "
		+ discount+" and final discounted fee is INR "+
		(125000-discount));
		
	}
}