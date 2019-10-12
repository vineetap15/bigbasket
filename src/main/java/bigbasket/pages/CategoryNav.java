package bigbasket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryNav {
    WebDriver driver;
    
    public CategoryNav(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public @FindBy(css = "li.dropdown.full-wid.hvr-drop")
    WebElement shopByCategory;

    //------------------Main Categories-------------------------------------------------
  
    public @FindBy(css = "div#navbar li[data-submenu-id*=fruits-vegetables]")
    WebElement fruitsAndVegetableCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=foodgrains-oil-masala]")
    WebElement foodgrainsOilAndMasalaCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=bakery-cakes-dairy]")
    WebElement bakeryCakesAndDairyCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=beverages]")
    WebElement beveragesCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=snacks-branded-foods]")
    WebElement snacksAndBrandedFoodsCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=beauty-hygiene]")
    WebElement beautyAndHygieneCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=cleaning-household]")
    WebElement cleaningAndHouseholdCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=kitchen-garden-pets]")
    WebElement kitchenGardenAndPetsCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=eggs-meat-fish]")
    WebElement eggsMeatAndFishCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=gourmet-world-food]")
    WebElement gourmetAndWorldFoodCategory;

    public @FindBy(css = "div#navbar li[data-submenu-id*=baby-care]")
    WebElement babyCareCategory;

    public @FindBy(css = "#navBarSticky a[href='/product/all-categories/")
    WebElement viewAll;

    //...........................Fruits And Vegetables sub categories.........................................

    public @FindBy(css = "mega-nav-template #fruits-vegetables  li a[ng-href*='/pc/fruits-vegetables/fresh-fruits/?nc=nb']")
    WebElement freshFruitsOption;

    public @FindBy(css = "mega-nav-template #fruits-vegetables  li a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/?nc=nb']")
    WebElement freshVegiesOption;

    public @FindBy(css = "mega-nav-template #fruits-vegetables  li a[ng-href*='/pc/fruits-vegetables/herbs-seasonings/?nc=nb']")
    WebElement herbsAndSeasoning;

    public @FindBy(css = "mega-nav-template #fruits-vegetables > div > div > div.col-md-3.pad-rt-0.desgn-fix > ul > li a[ng-href*='/pc/fruits-vegetables/cuts-sprouts/?nc=nb']")
    WebElement cutsAndSprouts;

    public @FindBy(css = "mega-nav-template #fruits-vegetables > div > div > div.col-md-3.pad-rt-0.desgn-fix > ul > li a[ng-href*='/pc/fruits-vegetables/exotic-fruits-veggies/?nc=nb']")
    WebElement exoticFruitsAndVegies;

    public @FindBy(css = "mega-nav-template #fruits-vegetables > div > div > div.col-md-3.pad-rt-0.desgn-fix > ul > li a[ng-href*='/pc/fruits-vegetables/organic-fruits-vegetables/?nc=nb']")
    WebElement organicFruitsAndVegies;

    public @FindBy(css = "mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/flower-bouquets-bunches/?nc=nb']")
    WebElement flowerBouquetsBunches;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/potato-onion-tomato/?nc=nb']")
    WebElement potatoOnionAndTomato;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/cucumber-capsicum/?nc=nb']")
    WebElement cucumberAndCapsicum;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/root-vegetables/?nc=nb']")
    WebElement rootVegetables;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/cabbage-cauliflower/?nc=nb']")
    WebElement cabbageAndCauliFlower;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/leafy-vegetables/?nc=nb']")
    WebElement leafyVegetables;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/beans-brinjals-okra/?nc=nb']")
    WebElement beansBrinjalsAndOkra;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/gourd-pumpkin-drumstick/?nc=nb']")
    WebElement gourdPumpkinDrumstick;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-vegetables/specialty/?nc=nb']")
    WebElement specialty;


    
    //---------------------------Fresh Vegetables sub sub categories----------------------------------------

    public @FindBy(css = "div#navbar li[data-submenu-id*=foodgrains-oil-masala]")
    WebElement foodGrainsOilCategory;

    public @FindBy(css ="mega-nav-template li[data-submenu-id*='kitchen-garden']")
    WebElement kitchenGardenCategory;

    //public @FindBy(css ="ul[aria-labelledby='dropdownMenu2']  li div div div div div div div.col-md-3.pad-rt-0.desgn-fix ul:nth-child(1) li:nth-child(6)")
    public @FindBy(css ="mega-nav-template #kitchen-garden-pets > div > div > div.col-md-3.pad-rt-0.desgn-fix > ul > li:nth-child(8) a:nth-child(1)")
    WebElement storageAndAccessoriesoption;

    //public @FindBy(css ="ul[aria-labelledby='dropdownMenu2']  li div div div div div div div.box ul:nth-child(1) li:nth-child(6)")
    public @FindBy(css="#kitchen-garden-pets > div > div > div.col-md-9.no-boxshadow.desgn-fix > div > div > div > div.col-md-4.col-sm-6.col-xs-12.pad-0.change-wid > div > ul > li:nth-child(6) > a")
    WebElement lunchBoxoption;

    
