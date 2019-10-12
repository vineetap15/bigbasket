@Nav
Feature: Verify the presence of Menus and corresponding sub-Menus in the home page

Background:
Given User is in home screen
When User clicks on shop option

@checkMainCategories
Scenario:
    
    Then User should view all the main categories
    |Fruits & Vegetables|
    |Foodgrains, Oil & Masala|
    |Bakery, Cakes & Dairy|
    |Beverages|
    |Snacks & Branded Foods|
    |Beauty & Hygiene|
    |Cleaning & Household|
    |Kitchen, Garden & Pets|
    |Eggs, Meat & Fish|
    |Gourmet & World Food|
    |Baby Care|
    |View All|
 
@checkPresenceOfSubCategories
Scenario:
	Then User should view the corresponding list of First_Sub_Category under main_Category
    |freshVegiesOption|
    |herbsAndSeasoning|
    |freshFruitsOption|
    |cutsAndSprouts|
    |exoticFruitsAndVegies|
    |organicFruitsAndVegies|
    |flowerBouquetsBunches|

    

    #  Examples: 
    #  |main_Category				|First_Sub_Category|		
    # #|Fruits & Vegetables		|herbsAndSeasoning|	
	# #  |Foodgrains, Oil & Masala	|Atta,Flours & Sooji;Rice & Rice Products;Dals & Pulses;Organic Staples;Salt,Sugar & Jaggery;Edible Oils & Ghee;Masalas & Spices;Dry Fruits|
	# #  |Bakery, Cakes & Dairy		|Dairy;Breads & Buns;Cookies, Rusk & Khari;Gourmet Breads;Bakery Snacks;Ice Creams & Desserts;Cakes & Pastries|
    # #  |Beverages                  |Water;Health Drink, Supplement;Tea;Energy & Soft Drinks;Coffee;Fruit Juices & Drinks|
    # #  |Snacks & Branded Foods     |Breakfast Cereals;Noodle, Pasta, Vermicelli;Biscuits & Cookies;Frozen Veggies & Snacks;Snacks & Namkeen;Spreads, Sauces, Ketchup;Ready To Cook & Eat;Chocolates & Candies;Pickles & Chutney;Indian Mithai|
    # #  |Beauty & Hygiene           |Oral Care;Feminine Hygiene;Bath & Hand Wash;Hair Care;Health & Medicine;Men's Grooming;Skin Care;Makeup;Fragrances & Deos|
    


