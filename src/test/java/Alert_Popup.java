
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Alert_Popup {
                WebDriver driver;
                
                

                @Before
                public void setUp() {
                                driver=new ChromeDriver();
                                // Opened the application
                                driver.get("file:///E:/Software%20Testing/Tools/ak.html");
                                driver.manage().window().maximize();
                }

                
                @Test
                public void testWebAlert() throws InterruptedException {                          
                                // clicking on try it button
                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
                                Thread.sleep(5000);

                                // accepting javascript alert
                                Alert alert = driver.switchTo().alert();
                                alert.accept();

                                // clicking on try it button
                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
                                Thread.sleep(5000);

                                // accepting javascript alert
                                driver.switchTo().alert().dismiss();

                                // clicking on try it button
                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
                                Thread.sleep(5000);

                                // accepting javascript alert
                                System.out.println(driver.switchTo().alert().getText());
                                driver.switchTo().alert().accept();
                }

                

                @After
                public void tearDown() {             
                    driver.quit();
                }
} 