package service;

import dto.Response;
import entity.Client;

import lotto.service.UserInput;
import repository.ClientDatabase;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ClientService {

    private final ClientDatabase database;

    private final UserInput userInput = new UserInput();

    public ClientService(ClientDatabase database) {
        this.database = database;
    }

    public Supplier<Client> createClientSupplier() {
        return () -> {
            String clientName = userInput.uiText("Введите имя клиента");
            String descriptionName = userInput.uiText("Введите описание клиента");
            return new Client(clientName,descriptionName);
        };
    }

    public Client createClient(){
       Supplier<Client> clientSupplier = createClientSupplier();
       return clientSupplier.get();
    };

    public Response<Client> add(Client client){
        Client newClient = database.add(client);
        return new Response<>(newClient, "Ok");
    };

    public Response<Client> findById(int id){
        Optional<Client> clientOptional = database.findById(id);
        if (clientOptional.isPresent()) {
            return new Response<>(clientOptional.get(),"Ok");
        } else {
            return new Response<>(null, "Client not found");
        }
    };

    public Response<Client> findByName(String name){
        Optional<Client> clientOptional = database.findByName(name);
        return clientOptional.map(client -> new Response<>(client, "Ok")).orElseGet(() -> new Response<>(null, "Client not found"));
    };

    public Response<Boolean> update(Client client){
        boolean updateResult = database.update(client);
        if (updateResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Update unsuccessful");
        }
    };

    public Response<Boolean> delete(Client client){
        boolean updateResult = database.delete(client);
        if (updateResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Delete unsuccessful");
        }
    };


    public Response<List<Client>> findAll(){

        List<Client> findAllList = database.findAll();

        if (findAllList.isEmpty()) {
            return new Response<>(findAllList, "Database is empty");
        } else {
            return new Response<>(findAllList, "Ok");
        }
    }

}