//-------------------------------Herbs and Seasonings sub sub category-----------------------------------
    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/herbs-seasonings/lemon-ginger-garlic/?nc=nb'")
    WebElement lemonGingerAndGarlic;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/herbs-seasonings/indian-exotic-herbs/?nc=nb'")
    WebElement indianAndExoticHerbs;

//--------------------------------Fresh Fruits-------------------------------------------------------------
    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/banana-sapota-papaya/?nc=nb'")
    WebElement bananaSapotaAndPapaya;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/apples-pomegranate/?nc=nb'")
    WebElement applesAndPomegranate;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/kiwi-melon-citrus-fruit/?nc=nb'")
    WebElement kiwiMelonCitrusFruit;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/seasonal-fruits/?nc=nb'")
    WebElement seasonalFruits;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/mangoes/?nc=nb'")
    WebElement mangoes;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/fresh-fruits/fruit-baskets/?nc=nb'")
    WebElement fruitBaskets;

//--------------------------------Cuts and Sprouts-------------------------------------------------------------

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/cuts-sprouts/cut-fruit-tender-coconut/?nc=nb'")
    WebElement cutFruitTenderCoconut;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/cuts-sprouts/cut-peeled-veggies/?nc=nb'")
    WebElement cutAndPeeledVeggies;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/cuts-sprouts/fresh-salads-sprouts/?nc=nb'")
    WebElement freshSaladsAndSprouts;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/cuts-sprouts/recipe-packs/?nc=nb'")
    WebElement recipePacks;

    //..............................Exotic Fruits & Veggies------------------------------------------------

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/exotic-fruits-veggies/exotic-vegetables/?nc=nb'")
    WebElement exoticVegetables;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/exotic-fruits-veggies/exotic-fruits/?nc=nb'")
    WebElement exoticFruits;

//----------------------------Organic Fruits & Vegetables---------------------------------------------

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/organic-fruits-vegetables/organic-vegetables/?nc=nb'")
    WebElement organicVegetables;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/organic-fruits-vegetables/organic-fruits/?nc=nb'")
    WebElement organicFruits;

//------------------------------Flower Bouquets,Bunches-------------------------------------------------

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/flower-bouquets-bunches/marigold/?nc=nb'")
    WebElement marigold;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/flower-bouquets-bunches/other-flowers/?nc=nb'")
    WebElement otherFlowers;

    public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*='/pc/fruits-vegetables/flower-bouquets-bunches/roses/?nc=nb'")
    WebElement roses;

    // public @FindBy(css="mega-nav-template #fruits-vegetables  a[ng-href*=''")
    // WebElement template;
    
//------------------------------Food Grains oils and Masala------------------------------------------------------------

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/atta-flours-sooji/?nc=nb'")
WebElement attaFloursAndSooji;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/rice-rice-products/?nc=nb'")
WebElement riceAndRiceProducts;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/dals-pulses/?nc=nb'")
WebElement dalsAndPulses;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/organic-staples/?nc=nb'")
WebElement organicStaples;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/salt-sugar-jaggery/?nc=nb'")
WebElement saltSugarAndJaggery;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/edible-oils-ghee/?nc=nb'")
WebElement edibleOilsAndGhee;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/masalas-spices/?nc=nb'")
WebElement masalasAndSpices;

