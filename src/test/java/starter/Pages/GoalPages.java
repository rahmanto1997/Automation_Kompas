package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class GoalPages extends PageObject {
    //Click Icon Profile
    @FindBy(xpath = "//ul[@class='sso__wrap']")
    WebElement iconProfile;
    public void clickIconProfile(){
        iconProfile.click();
    }
    //CLick Text Button Login
    @FindBy(id = "txt_signin")
    WebElement textButtonLogin;
    public void clickTextButtonLogin(){
        textButtonLogin.click();
    }
    //Input Email dan Password
    @FindBy(id = "email")
    WebElement fieldEmail;
    @FindBy (id = "password")
    WebElement fieldPassword;
    public void inputEmailPassword(){
        fieldEmail.sendKeys("hassimikopla@gmail.com");
        fieldPassword.sendKeys("ZXcv1234");
    }
    //Click Button Login
    @FindBy(xpath = "//input[@value='Login']")
    WebElement buttonLogin;
    public void clickButtonLogin(){
        buttonLogin.click();
    }
    //Click Button Text Lanjutkan
    @FindBy(xpath = "/html/body/div/div[2]/div/p/a")
    WebElement textButtonLanjutkan;
    public void clickTextButtonLanjutkan(){
        textButtonLanjutkan.click();
    }
    //Input Search for News
    @FindBy(id = "search")
    WebElement fieldSearch;
    public void inputFieldSearch(){
        fieldSearch.sendKeys("cristiano ronaldo");
    }
    //Click Icon Search
    @FindBy(xpath = "//input[@name='submit']")
    WebElement iconSearch;
    public void clickIconSearch(){
        iconSearch.click();
    }
    //Click news that appears 2
    @FindBy(xpath = "//body/div/div/div/div/div/div/div[@dir='ltr']/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]")
    WebElement textButtonNews;
    public void clickButtonTextNews(){
        textButtonNews.click();
    }
    @FindBy(xpath = "//div[@class='comment__read__text']")
    WebElementFacade komentar;
    public void validatePage(){
        komentar.shouldBePresent();
    }
}