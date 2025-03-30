import java.io.*;
import java.util.*;

class Main {
	public static boolean anagram(String a, String b)
	{
		if (a.length() != b.length()) 
		{
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) 
		{
			if (map.containsKey(a.charAt(i))) 
			{
				map.put(a.charAt(i),map.get(a.charAt(i)) + 1);
			}
			else {
				map.put(a.charAt(i), 1);
			}
		}
		for (int i = 0; i < b.length(); i++) 
		{
			if (map.containsKey(b.charAt(i))) 
			{
				map.put(b.charAt(i),map.get(b.charAt(i)) - 1);
			}
		}
		Set<Character> keys = map.keySet();
		for (Character key : keys) 
		{
			if (map.get(key) != 0) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first string : ");
		String s1 = s.nextLine();
	    System.out.print("Enter the second string : ");
		String s2 = s.nextLine();
		if (anagram(s1, s2))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are " + "not anagram of each other");
	}
}
