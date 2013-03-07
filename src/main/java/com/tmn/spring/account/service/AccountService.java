/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmn.spring.account.service;

import com.tmn.spring.account.model.Account;
import java.util.List;

/**
 *
 * @author roofimon
 */
public interface AccountService {

    void createAccount(Account newAccount);

    Account getAccountByCode(String code);

    List<Account> getAllAccount();

    void removeAccount(String code);

    void updateAccount(Account targetAccount);
    
}
