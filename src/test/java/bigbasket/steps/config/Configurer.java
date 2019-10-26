// package bigbasket.steps.config;

// import java.util.List;
// import java.util.Locale;
// import java.util.Map;

// import org.openqa.selenium.WebElement;

// import io.cucumber.core.api.TypeRegistry;
// import io.cucumber.core.api.TypeRegistryConfigurer;
// import io.cucumber.datatable.DataTableType;
// import io.cucumber.datatable.TableEntryTransformer;
// import io.cucumber.datatable.TableRowTransformer;

// public class Configurer implements TypeRegistryConfigurer {

//     @Override
//     public void configureTypeRegistry(TypeRegistry registry) {

//         registry.defineDataTableType(new DataTableType(WebElement.class, new TableRowTransformer<WebElement>() {

//             @Override
//             public WebElement transform(List<String> entry) throws Throwable {
//                for(int i=0;i< entry.size();i++) {
//                         return  WebElement entry.get(i);
//                }
//             }
//                 }));
//             }

//             @Override
//             public Locale locale() {
//                 return Locale.ENGLISH;
//             }

//         }