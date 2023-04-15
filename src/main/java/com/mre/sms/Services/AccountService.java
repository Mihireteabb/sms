package com.mre.sms.Services;

import com.mre.sms.Domains.Account;
import com.mre.sms.Repositories.AccountRepository;
import com.mre.sms.utils.AgeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountService {

    //YOU CANNOT DO THIS! AccountRepository accountRepository = new AccountRepository();
    @Autowired
    private AccountRepository accountRepository;

    public Account registerAccount(Account account) throws Exception {
        //validate if age >= 16

        Integer age = AgeCalculator.calculateDifference(account.getDateOfBirth(), LocalDate.now());

        if (age == null) {
            throw new Exception("Date of birth cannot be null");
        }

        if (age < 16) {
            throw new Exception("Sorry, you cannot create account with us. Comeback when you are 16 years old.");
        }

        return accountRepository.save(account);
    }

    public Iterable<Account> getAllAccounts() {
        //Business Logic comes here
        // E.g. removing pin from being displayed or returned, merging names, filtering ...
        return accountRepository.findAll();
    }

}
