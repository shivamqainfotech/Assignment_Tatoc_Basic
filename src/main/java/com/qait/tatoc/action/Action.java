package com.qait.tatoc.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qait.tatoc.specs.PageObjects;

public class Action {
	private WebDriver driver;
	private PageObjects pageObj = new PageObjects();

	public Action(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void click_basic_course() {
		driver.findElement(pageObj.getL_basic_course()).click();
	}

	public void click_on_green_box() {
		driver.findElement(pageObj.getC_green_box()).click();
	}

	public void multiple_clicks_on_repaint_box() {

		driver.switchTo().frame("main");
		String color_box_1 = driver.findElement(pageObj.getI_Box_1()).getAttribute("class");
		System.out.println(color_box_1);

		while (true) {

			driver.switchTo().frame("child");
			String color_box_3 = driver.findElement(pageObj.getI_Box_2()).getAttribute("class");
			System.out.println(color_box_3);

			if (color_box_3.equals(color_box_1)) {

				driver.switchTo().parentFrame();
				driver.findElement(pageObj.getL_repaint_Box_proceed_click()).click();
				break;
			} else {

				driver.switchTo().parentFrame();
				driver.findElement(pageObj.getL_Repaint_Box()).click();
			}

		}

	}

	public void perform_drag_n_drop() {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(driver.findElement(pageObj.getI_drag_Box()), driver.findElement(pageObj.getI_drop_Box()))
				.perform();
		driver.findElement(pageObj.getL_dragNdrop_proceed()).click();
	}

	public void launch_popUp_window(String name) {
		driver.findElement(pageObj.getL_Popup_Window()).click();
		WebElement ele = driver.findElement(pageObj.getI_input_name());
		ele.click();
		ele.sendKeys(name);
		ele.submit();
	}

}
