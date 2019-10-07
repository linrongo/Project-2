# 'PROJECT 2'-linrongo
	
1. MesoInherit - implement methods from MesoAbstract
	a. calAverage - convert all character inside the stID string into Ascill value and add them together, then divide by 4 to get average.
	b. celing, floor and chose between the two with condition provided and make an int[] for thse 3 values.
	c. letter Average - get the 3rd value in the calAverage array and convert that back to char.

2. PosAvg - create stid List from Mesonet.txt, and analyze position and get stid of the stations near by.
	a. read the file prvided, cut and read only the stid in that file and put them into an array, expand if needed.
	b. indexOfStation -  compare all stid on the list to find the one that is the same with the input, then return its position, in this case use a counter and because array start with 0, add 1 to counter when return.
	c. toString -  get the position of the stid by indexOfStation, minus one because array start at 0 not 1, then put use string format and call for the stid that are 1 to 2 station away from the input stid.

3. LetterAvg - extend from PosAvg so it share the stidList
	a. numberOfStationWithLetterAvg - go through the list and find all stid started with the same letter, everytime it was found increase count by 1 and return count at the end.
	b. getStationsWithSameLetter - gothrough the list and find all stid started with the same letter, and add it to the list.
	c. return the list of stid according to tha format provided.