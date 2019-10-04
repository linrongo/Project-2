import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PosAvg {	
	
	private int capacity;
	private int placement;
	private String[] stidList;
	private String stid;
	
	public PosAvg(String stid) throws IOException {
		capacity = 1;
		placement = 0;
		this.stid = stid;
		stidList = new String[capacity];
		readFile();
	}
	
	private void readFile() throws IOException {
			BufferedReader profile = new BufferedReader(new FileReader("Mesonet.txt"));
	       	String line;
	       	String stid;
	       	String[] info;
	       	
	      //skip 2 lines
			final int limit = 3;
			for(int i = 0; i < limit; i++) {			
		       	line = profile.readLine();
			}
			
			line = profile.readLine();
		    while ( line != null) {
		    	
		      // Trim, split the line and get stid,, then add it to the list
		    	line = line.trim();
		    	info = line.split("\\s+");
		    	stid = info[0];
		    		       
		       	
		      // Add it to the array of STIDs and expand if full       		
		       	if (placement == capacity) {
		       		expandList();
		       		stidList[placement] = stid;
		       		++ placement;  
		       	}
		       	else {	       		
		       		stidList[placement] = stid;
		       		++ placement;   		
		       	}
		      line = profile.readLine();
	       }    
	   profile.close();         
		}
		
	private void expandList() {
			// Make a new array that's twice the capacity
				capacity = capacity *2;
				String[] expand = new String[capacity];
			// Copy the old array into the new one
				for(int i = 0; i < stidList.length; ++i) {
					expand[i] = stidList[i];
				}
				this.stidList = expand;
			}

}
