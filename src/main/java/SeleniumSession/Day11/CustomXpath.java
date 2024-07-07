package SeleniumSession.Day11;

public class CustomXpath {
	
	//xpath: address of the element
	
	//1. Absolute Xpath:
	
	//2. Relative Xpath:
	//formula
	//xpath axes : relationship: parent, child, siblings
	//functions
	
	//htmltag[@attr='value']
	
	//htmltag[@attr1='value1' and @attr2='value2']
	
	//htmltag[@attr1='value1' and @attr2='value2' and @attr3='value3']
	//htmltag[@attr1='value1' and @attr2='value2' and @attr3]
	//htmltag[@attr1 and @attr2 and @attr3]
	
	//htmltag[@attr1='value1' or @attr2='value2']
	
	//*[@attr='value']
	//*[@type='text']   out of 100:3 it finds the match
	//input[@type='text'] out of 14:3 it finds the match == So performance wise this is better
	
	
	//text()
	//htmltag[text()='value']
	
	//contains()
	//contains with attribute
	//htmltag[contains(@attr,'value')]
	//htmltag[contains(@attr,'value') and @attr2='value2']
	//htmltag[contains(@attr,'value') and contains(@attr2,'value2')]
	
	//<input id=firstname_123/>
	//<input id=firstname_456/>
	//<input id=firstname_789/>
	
	//input[contains(@id,'firstname')]
	
	//contains() with text()
	//htmltag[contains(text(),'value')]
	
	//starts-with()
	//htmltag[starts-with(@attr='value')]
	
	//ends-with() - Not available has it got depricated
	
	//indexing in xpath
	//  (//htmltag[@attr='value'])[i]
	//  (//htmltag[@attr='value'])[position()=1]
	//  (//htmltag[@attr='value'])[last()]
	//  (//htmltag[@attr='value'])[last()-1]
	
	////option[normalize-space()='Albania']
	
	

}
