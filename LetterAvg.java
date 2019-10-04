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
				sameFirstLetterList += stidList[i] + " \n";
				++count;
			}
		}
		return count;
	}
@Override
public String toString() {
	
	return "They are: \n" + sameFirstLetterList;
}
	

}
