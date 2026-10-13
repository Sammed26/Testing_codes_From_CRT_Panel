import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.LinkText("//div[@id='pnProductNavContents']/h5[2]")).click();
		
		/*
		 
		 <table>
		 	<thead>
		 		<tr>
		 			<th>.......</th>
		 			<th>.......</th>
		 			.
		 			.
		 		</tr>
		 	</thead>
		 	<tbody>
		 		<tr>
		 			<td>.......</td>
		 			<td>.......</td>
		 			.
		 		</tr>
		 		<tr>
		 			<td>.......</td>
		 			<td>.......</td>
		 			.
		 		</tr>
		 		.
		 		.
		 	</tbody>
		 </table>
		 */
		
		
		int rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr[1]/td")).size();
		
		for(int col = 1; col<=cols; col++)
		{
			String heading = driver.findElement(By.xpath("//table[@class='table table-striped']/thead/tr/th[" + col + "]")).getText();
			System.out.print(heading + "   ");
		}
		
		System.out.println();
		
		for(int row = 1; row <= rows; row++)
		{
			for(int col = 1; col<=cols; col++)
			{
				String cellval = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + row + "]/td[" + col +"]")).getText();
				System.out.print(cellval + "   ");
			}
			System.out.println();
		}
		
		
	}
	
}
