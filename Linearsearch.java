package LinearSearch;
public class linearSearch 
{
  public voide lsearch(int[]ar,int key)
  {
	  for(int i=0;i<key.length;i++)
	  {
		  if(ar[i]==key)
			  return i;
	  }
	  return -1
  }
 public static void main(String[] args) 
 {
	/*Please start adding your code here*/
	 int[] a={10,20,30,40,40,60};
	 int key=50;
	 Sysout("lsearch(a,key)");
	 
	 
}
 
}
