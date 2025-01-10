class VolumeOfEarth{
    public static void main(String[] args){
	
	    // Craeting the varibale to store the radius of 
		//earth and double for pi.
		int radiusInKm= 6378;
		double radiusInMiles= 6378*0.621;
		double pi= 3.14;
		
		// Creating a double to store the volume of earth
        // and Calculating the volumein km of the earth.
		double volumeInKm=  (4/3) * pi * radiusInKm * radiusInKm
		* radiusInKm;
		
		// Creating a double to store the volume of earth and
        // Calculating the volumein miles of the earth.
		double volumeInMiles=  (4/3) * pi * radiusInMiles * 
		radiusInMiles * radiusInMiles;
		
		// Display the result.
		System.out.println("The volume of earth in cubic kilometers is "
		+ volumeInKm+"  and cubic miles is "+volumeInMiles );
		
	}
}