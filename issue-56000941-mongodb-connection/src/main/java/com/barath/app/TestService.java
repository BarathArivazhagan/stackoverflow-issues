package com.barath.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Transactional
    public TestEntity save(long id, String name) {        
            TestEntity entity = new TestEntity();
            entity.setId(id);
            entity.setName(name);
            return testEntityRepository.save(entity);        
    }

}