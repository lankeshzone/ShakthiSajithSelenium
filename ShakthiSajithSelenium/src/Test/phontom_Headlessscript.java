package Test;

public class phontom_Headlessscript
{
		public static void main(String[] args) {
        	        File file = new File("C:/Program Files/phantomjs-2.0.0-windows/bin/phantomjs.exe");				
                    System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
                    WebDriver driver = new PhantomJSDriver();	
                    driver.get("http://www.google.com");         
                    WebElement search= driver.findElement(By.name("q"));	
                    search.sendKeys("Test123");					
                    search.submit();         			
                    System.out.println("Page title is: " + driver.getTitle());		
                    driver.quit();			
           }		
}
}
