package de.ovgu.icse.assignment02;

import java.util.*;

public class Food implements Comparable<Food> {
    String name;
    int calories;

	public Food(int calories, String name) {
	    this.calories=calories;
	    this.name=name;
	}

	public int compareTo(Food o) {
		if (this.name.length()*this.calories == o.name.length()*o.calories) return 0;
		else if (this.name.length()*this.calories > o.name.length()*o.calories) return 1;
		else return -1;
	}

	public int getCalories() {
        return this.calories;
	}

	public String getName() {
		return this.name;
	}

	public static Food[] createSortedRandomList() {
		int arrayLength = (int) (100*Math.random());
        Food[] food = new Food[arrayLength];
        String[] foodNames = {"Apple","Oranges","Pizza","Greek Salad","Rice","Pringles","Tuna","Lamb Leg Roast",
				"Broccoli","Mustard" };
        for(int i = 0; i < arrayLength; i++) {
            int randomCalories=(int)(100*Math.random());
            String randomName=foodNames[i];
            Food newFood=new Food(randomCalories,randomName);
            food[i]=newFood;
        }
        Arrays.sort(food);
        return food;
	}

	public String toString() {
	    return this.name+":"+this.calories;
	}
}
