import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main 
{

	public static void main(String[] args) 
	{
		HDTV tv1 = new HDTV(44, "LG");
		HDTV tv2 = new HDTV(80, "BPL");
		HDTV tv3 = new HDTV(42, "Samsung");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		for (HDTV a : al) {
			System.out.println(a.getBrand());
		}
	}
	}
