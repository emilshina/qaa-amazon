package io.github.sskorol.pages;

import io.github.sskorol.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchAmazonPage extends BasePage {

    private final By inputSearch = By.cssSelector("#twotabsearchtextbox");
    private String xpathText;
    private final By linkFilter = By.xpath("//span[@class=\"a-size-small a-color-base\"]" +
            "[contains(.,\"" + xpathText + "\")]");
    private final By checkboxColor = By.xpath(".//a[contains(@title,'" + xpathText + "')]");

    @Step("Search for \"{text}\".")
    public SearchAmazonPage searchFor(final String text) {
        type(inputSearch, text + Keys.ENTER);
        return this;
    }

    public SearchAmazonPage filterByType(final String xpathText) {
        click(By.xpath("//span[@class=\"a-size-small a-color-base\"]" +
                "[contains(.,\"" + xpathText + "\")]"));
        return this;
    }

    public SearchAmazonPage filterByColor(final String xpathText) {
        click(By.xpath(".//a[contains(@title,\"" + xpathText + "\")]"));
        return this;
    }

    public SearchAmazonPage filterBySize(final String xpathText) {
        click(By.xpath(".//a[@class=\"a-link-normal\"][@title = \"" + xpathText + "\"]"));
        return this;
    }

    public SearchAmazonPage filterByBrand(final String xpathText) {
        click(By.xpath(".//span[@class=\"a-size-small a-color-base s-ref-text-link s-ref-link-cursor\"]" +
                "[contains(.,\"" + xpathText + "\")]"));
        return this;
    }
}
