import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayduplicate {

	public static void main(String[] args) 
	{
		 String[] data = { "A", "C", "B", "D", "A", "B", "E", "D", "B", "C" };
		    System.out.println("Original array         : " + Arrays.toString(data));

		    List<String> list = Arrays.asList(data);
		    Set<String> set = new HashSet<String>(list);

		    System.out.print("After Removing duplicates : ");

		    String[] result = new String[set.size()];
		    set.toArray(result);
		    for (String s : result) {
		      System.out.print(s + ", ");
		    }
		  }

	}
