package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField {

    WebDriver driver;
    String label;
    String inputXpath = "//article[contains(., 'New Account')]//label[contains(., '%s')]/following-sibling::input";
    String inputXpathTextArea = "//article[contains(., 'New Account')]//label[contains(., '%s')]/following-sibling::textarea";

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void inputText(String text) {
        inputXpath = String.format(inputXpath, label);
        driver.findElement(By.xpath(inputXpath)).sendKeys(text);
    }

    public void inputTextIntoTextField(String text){
        inputXpathTextArea = String.format(inputXpathTextArea, label);
        driver.findElement(By.xpath(inputXpathTextArea)).sendKeys(text);
    }
}

