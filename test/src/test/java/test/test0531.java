package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0531 {
	public static void main(String[] args) throws InterruptedException {
//      获取驱动路径
      String path="D:\\maven-3.0.5\\chromedriver.exe";
//      配置系统变量
      System.setProperty("webdriver.chrome.driver",path);
//      创建一个驱动对象
      WebDriver chromedriver=new ChromeDriver();
//      获取页面
      chromedriver.get("http://www.baidu.com");
      WebElement element = chromedriver.findElement(By.id("kw"));
      element.clear();
      element.sendKeys("java");
      element.submit();
	}
}
