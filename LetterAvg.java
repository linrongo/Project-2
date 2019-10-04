import java.io.IOException;

public class LetterAvg extends PosAvg{
	private char letter;
	private String sameFirstLetterList;
	public LetterAvg(char letter) throws IOException {
		super(letter);
		this.letter = letter;
		sameFirstLetterList = "";
	}
	
	public int numberOfStationWithLetterAvg() {
		
		int count = 0;
		for (int i = 0; i < placement; ++i) {
			if(stidList[i].charAt(0)==letter) {
				sameFirstLetterList += "\n" + stidList[i];
				++count;
			}
		}
		return count;
	}

public String toString() {
	
	return "\nThey are:" + sameFirstLetterList;
}
	

}
