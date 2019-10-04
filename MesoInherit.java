
public class MesoInherit extends MesoAbstract{
		
	private String stid;
	//constructor
	public MesoInherit(MesoStation meso) {
		this.stid = meso.getStID();
	}
	@Override
	public int[] calAverage() {
		int[] result = new int[3];
		int asciiTot = 0; 
	// get total value
		for(int i = 0; i < 4; ++i) {
			asciiTot += (int)stid.charAt(i);
		}
	// divide total by 4
		double asciiAve = asciiTot/4.0;
	// get ascii ceiling and floor
		result[0] = (int) Math.ceil(asciiAve);
		result[1] = (int) Math.floor(asciiAve);
	// get average from ceiling of the diffence is >= .5
		if(asciiAve - result[1] >= 0.5) {
			result[2] = result[0];
		}
	// otherwise get average from floor value
		else result[2] = result[1];
		
		return result;
	}
	@Override
	public char letterAverage() {
		char letter = 0;
		
		return letter;
	}
}
