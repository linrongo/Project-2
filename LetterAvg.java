import java.io.IOException;

public class LetterAvg extends PosAvg{
	private char letter;
	public LetterAvg(char letter) throws IOException {
		super(letter);
		this.letter = letter;
	}
	
	public int numberOfStationWithLetterAvg() {
		int count = 0;
	// go through the list and see how many station start with the same letter of the input.
		for (int i = 0; i < placement; ++i) {
			if(stidList[i].charAt(0)==letter) {
				++count;
			}
		}
		return count;
	}
	
	 public String getStationsWithSameLetter() {
		 String list ="";
		 // do the same thing with numberOfStationWithLetterAvg(), but put it in a String 
				for (int i = 0; i < placement; ++i) {
				if(stidList[i].charAt(0)==letter) {
					list += "\n" + stidList[i];				
				}
			}
		 return list;
	 }
public String toString() {
	
	return "\nThey are:" + getStationsWithSameLetter();
}
	

}
