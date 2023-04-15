package com.mre.sms.Services;
import com.mre.sms.Domains.Test;
import com.mre.sms.Repositories.TestRepositories;
import com.mre.sms.utils.AgeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TestServices {
    @Autowired
    private TestRepositories testRepositories;
  //  public Test createAccount(Test test) {

  //  }

    public Test registerTest(Test test) throws Exception {
        return testRepositories.save(test);
    }

    public Iterable<Test> getAllTests() {
        return testRepositories.findAll();
    }
}
