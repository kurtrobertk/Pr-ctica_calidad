package usj.renting;

public class CoupePrice extends Price{
	 int getPriceCode(){
		 return Car.COUPE;
	 }
	 
	 double getCharge(int daysRented){
		  double result = 2;
          if (daysRented > 2)
		        	result += (daysRented - 2)*1.5;
		  return result;
	    }

	 int getLoyaltyPoints(int daysRented){
		 return 1;
	 }
	 
}
