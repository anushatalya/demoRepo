
public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorting an integer array
		int[] array = {2,4,3,5,1,0,2,-5};
		System.out.println("Content of array before sorting");
		System.out.print("{");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("}");
		
		for(int i=0; i<array.length;i++)
		{
			for(int index=i+1; index<array.length;index++)
			{
				if (array[i]>array[index])
				{
					int temp=array[index];
					array[index]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("Content of array after sorting");
		System.out.print("{");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("}"); 	
	}
}
