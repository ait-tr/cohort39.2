package shoppinglist;

import shoppinglist.repository.ProductRepository;
import shoppinglist.repository.ProductRepositoryArrayList;
import shoppinglist.service.ProductService;
import shoppinglist.service.Validation;
import shoppinglist.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
// создаем основные классы для работы сервиса

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);


        // создаем классы для формирования пунктов меню

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductMenu findAllProductMenu = new FindAllProductMenu(service);
        FindByIdProductMenu findByIdProductMenu = new FindByIdProductMenu(service);
        DeleteProductMenu deleteProductMenu = new DeleteProductMenu(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> menuCommands = new ArrayList<>();

        menuCommands.add(addProductMenu);
        menuCommands.add(findAllProductMenu);
        menuCommands.add(findByIdProductMenu);
        menuCommands.add(deleteProductMenu);
        menuCommands.add(exitMenu);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
