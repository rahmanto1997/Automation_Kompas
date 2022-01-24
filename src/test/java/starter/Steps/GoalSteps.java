package starter.Steps;

import starter.Pages.GoalPages;

public class GoalSteps {
    GoalPages gp;

    public void openHomePage(){
        gp.open();
    }
    public void openLoginPage(){
        gp.clickIconProfile();
        gp.clickTextButtonLogin();
    }
    public void inputEmailPassword(){
        gp.inputEmailPassword();
        gp.clickButtonLogin();
    }
    public void validateUser(){
        gp.clickTextButtonLanjutkan();
    }
    public void searchNews(){
        gp.inputFieldSearch();
        gp.clickIconSearch();
        gp.clickButtonTextNews();
    }
    public void validateSearch(){
        gp.validatePage();
    }
}
