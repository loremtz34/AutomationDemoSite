package co.com.choucair.reto1.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Formulario extends PageObject {

	//nombre
	public static final Target NAME = Target.the("input where the name goes")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
	
	//apellido
	public static final Target LAST_NAME = Target.the("input where the last name goes")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input"));

	//address
	public static final Target ADDRESS = Target.the("input where the address goes")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));
	
	//email-address
	public static final Target EMAIL = Target.the("input where the email goes")
			.located(By.xpath("//*[@id=\'eid\']/input"));

	//phone
	public static final Target PHONE = Target.the("input where the phone goes")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input"));
	
	//gender
	public static final Target GENDER = Target.the("checkbox that determines gender")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input"));
	
	//hobbies
	public static final Target HOBBIES = Target.the("where the hobbie goes")
			.located(By.xpath("//*[@id=\'checkbox1\']"));
	
	//languages
	public static final Target LANGUAGES = Target.the("input where the language goes")
			.located(By.xpath("//*[@id=\'msdd\']"));
	
	//skills open
	public static final Target SKILLS_OPEN = Target.the("skills open")
			.located(By.xpath("//*[@id=\'Skills\']"));
	
	//skills select
	public static final Target SKILLS_C = Target.the("C++")
			.located(By.xpath("//*[@id=\'Skills\']/option[11]"));
	
	//country open
	public static final Target COUNTRY_OPEN = Target.the("country open")
			.located(By.xpath("//*[@id=\'countries\']"));
	
	//contry select
	public static final Target COUNTRY_COLOMBIA = Target.the("colombia")
			.located(By.xpath("//*[@id=\'countries\']/option[53]"));
	
	//select country open
	public static final Target SELECT_COUNTRY_OPEN = Target.the("select country opens")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[10]/div/span/span[1]/span"));
	
	//select country select
	public static final Target SELECT_COUNTRY_DENMARK = Target.the("denmark")
			.located(By.xpath("//*[@id=\'select2-country-results\']/li[4]"));
	
	//yearopen
	public static final Target YEAR_OPEN = Target.the("Year open")
			.located(By.xpath("//*[@id=\'yearbox\']"));
	
	//year select
	public static final Target YEAR_1996 = Target.the("SELECT 1996")
			.located(By.xpath("//*[@id=\'yearbox\']/option[82]"));
	
	//month open
	public static final Target MONTH_OPEN = Target.the("Month open")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[11]/div[2]/select"));
	
	//month select
	public static final Target MONTH_MAY = Target.the("SELECT MONTH")
			.located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[11]/div[2]/select/option[6]"));
	
	//day open
	public static final Target DAY_OPEN = Target.the("Day open")
			.located(By.xpath("//*[@id=\'daybox\']"));
	
	//day select
	public static final Target DAY_14 = Target.the("Select day")
			.located(By.xpath("//*[@id=\'daybox\']/option[15]"));
	
	//password
	public static final Target PASSWORD = Target.the("input where the password goes")
			.located(By.xpath("//*[@id=\'firstpassword\']"));
	
	//confirm password
	public static final Target CONFIRM_PASSWORD = Target.the("input where the confirmation of the firts password goes")
			.located(By.xpath("//*[@id=\'secondpassword\']"));
	
	//submit
	public static final Target BTNSUBMIT = Target.the("submit")
			.located(By.xpath("//*[@id=\'submitbtn\']"));

	//label a verificar
	public static final Target LBLVERIFICA = Target.the("the label al the end")
			.located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));

}
