package de.ovgu.icse.assignment06;

public class Food {

	   private String name; //name of the food          
	   private String category; //the category of food (en.wikipedia.org/wiki/List_of_foods)
	   // put three further attributes here
		private int price;
		private int nutrition;
		private int season;
	   
	   public Food() {
	       // your implementation goes here
		   name="";
		   category="";
		   price =0;
		   nutrition=0;
		   season=0;
	   }

	   public Food(String inName, String inCategory, int inPrice, int inNutrition, int inSeason)
	   {
	   		name = inName;
	   		category= inCategory;
	   		price = inPrice;
	   		nutrition = inNutrition;
	   		season = inSeason;
	   }
	   
	   public String toString() {
		   // your implementation goes here
		   String theString ="";
		   theString = name + " " + category + " " + Integer.toString(price) + " " + Integer.toString(nutrition) + " " + season;
		   return theString;

	   }
	   
	   public int hashCode() {
		// your implementation goes here
		   int key =0;
		   char[] nameArray = name.toCharArray();
		   char[] categoryArray = category.toCharArray();
		   int nameHashCode=0;
		   int categoryHashCode=0;
		   if(nameArray.length!=0)
		   {
			   nameHashCode = (int)nameArray[0];
		   }
		   if(categoryArray.length!=0)
		   {
			   categoryHashCode = (int)categoryArray[0];
		   }
		   key = (nameHashCode + categoryHashCode + price + nutrition + season)/5;
		   return key;
	   }

	public static void main(String[] args) {
		Food newFood = new Food("abc","bc",1,2,3);
		System.out.println(newFood.toString());
		newFood.hashCode();
	}
}
