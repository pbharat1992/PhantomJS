package com.phantomjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessPhantomJS {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//PhantomJsDriver internally uses ghost driver
		//ghostdriver--is used as JSON wire protocol--HTTP Rest calls
		//headless browser testing
		//testing is happening behind the scene
		//its very fast
		//it directly interacts with your app  HTML DOM
		System.setProperty("phantomjs.binary.path","D:\\selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();
		driver.get("https://www.freecrm.com/index.html");
		String title=driver.getTitle();
		System.out.println("title before login----"+title);
		driver.findElement(By.name("username")).sendKeys("pbharat1992");
		driver.findElement(By.name("password")).sendKeys("P@bharat3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("after login"+driver.getTitle());
	}
}