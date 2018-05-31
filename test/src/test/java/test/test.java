package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class test {
	WebDriver chromedriver;
    @BeforeTest
    public void beforeClass() {
    	  String path="D:\\maven-3.0.5\\chromedriver.exe";
//        配置系统变量
        System.setProperty("webdriver.chrome.driver",path);
//        创建一个驱动对象
        chromedriver=new ChromeDriver();
//        获取页面
        chromedriver.get("http://www.baidu.com");
        
    }
    @Test
    public void TestNgLearn() {
    	WebElement element = chromedriver.findElement(By.id("kw"));
        element.clear();
        element.sendKeys("java");
        System.out.println("输入java");
        element.submit();
    }

    @AfterTest
    public void afterClass() {
        chromedriver.quit();
    }
}