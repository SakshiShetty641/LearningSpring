package com.in28minutes.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class MongoDBService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}
