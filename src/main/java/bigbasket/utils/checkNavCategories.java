package bigbasket.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class checkNavCategories {
    String mainCategory=null;
    ArrayList<WebElement> MaincategoryList;
    Map<String,WebElement> subCategoryList;
    

    public checkNavCategories(ArrayList<WebElement> mainCategorieslocators){
        for(int i=0;i<mainCategorieslocators.size();i++){
            System.out.println("category-->" +mainCategorieslocators.get(i).getText());
            Assert.assertTrue(mainCategorieslocators.get(i).isDisplayed());
        }

    }

    public checkNavCategories(WebElement mainCategory,List<WebElement> subCategoryLists,Actions action){
        action.moveToElement(mainCategory).build().perform();
        System.out.println("category-->" +mainCategory.getText());

        for(int i=0;i<subCategoryLists.size();i++){
            System.out.println("sub category-->" +subCategoryLists.get(i).getText());
            Assert.assertTrue(subCategoryLists.get(i).isDisplayed());

        }

    }
        
    
}

    

