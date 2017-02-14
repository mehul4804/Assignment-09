import java.util.HashMap;
import java.util.Map;

public class EmpHashMap 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> HM=new HashMap<Integer,String>();  
		  HM.put(1,"Sidharth");  
		  HM.put(2,"Sunil");  
		  HM.put(3,"Mahinder");  
		  HM.put(4,"Vaishali");
		  HM.put(5,"Faizal");
		  for(Map.Entry m:HM.entrySet())
		  {  
		   System.out.println(m.getValue());  
		  }
	}
}


