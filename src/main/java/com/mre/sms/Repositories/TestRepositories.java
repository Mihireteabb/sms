package com.mre.sms.Repositories;

import com.mre.sms.Domains.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepositories extends CrudRepository<Test, Long> {
}
