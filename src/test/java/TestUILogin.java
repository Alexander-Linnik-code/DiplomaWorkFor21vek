import by.it.academy.linnik.Singleton.Singleton;
import by.it.academy.linnik.UI.CatalogPage;
import by.it.academy.linnik.UI.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUILogin {
    @Test
    @DisplayName("Attempt to log into your personal account")
    public void Test1() {
        String actual = new LoginPage()
                .loginToYourPersonalAccount("eemk1Q@gmail.com", "ehet284")
                .takeTextOfTheIncorrectAccountLogin();
        Assertions.assertEquals("Проверьте электронную почту или \n" +
                "зарегистрируйтесь", actual);
        Singleton.quit();
    }

    @Test
    @DisplayName("Search for a product via the search bar and remove it from the cart")
    public void Test2() {
        String actual = new CatalogPage()
                .useTheSearchBarToAddToCartAndRemove("Apple").getTextTitle();
        Assertions.assertEquals("Корзина пуста",actual);
        Singleton.quit();
    }
}
