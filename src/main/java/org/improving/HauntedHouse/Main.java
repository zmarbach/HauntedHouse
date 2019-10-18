package org.improving.HauntedHouse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game g = spring.getBean(Game.class);
        g.run();
    }

}
