package pekan1;

import java.util.ArrayList;

public class ArrayListIterasi {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String> ();
		al.add("saya");
		al.add("informatika");
		al.add(1, "mahasiswa");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+ " ");
			}
			System.out.println();
		for (String str : al)
			System.out.println(str + " ");
			System.out.println();
			
			System.out.println("Initial ArrayList " +al);
			al.remove(1);	
			System.out.println("After the index Removal " + al);
			al.remove("saya");	
			System.out.println("After the Object Removal " + al);
		}

	}
