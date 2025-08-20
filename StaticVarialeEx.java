package StaticKeyword;

public class StaticVarialeEx 
{
	String name;
	int id;
	static String instName="XYZ";
	
	StaticVarialeEx(String n, int i)
	{
		name = n;
		id = i;
	}
	void show()
	{
		System.out.println("Name is:"+name+" Id is:"+id+" Institute name is:");
		
	}
	public static void main(String[] args) 
	{
		StaticVarialeEx s1 = new StaticVarialeEx("John",101);
		StaticVarialeEx s2 = new StaticVarialeEx("Ram",102);
		StaticVarialeEx s3 = new StaticVarialeEx("Aryan",103);
		s1.show();
		s2.show();
		s3.show();
		}

}
