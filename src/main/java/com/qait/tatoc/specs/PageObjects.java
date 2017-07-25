package com.qait.tatoc.specs;

import org.openqa.selenium.By;

public class PageObjects {

	private By L_basic_course= By.linkText("Basic Course");
    private By C_green_box =By.className("greenbox");
    private By L_Repaint_Box=By.linkText("Repaint Box 2");
    private By I_Box_2=By.id("answer");
    private By I_Box_1=By.id("answer");
    private By L_repaint_Box_proceed_click=By.linkText("Proceed");
    private By I_drag_Box=By.id("dragbox");
    private By I_drop_Box=By.id("dropbox");
    private By L_dragNdrop_proceed=By.linkText("Proceed");
    private By L_Popup_Window=By.linkText("Launch Popup Window");
    private By I_input_name=By.id("name");
    private By I_submit=By.id("submit");
    private By L_submit_name_proceed=By.linkText("Proceed");
    private By L_Generate_Token=By.linkText("Generate Token");
    private By I_token=By.id("token");
    
    
    
    
	public By getL_basic_course() {
		
		return L_basic_course;
	}
	public By getC_green_box() {
		return C_green_box;
	}
	public By getL_Repaint_Box() {
		return L_Repaint_Box;
	}
	public By getI_Box_2() {
		return I_Box_2;
	}
	public By getI_Box_1() {
		return I_Box_1;
	}
	public By getL_repaint_Box_proceed_click() {
		return L_repaint_Box_proceed_click;
	}
	public By getI_drag_Box() {
		return I_drag_Box;
	}
	public By getI_drop_Box() {
		return I_drop_Box;
	}
	public By getL_dragNdrop_proceed() {
		return L_dragNdrop_proceed;
	}
	public By getL_Popup_Window() {
		return L_Popup_Window;
	}
	public By getI_input_name() {
		return I_input_name;
	}
	public By getI_submit() {
		return I_submit;
	}
	public By getL_submit_name_proceed() {
		return L_submit_name_proceed;
	}
	public By getL_Generate_Token() {
		return L_Generate_Token;
	}
	public By getI_token() {
		return I_token;
	}
    
    
    
    
}
	