@checkPresenceOf2ndLevelSubCategories
Scenario Outline:
    When User mousehover a main Category "<main_Category>"
    Then User mousehover a sub Category "<First_Sub_Category>" and view its next level sub categories "<Second_Sub_Category>"

    Examples: 
    |main_Category				|First_Sub_Category|Second_Sub_Category		|
    |Fruits & Vegetables		|Fresh Vegetables|Potato, Onion & Tomato;Cucumber & Capsicum;Root Vegetables;Cabbage & Cauliflower;Leafy Vegetables;Beans, Brinjals & Okra;Gourd, Pumpkin, Drumstick;Specialty|
    |Fruits & Vegetables		|Herbs & Seasonings|Lemon, Ginger & Garlic;Indian & Exotic Herbs|
    |Fruits & Vegetables		|Fresh Fruits|Banana, Sapota & Papaya;Apples & Pomegranate;Kiwi, Melon, Citrus Fruit;Seasonal Fruits;Mangoes;Fruit Baskets|
    |Fruits & Vegetables		|Cuts & Sprouts|Cut Fruit, Tender Coconut;Cut & Peeled Veggies;Fresh Salads & Sprouts;Recipe Packs|
    |Fruits & Vegetables		|Exotic Fruits & Veggies|Exotic Vegetables;Exotic Fruits|
    |Fruits & Vegetables		|Organic Fruits & Vegetables|Organic Vegetables;Organic Fruits|
    |Fruits & Vegetables		|Flower Bouquets, Bunches|Marigold;Other Flowers;Roses|
    # |Foodgrains, Oil & Masala	|Atta,Flours & Sooji|Atta Whole Wheat;Sooji, Maida & Besan;Rice & Other Flours|
    # |Foodgrains, Oil & Masala	|Rice & Rice Products|Raw Rice;Poha, Sabudana & Murmura;Basmati Rice;Boiled & Steam Rice|	
	# |Foodgrains, Oil & Masala	|Dals & Pulses|Toor, Channa & Moong Dal;Cereals & Millets;Urad & Other Dals|
    # |Foodgrains, Oil & Masala	|Organic Staples|Organic Dals & Pulses;Organic Sugar, Jaggery;Organic Dry Fruits;Organic Flours;Organic Rice, Other Rice;Organic Edible Oil, Ghee;Organic Masalas & Spices|
    # |Foodgrains, Oil & Masala	|Salt,Sugar & Jaggery|Sugar & Jaggery;Salts;Sugarfree Sweeteners|
    # |Foodgrains, Oil & Masala	|Edible Oils & Ghee|Blended Cooking Oils;Sunflower, Rice Bran Oil;Soya & Mustard Oils;Ghee & Vanaspati;Gingelly Oil;Other Edible Oils;Olive & Canola Oils;Gingelly, Groundnut Oils|
    # |Foodgrains, Oil & Masala	|Masalas & Spices|Whole Spices;Powdered Spices;Cooking Pastes;Herbs & Seasoning;Blended Masalas|
    # |Foodgrains, Oil & Masala	|Dry Fruits|Almonds;Raisins;Cashews;Other Dry Fruits;Mukhwas|
    # |Bakery, Cakes & Dairy	    |Dairy|Paneer, Tofu & Cream;Milk;Butter & Margarine;Curd;Buttermilk & Lassi;Condensed, Powdered Milk;Cheese;Flavoured, Soya Milk;Yogurt & Shrikhand|
    # |Bakery, Cakes & Dairy	    |Breads & Buns|Brown, Wheat & Multigrain;Milk, White & Sandwich;Buns, Pavs & Pizza Base|
    # |Bakery, Cakes & Dairy	    |Cookies, Rusk & Khari|Khari & Cream Rolls;Rusks;Premium Cookies;Bakery Biscuits, Cookies|
    # |Bakery, Cakes & Dairy	    |Gourmet Breads|Croissants, Bagels;Gourmet Bread;Panini, Focaccia & Pita;Bagels & Baguette|
    # |Bakery, Cakes & Dairy	    |Bakery Snacks|Bread Sticks & Lavash;Cheese & Garlic Bread;Puffs, Patties, Sandwiches;Organic & Free From|
    # |Bakery, Cakes & Dairy	    |Ice Creams & Desserts|Ice Creams|
    # |Bakery, Cakes & Dairy	    |Cakes & Pastries|Tea Cakes & Slice Cakes;Muffins & Cup Cakes;Pastries & Brownies;Doughnuts & Mousses;Birthday & Party Cakes|
    # |Beverages          	    |Water||
    # |Beverages          	    |Health Drink, Supplement||
    # |Beverages          	    |Tea||
    # |Beverages          	    |Energy & Soft Drinks||
    # |Beverages          	    |Coffee||
    # |Beverages          	    |Fruit Juices & Drinks||
    # |Snacks & Branded Foods	    |Breakfast Cereals||
    # |Snacks & Branded Foods	    |Noodle, Pasta, Vermicelli||
    # |Snacks & Branded Foods	    |Biscuits & Cookies||
    # |Snacks & Branded Foods	    |Frozen Veggies & Snacks||
    # |Snacks & Branded Foods	    |Snacks & Namkeen||
    # |Snacks & Branded Foods	    |Spreads, Sauces, Ketchup||
    # |Snacks & Branded Foods	    |Ready To Cook & Eat||
    # |Snacks & Branded Foods	    |Chocolates & Candies||
    # |Snacks & Branded Foods	    |Pickles & Chutney||
    # |Snacks & Branded Foods	    |Indian Mithai||
    # |Beauty & Hygiene   	    |Oral Care||
    # |Beauty & Hygiene   	    |Feminine Hygiene||
    # |Beauty & Hygiene   	    |Bath & Hand Wash||
    # |Beauty & Hygiene   	    |Hair Care||
    # |Beauty & Hygiene   	    |Health & Medicine||
    # |Beauty & Hygiene   	    |Men's Grooming||
    # |Beauty & Hygiene   	    |Skin Care||
    # |Beauty & Hygiene   	    |Makeup||
    # |Beauty & Hygiene           |Fragrances & Deos||

