package fcu.iecs.oop;

public class Hello {
	
	public static void main (String[] args)
	{
		String lyrics ="Let it go! Let it go!Cannot hold it back anymore";
		
		lyrics = lyrics.substring(0,3).concat(" ")  + lyrics.substring(4,6).replace('i', 'h').replace('t', 'e').concat("r")
				+ lyrics.substring(6,10) + lyrics.substring(11,14).concat(" ")  
				+ lyrics.substring(15,17).replace('i', 'h').replace('t', 'e').concat("r")
				+ lyrics.substring(17,21) + lyrics.substring(21,24)
				+ lyrics.substring(25,27).replace('o', '\'').concat(" ")+lyrics.substring(27,48); 
		System.out.println(lyrics);
	}
}
 