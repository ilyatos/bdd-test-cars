package cars.forms;

import framework.element.Button;
import org.openqa.selenium.By;

public class ResearchPage {
    private Button lblSideBySide = new Button(By.xpath("//a[@class = 'comparisons-button']"));

    public void navigateSideBySideComp() {
        lblSideBySide.click();
    }
}