package techstyle.techweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailCount {

			public static void main(String[] args)
			{
				// Launch site
				System.setProperty("webdriver.chrome.driver", "C:\\seljava\\chromedriver.exe");
				WebDriver d=new ChromeDriver();
				d.get("https://gmail.com");
				d.findElement(By.name("identifier")).sendKeys("shylajaammasani@gmail.com");
				d.findElement(By.xpath("//*[text()='Next']")).click();
				WebDriverWait wait=new WebDriverWait(d,100);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
				
				d.findElement(By.name("password")).sendKeys("Sudhesh1027");
				d.findElement(By.xpath("//*[text()='Next']")).click();
				
				//d.findElement(By.xpath("(//table)[4]/tbody/tr[8]/td[2]")).click();
				//d.findElement(By.xpath("//div[contains(@class, 'G-tF')]/div[2]/div[3]/div")).click();
				
				
				
				}
				
				

			}

		}

	}

}
