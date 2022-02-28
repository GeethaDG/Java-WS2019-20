package de.ovgu.icse.assignment06;

public class HashLinQuad {
	   private int[] table;        //hash table
	   private int size;           //current number of elements          
	   private int capacity;        //capacity of the hash table
	   
	   public HashLinQuad (int _size) {
	      table = new int[_size];
	      this.size = 0;
	      capacity = _size;
	      
	      for (int i = 0; i < _size; i++)
            table[i] = -1;
	   }

	   public int addLin (int obj) { 
	      //add obj into table using linear probing
		   int collisions =0;
		   int key = obj;
		   if(table[key]==-1)
		   {
			table[key]=obj;
		    return collisions;
		   }
		   else
		   {
			   while (table[key] != -1) {
				   key = key + 1;
				   collisions = collisions + 1;
			   }
			   table[key]=obj;
			   return collisions;
		   }
	   }
	   
	   public int addQuad (int obj){ 
	      //add obj into table using quadratic probing
		   int collisions =0;
		   int key = obj;
		   if(table[key]==-1)
		   {
			   table[key]=obj;
			   return collisions;
		   }
		   else
		   {
				int i =1;
			   while (table[key] != -1) {
				   key = obj + i*i;
				   collisions = collisions + 1;
				   i=i+1;
				   if((obj + i*i)>capacity)
				   {
				   	i=i+1;
				   }
			   }
			   table[key]=obj;
			   return collisions;
		   }
	   }

	
}
