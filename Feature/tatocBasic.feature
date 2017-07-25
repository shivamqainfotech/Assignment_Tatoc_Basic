
@tag
Feature: Tatoc Test


@tag1
Scenario: Performing actions on Tatoc
Given I am on tatoc page and select basic course
	And Click on Green Box to proceed to next page
When I Clicks on Repaint link untill color of second box becomes same then click proceed
	And DRAG ME box is dragged to the cell labeled DROPBOX then click on Proceed link
	And Clicking on launch window link will launch a popup window with a form
Then Submit the form with your name to close it and click proceed
	And Clicking on Generate Token will print token in Token box
	Then Copy token value and create a Cookie on this page
	And Clicking on Proceed link when Token cookie is set properly and Token is valid will take you to next page


