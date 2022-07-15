import java.util.*;
public class Test 
{
	public static void main(String[] args) 
	{
	ArrayList<String> language_list = new ArrayList<String>(5);
	language_list.add("HTML");
	language_list.add("CSS");
	language_list.add("JAVASCRIPT");
	language_list.add("REACTjs");
	language_list.add("BOOTSTRAP");
	System.out.println("Size of list: " + language_list.size());
	for (String value : language_list) 
		{
			System.out.println("Language = " + value);
		}
		Object[] obj = language_list.toArray();
		System.out.println("Print elements from first to last:");
		for (Object value : obj) 
		{
			System.out.println("Language = " + value);
		}
	}
}