package cse360assign2;

/** Ordered list of up to 10 integers
 * @author Vaul Demar Kranak
 * @version Jan 19, 2016
 * 
 */
public class OrderedIntList
{
	private int[] data;
	private int count;
	
	/** Create an empty list */
	OrderedIntList(int size)
	{
		data = new int[size];
		count = 0;
	}
	
	/** Insert unique integer 
	 *  @param value	integer added to array
	 */
	public void insert(int value) 
	{
		if(length() >= data.length)
		{
			// if list is full, increasing the array size by 50%
			int newsize;
			int[] newarray;
			int increment=0;
			newsize = data.length + (data.length/2);
			newarray = new int[newsize];
			while(increment < length())
			{
				newarray[increment]=data[increment];
				increment++;
			}
			data = newarray;	
		}
		int insertIndex = getInsertIndex(value);
		
		if (insertIndex > data.length-1 || data[insertIndex] == value)
		{
			//do nothing if insertIndex is larger than array 
			// or if value is not unique
			return;
		}
		else if (length() < data.length)
		{
			//shift memory only for what is in the array
			shift(insertIndex, length());
						
			//increment count
			count = count + 1;
		}
		else if(length() == data.length)
		{
			//shift all memory
			shift(insertIndex, data.length-1);
		}

		//store data
		data[insertIndex] = value;
	}

	private int getInsertIndex(int value) {
		int insertIndex = 0;
		for (int index = 0; index < length() && value > data[index]; index++)
		{
			insertIndex++;
		}
		return insertIndex;
	}

	private void shift(int insertIndex, int count) {
		for (int index = count; index > insertIndex; index--)
		{
			data[index] = data[index - 1];
		}
	}
	
	/** Displays the list */
	public void print() 
	{
		for (int index = 0; index < length(); index++)
		{
			System.out.print(data[index]);
			
			if(index == length() - 1)
			{
			}
			else if ((index + 1) % 5 == 0)
			{
				System.out.print("\r\n");
			}
			else if (index < length())
			{
				System.out.print("\t");
			}			
		}
	}
	/*
	 * This method returns the list of elements with a single space between two elements
	 * Empty array yields an empty string 
	 */
	public String toString()
	{
		// For empty array
		if(length() < 1)
			System.out.print("");
		String output = "";

		for(int index = 0; index < length(); index++)
		{
			output = output + data[index];
			if(index+1 < length())
			{
				output = output + " ";
			}
		}
		return output;
	}
	
	/**
	 * This method return the total size of the array
	 */
	public int size()
	{
		return data.length;
	}
	
	/**
	 * This method returns the number of elements present in the array
	 * @param total_length is incremented until non-null elements are found in the array
	 */
	public int length()
	{
		int total_length=0;
		for(int iterator=0; iterator<data.length;iterator++)
		{
			if(data[iterator]!=0)
			{
				total_length++;
			}
		}
		return total_length;
	}
	
	/**
	 * This method returns the position of the key in the array  
	 * @param position is the middle index between start and end index
	 */
	private int search(int key,int start,int end)
	{
		int position=start+(end-start)/2;
		
		// if element is not present in the list
		if(start >= end)
		{
			if  ((start == end) && (data[start] == key))
				return start;
			else
				return -1;
		}
		
		if(key==data[position])
			return position;
		
		else if(key < data[position])
			return search(key,start,position-1);
		
		else if(key > data[position])
			return search(key,position+1,end);
		
		return -1;
		
	}
	
	/**
	 * This method makes use of search method to find the position of the key to be deleted
	 * If the number of elements in the array is less than 50% of its total size, the size of the array is reduced by 40%
	 * @param position is the index returned by binary search
	 */
	public void delete (int key)
	{
		int position;
		int total_size;
		position = search(key,0,length()-1);
		total_size = length();
		if(position >= 0)
		{
			if(position == length()-1)
				data[position]=0;
			else {
				while(position != length() - 1)
				{
					data[position]=data[position+1];
					position++;
				}
				data[position]=0;
			}
		
			if(total_size < data.length/2)
			{
				int newsize;
				newsize = data.length - (data.length * 4 )/10;
				int[] newarray = new int[newsize];
				int increment=0;
				while(increment < total_size)
				{
					newarray[increment]=data[increment];
					increment++;
				}
				data = newarray;
			}
		}
		
	}
}