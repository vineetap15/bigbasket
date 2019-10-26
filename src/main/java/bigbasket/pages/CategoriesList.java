package bigbasket.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bigbasket.pages.CategoryNav;

public class CategoriesList {
    
    //CategoryNav nav = new CategoryNav();
    ArrayList<WebElement> categoryList=null; 
    ArrayList<WebElement> subCategoryList=null;

    public void setMainCategoryList(CategoryNav nav){
        categoryList= new ArrayList<WebElement>(); 
        categoryList.add(nav.fruitsAndVegetableCategory);
        categoryList.add(nav.foodGrainsOilCategory);
        categoryList.add(nav.bakeryCakesAndDairyCategory);
        categoryList.add(nav.beveragesCategory);
        categoryList.add(nav.snacksAndBrandedFoodsCategory);
        categoryList.add(nav.beautyAndHygieneCategory);
    }

    public ArrayList<WebElement> getMainCategoryList(){
        
        return categoryList;
    }

    public ArrayList<WebElement> getSubCategoryList(){
        // for(int i=0;i<subCategoryList.size();i++)
        // System.out.println("getSubCategoryList----->" +subCategoryList.get(i));
        return subCategoryList;
    }

    public void setSubCategoryList(WebElement mainCategory,CategoryNav nav){
        subCategoryList = new ArrayList<WebElement>();
               
                    if(mainCategory==(nav.fruitsAndVegetableCategory)){
                        
                        subCategoryList.add( nav.freshVegiesOption);
                        subCategoryList.add( nav.herbsAndSeasoning);
                        subCategoryList.add( nav.freshFruitsOption);
                        subCategoryList.add( nav.cutsAndSprouts);
                        subCategoryList.add( nav.exoticFruitsAndVegies);
                        subCategoryList.add( nav.organicFruitsAndVegies);
                        subCategoryList.add( nav.flowerBouquetsBunches);
                    }
                    else if(mainCategory==(nav.freshVegiesOption)){
                        subCategoryList.add( nav.potatoOnionAndTomato);
                        subCategoryList.add( nav.cucumberAndCapsicum);
                        subCategoryList.add( nav.rootVegetables);
                        subCategoryList.add( nav.cabbageAndCauliFlower);
                        subCategoryList.add( nav.leafyVegetables);
                        subCategoryList.add( nav.beansBrinjalsAndOkra);
                        subCategoryList.add( nav.gourdPumpkinDrumstick);
                        subCategoryList.add( nav.specialty);
                    }
                    else if(mainCategory==(nav.herbsAndSeasoning)){
                        subCategoryList.add( nav.lemonGingerAndGarlic);
                        subCategoryList.add( nav.indianAndExoticHerbs);
                        
                    }
                    else if(mainCategory==(nav.freshFruitsOption)){
                        subCategoryList.add( nav.bananaSapotaAndPapaya);
                        subCategoryList.add( nav.applesAndPomegranate);
                        subCategoryList.add( nav.kiwiMelonCitrusFruit);
                        subCategoryList.add( nav.seasonalFruits);
                        subCategoryList.add( nav.mangoes);
                        subCategoryList.add( nav.fruitBaskets);
                    }
                    else if(mainCategory==(nav.cutsAndSprouts)){
                        subCategoryList.add( nav.cutFruitTenderCoconut);
                        subCategoryList.add( nav.cutAndPeeledVeggies);
                        subCategoryList.add( nav.freshSaladsAndSprouts);
                        subCategoryList.add( nav.recipePacks);
        
                    }
                    else if(mainCategory==(nav.exoticFruitsAndVegies)){
                        subCategoryList.add( nav.exoticVegetables);
                        subCategoryList.add( nav.exoticFruits);
                
                    }
                    else if(mainCategory==(nav.organicFruitsAndVegies)){
                        subCategoryList.add( nav.organicVegetables);
                        subCategoryList.add( nav.organicFruits);
                        
                    }
                    else if(mainCategory==(nav.flowerBouquetsBunches)){
                        subCategoryList.add( nav.marigold);
                        subCategoryList.add( nav.otherFlowers);
                        subCategoryList.add( nav.roses);
                       
                    }
//---------------------------------------------------------------------------------------------                    
                    else if(mainCategory==nav.foodGrainsOilCategory){
                        subCategoryList.add( nav.attaFloursAndSooji);
                        subCategoryList.add( nav.riceAndRiceProducts);
                        subCategoryList.add( nav.dalsAndPulses);
                        subCategoryList.add( nav.organicStaples);
                        subCategoryList.add( nav.saltSugarAndJaggery);
                        subCategoryList.add( nav.edibleOilsAndGhee);
                        subCategoryList.add( nav.masalasAndSpices);
                        subCategoryList.add( nav.dryAndFruits);
                    }
                    else if(mainCategory==(nav.bakeryCakesAndDairyCategory)){
                        subCategoryList.add( nav.dairy);
                        subCategoryList.add( nav.breadsAndBuns);
                        subCategoryList.add( nav.cookiesRusksAndKhari);
                        subCategoryList.add( nav.GourmetBreads);
                        subCategoryList.add( nav.bakerySnacks);
                        subCategoryList.add( nav.iceCreamsAndDessert);
                        subCategoryList.add( nav.cakesAndPasteries);
                        
                    }
                    else if(mainCategory==(nav.beveragesCategory)){
                        subCategoryList.add( nav.water);
                        subCategoryList.add( nav.healthDrinkSupplement);
                        subCategoryList.add( nav.tea);
                        subCategoryList.add( nav.energyAndSoftDrink);
                        subCategoryList.add( nav.coffee);
                        subCategoryList.add( nav.fruitJuicesAndDrinks);
                        
                    }
                    else if(mainCategory==(nav.snacksAndBrandedFoodsCategory)){
                        subCategoryList.add(nav.noodlePastaVermicilli);
                        subCategoryList.add( nav.buiscuitsAndCookies);
                        subCategoryList.add( nav.frozenVegiesSnacks);
                        subCategoryList.add( nav.snaksAndNamkeen);
                        subCategoryList.add( nav.spreadsSaucesKetchup);
                        subCategoryList.add( nav.readyToCookAndEat);
                        subCategoryList.add( nav.chocolatesAndCandies);
                        subCategoryList.add( nav.picklesAndChutney);
                        subCategoryList.add( nav.indianMithai);
                    }
                    else if(mainCategory==(nav.beautyAndHygieneCategory)){
                        subCategoryList.add(nav.oralCare);
                        subCategoryList.add(nav.feminineHygiene);
                        subCategoryList.add(nav.bathAndHandWash);
                        subCategoryList.add(nav.hairCare);
                        subCategoryList.add(nav.healthAndMedicine);
                        subCategoryList.add(nav.mensGrooming);
                        subCategoryList.add(nav.skinCare);
                        subCategoryList.add(nav.makeup);
                        subCategoryList.add(nav.fragrancesAndDeos);
                    }
   

    }
    

}