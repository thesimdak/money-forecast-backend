package com.moneyforecast.resource;


import com.moneyforecast.model.Account;
import com.moneyforecast.model.Currency;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Component
public class AccountResource {

    @GET
    @Path("/accounts")
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1L, "BTV", 12323.38D, Currency.EUR));
        accounts.add(new Account(2L, "Hypo Tirol", 433.3D, Currency.EUR));
        return accounts;
    }

    @POST
    @Path("/account")
    public Account createAccount(Account account) {
        account.setId(99L);
        return account;
    }

    @PUT
    @Path("/account/{id}")
    public Account updateAccount(@PathParam("id") Long id, Account account) {
        return account;
    }

    @DELETE
    @Path("/account/{id}")
    public void updateAccount(@PathParam("id") Long id) {

    }

}
