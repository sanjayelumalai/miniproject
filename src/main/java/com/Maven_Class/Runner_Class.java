package com.Maven_Class;



public class Runner_Class {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay kumar.E\\eclipse-workspace\\Selenium_1\\driver\\chromedriver.exe");

		 Webdriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();

		WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
		email.sendKeys("samjay4252@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
	Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		WebElement user = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		user.sendKeys("sanjay");

		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("kumar.E");

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Sanjay123");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1 = new Select(date);
		s1.selectByValue("17");

		WebElement months = driver.findElement(By.id("months"));
		Select mo = new Select(months);
		mo.selectByValue("2");
		
		WebElement years= driver.findElement(By.id("years"));
		Select ye = new Select(years);
		ye.selectByIndex(20);
		
		driver.findElement(By.xpath("(//div[@class='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanjay");
		
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar.E");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("ESR industry");
		
		driver.findElement(By.name("address1")).sendKeys("no:13 maruthupandiyan salai,");
        driver.findElement(By.name("address2")).sendKeys("kamarajapuram,velachery,");
        driver.findElement(By.id("city")).sendKeys("chennai");
        WebElement city = driver.findElement(By.id("id_state"));
		Select ci =new Select(city);
		ci.selectByIndex(32);
		driver.findElement(By.id("postcode")).sendKeys("10001");
		WebElement states = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select st =new Select(states);
		st.selectByVisibleText("United States");
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("its mine number 9080805691");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6382369043");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("9080805691");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("velachery.chennai");
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		
		

}
