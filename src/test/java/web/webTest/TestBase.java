package web.webTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import web.pages.todoLy.*;
import web.pages.todoist.*;
import web.singletonSession.Session;

public class TestBase {

    //TODOLY

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();

    protected ProjectSection projectSection = new ProjectSection();

    protected CentralSection centralSection = new CentralSection();

    protected SettingsSection settingsSection = new SettingsSection();

    //TODOIST



    protected MainTodoistPage mainTodoistPage = new MainTodoistPage();
    protected LoginPage loginPage = new LoginPage();


    protected AddProjectPopUp addProjectPopUp = new AddProjectPopUp();

    protected LateralProjectSection lateralProjectSection = new LateralProjectSection();

    protected CentralProjectSection centralProjectSection = new CentralProjectSection();

    protected EditProjectPopUp editProjectPopUp = new EditProjectPopUp();


    @BeforeEach
    public void openBroswer() {
        Session.getSession().goTo("https://todo.ly/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getSession().closeBrowser();

    }

}
