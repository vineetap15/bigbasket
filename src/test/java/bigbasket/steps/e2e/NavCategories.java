package bigbasket.steps.e2e;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bigbasket.pages.CategoriesList;
import bigbasket.pages.CategoryNav;
import bigbasket.utils.Util;
import bigbasket.utils.checkNavCategories;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavCategories extends Util {
    Util util = new Util();
    CategoryNav nav = new CategoryNav(driver);
    Actions action = new Actions(driver);
    CategoriesList categoryList = new CategoriesList();

    @Given("User is in home screen")
    public void user_is_in_home_screen() {

    }

    @When("User clicks on shop option")
    public void user_clicks_on_shop_option() {
        nav.shopByCategory.click();
    }

    @Then("User should view all the main categories")
    public void user_should_view_all_the_main_categories(List<String> list) {

        // ArrayList<String> mainCategoryName = list;
        categoryList.setMainCategoryList(nav);
        ArrayList<WebElement> m = categoryList.getMainCategoryList();
        new checkNavCategories(m, list);

    }

    @Then("User should view the corresponding list of First_Sub_Category under main_Category")
    public void user_should_view_the_corresponding_list_of_under_main_category(DataTable subcategory) {

        categoryList.setMainCategoryList(nav);
        ArrayList<WebElement> mainCategory = categoryList.getMainCategoryList();
        for (int i = 0; i < mainCategory.size(); i++) {
            System.out.println("Main Category---->" + mainCategory.get(i).getText());

            action.moveToElement(mainCategory.get(i)).build().perform();
            categoryList.setSubCategoryList(mainCategory.get(i), nav);
            ArrayList<WebElement> firstSubCategory = categoryList.getSubCategoryList();
            for (int j = 0; j < firstSubCategory.size(); j++) {
                System.out.println("first SubCategory---->" + firstSubCategory.get(j).getText());

                action.moveToElement(firstSubCategory.get(j)).build().perform();
                categoryList.setSubCategoryList(firstSubCategory.get(j), nav);
                ArrayList<WebElement> secondSubCategory = categoryList.getSubCategoryList();
                for (int t = 0; t < secondSubCategory.size(); t++) {
                    System.out.println("Second Sub Category---->" + secondSubCategory.get(t).getText());

                }

                new checkNavCategories(firstSubCategory.get(j), secondSubCategory, action);
            }
            new checkNavCategories(mainCategory.get(i), firstSubCategory, action);
        }

    }

}