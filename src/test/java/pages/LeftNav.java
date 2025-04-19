package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

public class LeftNav extends ReusableMethods {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // LeftNav ana kategoriler
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement search;

    @FindBy(xpath = "//nav[@class='mt-2']//li[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//nav[@class='mt-2']//li[2]")
    public WebElement catalog;

    @FindBy(xpath = "//nav[@class='mt-2']//li[3]")
    public WebElement sales;

    @FindBy(xpath = "//nav[@class='mt-2']//li[4]")
    public WebElement customers;

    @FindBy(xpath = "//nav[@class='mt-2']//li[5]")
    public WebElement promotions;

    @FindBy(xpath = "//nav[@class='mt-2']//li[6]")
    public WebElement contentManagement;

    @FindBy(xpath = "//nav[@class='mt-2']//li[7]")
    public WebElement configuration;

    @FindBy(xpath = "//nav[@class='mt-2']//li[8]")
    public WebElement system;

    @FindBy(xpath = "//nav[@class='mt-2']//li[9]")
    public WebElement reports;

    @FindBy(xpath = "//nav[@class='mt-2']//li[10]")
    public WebElement help;

    // Catalog altındakiler
    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//*[text()=' Categories']")
    public WebElement categories;

    @FindBy(xpath = "//*[text()=' Manufacturers']")
    public WebElement manufacturers;

    @FindBy(xpath = "//*[text()=' Product reviews']")
    public WebElement productRreviews;

    @FindBy(xpath = "//*[text()=' Product tags']")
    public WebElement productTags;

    @FindBy(xpath = "//nav[@class='mt-2']/ul/li[2]/ul/li[6]")
    public WebElement attributes;

    // Catalog -> Atributes altındakiler

    @FindBy(xpath = "//*[text()=' Product attributes']")
    public WebElement productAttributes;

    @FindBy(xpath = "//*[text()=' Specification attributes']")
    public WebElement specificationAttributes;

    @FindBy(xpath = "//*[text()=' Checkout attributes']")
    public WebElement checkoutAttributes;











    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "search" : return this.search;
            case "dashboard" : return this.dashboard;
            case "catalog" : return this.catalog;
            case "sales" : return this.sales;
            case "customers" : return this.customers;
            case "promotions" : return this.promotions;
            case "contentManagement" : return this.contentManagement;
            case "configuration" : return this.configuration;
            case "system" : return this.system;
            case "reports" : return this.reports;
            case "help" : return this.help;
            case "products" : return this.products;
            case "categories" : return this.categories;
            case "manufacturers" : return this.manufacturers;
            case "productRreviews" : return this.productRreviews;
            case "productTags" : return this.productTags;
            case "attributes" : return this.attributes;
            case "productAttributes" : return this.productAttributes;
            case "specificationAttributes" : return this.specificationAttributes;
            case "checkoutAttributes" : return this.checkoutAttributes;
        }
        return null;
    }





















}
