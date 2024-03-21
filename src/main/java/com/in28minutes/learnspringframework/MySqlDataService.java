package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[] {8, 8, 4, 3, 8, 4};
    }
}
