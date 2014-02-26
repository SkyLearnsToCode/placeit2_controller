package com.classproj.placeit.ctests;

import junit.framework.TestCase;

/*
 * Test 1. 
Open the application 
Then open the left side bar
The user will click the create category Place-it button
A dialog box should pop up and the user should select up to 3 categories. 
The user can select up to 3 categories from a select box and enter Place-It info. 
assert that the user presses the three categories
assert that the user entered the Place-It info
Press the OK button
Assert that the markers size increased
Open the list again
assert that there is a placeit created for that

Test 2. 
Open the application 
Swipe to open the left side bar
Click on the map
Click on the create category option 
assert that the dialog pops up 
assert that the 3 categories pop up and can be selectd it
enter a place-it info
assert that the info can be taken in
click the cancel button
swipe for the bar again 
assert that the title of the place-it created did not occur

 */
public class UserStory1 extends TestCase {

	public UserStory1(String name) {
		super(name);
	}

}
