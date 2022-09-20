package com.r42914lg.arkados.yatodo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepoFactory {

    InMemoryRepo testRepo = new InMemoryRepo();

    public <T> IRepo getRepo(Class<T> repoClass) {
        if (repoClass == InMemoryRepo.class) {
            return testRepo;
        } 
        throw new IllegalArgumentException("There is no class " + repoClass.getSimpleName() 
            + "in IRepo hierarchy");
    }
}
