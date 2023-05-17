package HomeworksSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1HomeW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Aya");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sai");
        driver.findElement(By.id("customer.address.street")).sendKeys("55th street");
        driver.findElement(By.name("customer.address.city")).sendKeys("New york");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("10859");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("914-856-9726");
        driver.findElement(By.name("customer.ssn")).sendKeys("203-568-5996");
        driver.findElement(By.id("customer.username")).sendKeys("red_scarf");
        driver.findElement(By.name("customer.password")).sendKeys("qwert123");
        driver.findElement(By.name("repeatedPassword")).sendKeys("qwert123");

        String url= driver.getCurrentUrl();
        System.out.println("URL for this webpage" +url);
        String title=driver.getTitle();
        System.out.println("Title for this webpage " + title);

        Thread.sleep(2000);
        driver.close();
    }
}