public @FindBy(css="mega-nav-template #foodgrains-oil-masala  a[ng-href*='/pc/foodgrains-oil-masala/dry-fruits/?nc=nb'")
WebElement dryAndFruits;

//-----------------------------------Bakery, Cakes & Dairy----------------------------------------------
public @FindBy(css="mega-nav-template  #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/dairy/?nc=nb'")
WebElement dairy;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/breads-buns/?nc=nb'")
WebElement breadsAndBuns;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/cookies-rusk-khari/?nc=nb'")
WebElement cookiesRusksAndKhari;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/gourmet-breads/?nc=nb'")
WebElement GourmetBreads;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/bakery-snacks/?nc=nb'")
WebElement bakerySnacks;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/ice-creams-desserts/?nc=nb'")
WebElement iceCreamsAndDessert;

public @FindBy(css="mega-nav-template #bakery-cakes-dairy  a[ng-href*='/pc/bakery-cakes-dairy/cakes-pastries/?nc=nb'")
WebElement cakesAndPasteries;

//.........................................Beverages.................................................

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/water/?nc=nb'")
WebElement water;

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/health-drink-supplement/?nc=nb'")
WebElement healthDrinkSupplement;

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/tea/?nc=nb'")
WebElement tea;

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/energy-soft-drinks/?nc=nb'")
WebElement energyAndSoftDrink;

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/coffee/?nc=nb'")
WebElement coffee;

public @FindBy(css="mega-nav-template #beverages  a[ng-href*='/pc/beverages/fruit-juices-drinks/?nc=nb'")
WebElement fruitJuicesAndDrinks;

//----------------------------------------------Snack and Branded foods--------------------------------------------------------------

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/breakfast-cereals/?nc=nb'")
WebElement breakFastCereal;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/noodle-pasta-vermicelli/?nc=nb'")
WebElement noodlePastaVermicilli;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/biscuits-cookies/?nc=nb'")
WebElement buiscuitsAndCookies;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/frozen-veggies-snacks/?nc=nb'")
WebElement frozenVegiesSnacks;

public @FindBy(css="mega-nav-template #snacks-branded-foods a[ng-href*='/pc/snacks-branded-foods/snacks-namkeen/?nc=nb'")
WebElement snaksAndNamkeen;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/spreads-sauces-ketchup/?nc=nb'")
WebElement spreadsSaucesKetchup;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/ready-to-cook-eat/?nc=nb'")
WebElement readyToCookAndEat;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/chocolates-candies/?nc=nb'")
WebElement chocolatesAndCandies;

public @FindBy(css="mega-nav-template #snacks-branded-foods  a[ng-href*='/pc/snacks-branded-foods/pickles-chutney/?nc=nb'")
WebElement picklesAndChutney;

public @FindBy(css="mega-nav-template #snacks-branded-foods   a[ng-href*='/pc/snacks-branded-foods/indian-mithai/?nc=nb'")
WebElement indianMithai;


//------------------------------------Beauty And Hygiene------------------------------------------------

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/oral-care/?nc=nb'")
WebElement oralCare;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/feminine-hygiene/?nc=nb'")
WebElement feminineHygiene;

public @FindBy(css="mega-nav-template #beauty-hygiene a[ng-href*='/pc/beauty-hygiene/bath-hand-wash/?nc=nb'")
WebElement bathAndHandWash;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/hair-care/?nc=nb'")
WebElement hairCare;

public @FindBy(css="mega-nav-template #beauty-hygiene a[ng-href*='/pc/beauty-hygiene/health-medicine/?nc=nb'")
WebElement healthAndMedicine;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/mens-grooming/?nc=nb'")
WebElement mensGrooming;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/skin-care/?nc=nb'")
WebElement skinCare;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/makeup/?nc=nb']")
WebElement makeup;

public @FindBy(css="mega-nav-template #beauty-hygiene  a[ng-href*='/pc/beauty-hygiene/fragrances-deos/?nc=nb']")
WebElement fragrancesAndDeos;

}