package di;

import exercises.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testDi(){
        DorcasWalk dorcasWalk = new DorcasWalk();
        Walk catWalk = new CatWalk();
        Human jummie = new Human(catWalk);
        jummie.walk();
        jummie.setWalkInPidgin(dorcasWalk);
        jummie.walk();
    }

    AbstractNonsense abstractNonsense = new AbstractNonsense(){
        @Override
        public void run() {
            System.out.println("I am running");
        }
    };
    AbstractNonsense second = new AbstractNonsense(){
        @Override
        public void run() {
            System.out.println("I am sleeping");
        }
    };
    AbstractNonsense third = new AbstractNonsense(){
    };
//    second.run();
}