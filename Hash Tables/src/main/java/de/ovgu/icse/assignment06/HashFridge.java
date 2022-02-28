package de.ovgu.icse.assignment06;

public class HashFridge {
	// Do not forget to add appropriate attributes and constructors right here
	private class Node{
		private int key;
		private Object food;
		private int value;

		private Node(int inputKey, Object inputFood, int inputValue)
		{
			this.key=inputKey;
			this.food = inputFood;
			this.value = inputValue;
		}
	}
	private Node[] table;        //hash table
	private int size;           //current number of elements
	private int capacity;

	
	public HashFridge(int cap) {
	    // your implementation goes here
		table = new Node[cap];
		this.size = 0;
		capacity = cap;
	}
	
	public void insert(Food obj, int value) {
		// your implementation goes here
		int key= obj.hashCode();
		if(table[key]==null)
		{
			Node newNode = new Node(key,obj,value);
			table[key] = newNode;
		}
		else
		{

			for(int i =key+1;i<capacity;i++)
			{
				if(table[i].key==key)
				{
					if(table[i].food==obj)
					{
						table[i].value=value+table[i].value;
					}
				}
				else if(table[i].key==0)
				{
					table[i].key=key;
					table[i].food=obj;
					table[i].value=value;
				}
			}
		}
	}
	
	public int search(Food obj) {
		// your implementation goes here
		int key = obj.hashCode();
		for(int i =key;i<capacity;i++)
		{
			if(table[i]!=null)
			{
				if(table[i].key==key) {
					if (table[i].food.toString().equals(obj.toString())) {
						return table[i].value;
					}
				}
			}
		}
		return -1;
	}
	
	public int remove(Food obj, int value) {
		// your implementation goes here
		int key = obj.hashCode();
		for(int i=0;i<capacity;i++)
		{
			if(table[i]!=null)
			{
				if(table[i].key==key)
				{
					if(table[i].food.toString().equals(obj.toString()))
					{
						int amount =0;
						if(value<table[i].value)
						{
							table[i].value=table[i].value-value;
							amount=table[i].value-value;
							return amount;
						}
						else
						{
							table[i] = null;
							return 0;
						}
					}
				}
			}
		}
		return -1;
	}
}
