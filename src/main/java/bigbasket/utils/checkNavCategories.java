package bigbasket.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class checkNavCategories {
    WebElement mainCategory=null;
    Map<String,WebElement> MaincategoryList;
    Map<String,WebElement> subCategoryList;

    public checkNavCategories(){

    }
   

    public checkNavCategories(ArrayList<WebElement> mainCategorieslocators,List<String> mainCategoryName){
        for(int i=0;i<mainCategorieslocators.size();i++){
            
            Assert.assertTrue(mainCategorieslocators.get(i).isDisplayed());
            Assert.assertEquals(mainCategorieslocators.get(i).getText(), mainCategoryName.get(i));
        }

    }

    public checkNavCategories(WebElement mainCategory,List<WebElement> subCategoryLists,Actions action){
        
        for(int i=0;i<subCategoryLists.size();i++){

            Assert.assertTrue(subCategoryLists.get(i).isDisplayed());

        }

    }
        
    
}

    

