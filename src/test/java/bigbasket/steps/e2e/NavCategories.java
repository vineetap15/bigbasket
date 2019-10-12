package bigbasket.steps.e2e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import bigbasket.pages.CategoryNav;
import bigbasket.utils.Util;
import bigbasket.utils.checkNavCategories;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavCategories extends Util {
    Util util = new Util();
    CategoryNav nav = new CategoryNav(driver);
    Actions action = new Actions(driver);

    @Given("User is in home screen")
    public void user_is_in_home_screen() {

    }

    @When("User clicks on shop option")
    public void user_clicks_on_shop_option() {
        nav.shopByCategory.click();
    }

    @Then("User should view all the main categories")
    public void user_should_view_all_the_main_categories(List<String> list) {
        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(nav.fruitsAndVegetableCategory);
        elements.add(nav.foodGrainsOilCategory);
        elements.add(nav.bakeryCakesAndDairyCategory);
        elements.add(nav.beveragesCategory);
        elements.add(nav.snacksAndBrandedFoodsCategory);
        elements.add(nav.beautyAndHygieneCategory);
        elements.add(nav.cleaningAndHouseholdCategory);
        elements.add(nav.kitchenGardenAndPetsCategory);
        elements.add(nav.eggsMeatAndFishCategory);
        elements.add(nav.gourmetAndWorldFoodCategory);

        new checkNavCategories(elements);

    }

    @Then("User should view the corresponding list of First_Sub_Category under main_Category")
    public void user_should_view_the_corresponding_list_of_under_main_category(DataTable subcategory) {
        
        List<WebElement> subCat = subcategory.asList(WebElement.class);
        //String[] li = subcategory.split(";");
        //List<String> list = Arrays.asList(li);
        
            // ArrayList<WebElement> elements1 = new ArrayList<WebElement>();
            // elements1.add(nav.freshVegiesOption);
            // elements1.add(nav.herbsAndSeasoning);
            // elements1.add(nav.freshFruitsOption);
            // elements1.add(nav.cutsAndSprouts);
            // elements1.add(nav.exoticFruitsAndVegies);
            // elements1.add(nav.organicFruitsAndVegies);
            // elements1.add(nav.flowerBouquetsBunches);
            new checkNavCategories(nav.fruitsAndVegetableCategory, subCat, action);

            // ArrayList<WebElement> elements2 = new ArrayList<WebElement>();
            // elements2.add(nav.attaFloursAndSooji);
            // elements2.add(nav.riceAndRiceProducts);
            // elements2.add(nav.dalsAndPulses);
            // elements2.add(nav.organicStaples);
            // elements2.add(nav.saltSugarAndJaggery);
            // elements2.add(nav.edibleOilsAndGhee);
            // elements2.add(nav.masalasAndSpices);
            // elements2.add(nav.dryAndFruits);
            // new checkNavCategories(nav.foodGrainsOilCategory, elements2, action);
        
            // ArrayList<WebElement> elements3 = new ArrayList<WebElement>();
            // elements3.add(nav.dairy);
            // elements3.add(nav.breadsAndBuns);
            // elements3.add(nav.cookiesRusksAndKhari);
            // elements3.add(nav.GourmetBreads);
            // elements3.add(nav.bakerySnacks);
            // elements3.add(nav.iceCreamsAndDessert);
            // elements3.add(nav.cakesAndPasteries);
            // new checkNavCategories(nav.bakeryCakesAndDairyCategory, elements3, action);
            

        
        // if (category.equals(nav.fruitsAndVegetableCategory.getText())) {
        //     action.moveToElement(nav.fruitsAndVegetableCategory).build().perform();
        //     System.out.println("main category--->" + category);
        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.freshVegiesOption.isDisplayed());
        //         Assert.assertTrue(nav.herbsAndSeasoning.isDisplayed());
        //         Assert.assertTrue(nav.freshFruitsOption.isDisplayed());
        //         Assert.assertTrue(nav.cutsAndSprouts.isDisplayed());
        //         Assert.assertTrue(nav.exoticFruitsAndVegies.isDisplayed());
        //         Assert.assertTrue(nav.organicFruitsAndVegies.isDisplayed());
        //         Assert.assertTrue(nav.flowerBouquetsBunches.isDisplayed());

        //     }
        // } else if (category.equals(nav.foodGrainsOilCategory.getText())) {
        //     action.moveToElement(nav.foodGrainsOilCategory).build().perform();
        //     System.out.println("main category--->" + category);

        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.attaFloursAndSooji.isDisplayed());
        //         Assert.assertTrue(nav.riceAndRiceProducts.isDisplayed());
        //         Assert.assertTrue(nav.dalsAndPulses.isDisplayed());
        //         Assert.assertTrue(nav.organicStaples.isDisplayed());
        //         Assert.assertTrue(nav.saltSugarAndJaggery.isDisplayed());
        //         Assert.assertTrue(nav.edibleOilsAndGhee.isDisplayed());
        //         Assert.assertTrue(nav.masalasAndSpices.isDisplayed());
        //         Assert.assertTrue(nav.dryAndFruits.isDisplayed());

        //     }
        // }

        // else if (category.equals(nav.bakeryCakesAndDairyCategory.getText())) {
        //     action.moveToElement(nav.bakeryCakesAndDairyCategory).build().perform();
        //     System.out.println("main category--->" + category);

        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.dairy.isDisplayed());
        //         Assert.assertTrue(nav.breadsAndBuns.isDisplayed());
        //         Assert.assertTrue(nav.cookiesRusksAndKhari.isDisplayed());
        //         Assert.assertTrue(nav.GourmetBreads.isDisplayed());
        //         Assert.assertTrue(nav.bakerySnacks.isDisplayed());
        //         Assert.assertTrue(nav.iceCreamsAndDessert.isDisplayed());
        //         Assert.assertTrue(nav.cakesAndPasteries.isDisplayed());

        //     }
        // }

        // else if (category.equals(nav.beveragesCategory.getText())) {
        //     action.moveToElement(nav.beveragesCategory).build().perform();
        //     System.out.println("main category--->" + category);

        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.water.isDisplayed());
        //         Assert.assertTrue(nav.healthDrinkSupplement.isDisplayed());
        //         Assert.assertTrue(nav.tea.isDisplayed());
        //         Assert.assertTrue(nav.energyAndSoftDrink.isDisplayed());
        //         Assert.assertTrue(nav.coffee.isDisplayed());
        //         Assert.assertTrue(nav.fruitJuicesAndDrinks.isDisplayed());

        //     }
        // }

        // else if (category.equals(nav.snacksAndBrandedFoodsCategory.getText())) {
        //     action.moveToElement(nav.snacksAndBrandedFoodsCategory).build().perform();
        //     System.out.println("main category--->" + category);

        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.breakFastCereal.isDisplayed());
        //         Assert.assertTrue(nav.noodlePastaVermicilli.isDisplayed());
        //         Assert.assertTrue(nav.buiscuitsAndCookies.isDisplayed());
        //         Assert.assertTrue(nav.frozenVegiesSnacks.isDisplayed());
        //         Assert.assertTrue(nav.snaksAndNamkeen.isDisplayed());
        //         Assert.assertTrue(nav.spreadsSaucesKetchup.isDisplayed());
        //         Assert.assertTrue(nav.readyToCookAndEat.isDisplayed());
        //         Assert.assertTrue(nav.chocolatesAndCandies.isDisplayed());
        //         Assert.assertTrue(nav.picklesAndChutney.isDisplayed());
        //         Assert.assertTrue(nav.indianMithai.isDisplayed());

        //     }
        // }

        // else if (category.equals(nav.beautyAndHygieneCategory.getText())) {
        //     System.out.println("main category--->" + category);

        //     action.moveToElement(nav.beautyAndHygieneCategory).build().perform();
        //     for (int i = 0; i < li.length; i++) {
        //         System.out.println("subcategory-----" + li[i]);
        //         Assert.assertTrue(nav.oralCare.isDisplayed());
        //         Assert.assertTrue(nav.feminineHygiene.isDisplayed());
        //         Assert.assertTrue(nav.bathAndHandWash.isDisplayed());
        //         Assert.assertTrue(nav.hairCare.isDisplayed());
        //         Assert.assertTrue(nav.healthAndMedicine.isDisplayed());
        //         Assert.assertTrue(nav.mensGrooming.isDisplayed());
        //         Assert.assertTrue(nav.skinCare.isDisplayed());
        //         Assert.assertTrue(nav.makeup.isDisplayed());
        //         Assert.assertTrue(nav.fragrancesAndDeos.isDisplayed());

        //     }
        // }

    }

    @When("User mousehover a main Category {string}")
    public void user_mousehover_a_main_Category(String category) {
        if (category.equals(nav.fruitsAndVegetableCategory.getText())) {
            action.moveToElement(nav.fruitsAndVegetableCategory).build().perform();
        } else if (category.equals(nav.foodGrainsOilCategory.getText())) {
            action.moveToElement(nav.foodGrainsOilCategory).build().perform();
        } else if (category.equals(nav.bakeryCakesAndDairyCategory.getText())) {
            action.moveToElement(nav.bakeryCakesAndDairyCategory).build().perform();
        } else if (category.equals(nav.beveragesCategory.getText())) {
            action.moveToElement(nav.beveragesCategory).build().perform();
        }

    }

    @Then("User mousehover a sub Category {string} and view its next level sub categories {string}")
    public void user_mousehover_a_sub_Category_and_view_its_next_level_sub_categories(String firstSubCat,
            String secondSubCat) {
        String[] li = secondSubCat.split(";");
        
        if (firstSubCat.equals(nav.freshVegiesOption.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.freshVegiesOption).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.potatoOnionAndTomato.isDisplayed());
                Assert.assertTrue(nav.cucumberAndCapsicum.isDisplayed());
                Assert.assertTrue(nav.rootVegetables.isDisplayed());
                Assert.assertTrue(nav.cabbageAndCauliFlower.isDisplayed());
                Assert.assertTrue(nav.leafyVegetables.isDisplayed());
                Assert.assertTrue(nav.beansBrinjalsAndOkra.isDisplayed());
                Assert.assertTrue(nav.gourdPumpkinDrumstick.isDisplayed());
                Assert.assertTrue(nav.specialty.isDisplayed());

            }
        } else if (firstSubCat.equals(nav.herbsAndSeasoning.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.herbsAndSeasoning).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.lemonGingerAndGarlic.isDisplayed());
                Assert.assertTrue(nav.indianAndExoticHerbs.isDisplayed());

            }
        } else if (firstSubCat.equals(nav.freshFruitsOption.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.freshFruitsOption).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.bananaSapotaAndPapaya.isDisplayed());
                Assert.assertTrue(nav.applesAndPomegranate.isDisplayed());
                Assert.assertTrue(nav.kiwiMelonCitrusFruit.isDisplayed());
                Assert.assertTrue(nav.seasonalFruits.isDisplayed());
                Assert.assertTrue(nav.mangoes.isDisplayed());
                Assert.assertTrue(nav.fruitBaskets.isDisplayed());

            }

        } else if (firstSubCat.equals(nav.cutsAndSprouts.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.cutsAndSprouts).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.cutFruitTenderCoconut.isDisplayed());
                Assert.assertTrue(nav.cutAndPeeledVeggies.isDisplayed());
                Assert.assertTrue(nav.freshSaladsAndSprouts.isDisplayed());
                Assert.assertTrue(nav.recipePacks.isDisplayed());

            }

        } else if (firstSubCat.equals(nav.exoticFruitsAndVegies.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.exoticFruitsAndVegies).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.exoticFruits.isDisplayed());
                Assert.assertTrue(nav.exoticFruitsAndVegies.isDisplayed());

            }

        } else if (firstSubCat.equals(nav.organicFruitsAndVegies.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.organicFruitsAndVegies).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.organicFruits.isDisplayed());
                Assert.assertTrue(nav.organicVegetables.isDisplayed());

            }

            System.out.println("nav.flowerBouquetsBunches.getText() -->"+nav.flowerBouquetsBunches.getText());
            System.out.println("sub category flowerBouquetsBunches--->" + firstSubCat);

        } else if (firstSubCat.equals(nav.flowerBouquetsBunches.getText())) {
            System.out.println("sub category--->" + firstSubCat);

            action.moveToElement(nav.flowerBouquetsBunches).build().perform();
            for (int i = 0; i < li.length; i++) {
                System.out.println("2nd level subcategory-----" + li[i]);
                Assert.assertTrue(nav.marigold.isDisplayed());
                Assert.assertTrue(nav.otherFlowers.isDisplayed());
                Assert.assertTrue(nav.roses.isDisplayed());

            }

        }
    }
}