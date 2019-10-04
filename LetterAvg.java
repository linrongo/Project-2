import java.io.IOException;

public class LetterAvg extends PosAvg{
	private char letter;
	public LetterAvg(char letter) throws IOException {
		super(letter);
		this.letter = letter;
	}
	
	public int numberOfStationWithLetterAvg() {
		int count = 0;
		for (int i = 0; i < placement; ++i) {
			if(stidList[i].charAt(0)==letter) {
				++count;
			}
		}
		return count;
	}

	

	

}
