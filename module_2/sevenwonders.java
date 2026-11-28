
class Wonder {

    // Parent class method
    void display() {
        System.out.println("Seven Wonders of the World");
    }

    public static void main(String[] args) {

        // Parent class reference
        Wonder obj;

        // Creating objects of child classes
        obj = new GreatWall();
        obj.display();

        obj = new Petra();
        obj.display();

        obj = new Colosseum();
        obj.display();

        obj = new ChichenItza();
        obj.display();

        obj = obj = new MachuPicchu();
        obj.display();

        obj = new TajMahal();
        obj.display();

        obj = new ChristRedeemer();
        obj.display();
    }
}

// Child class 1
class GreatWall extends Wonder {
    @Override
    void display() {
        System.out.println("Great Wall of China - China");
    }
}

// Child class 2
class Petra extends Wonder {
    @Override
    void display() {
        System.out.println("Petra - Jordan");
    }
}

// Child class 3
class Colosseum extends Wonder {
    @Override
    void display() {
        System.out.println("Colosseum - Rome, Italy");
    }
}

// Child class 4
class ChichenItza extends Wonder {
    @Override
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

// Child class 5
class MachuPicchu extends Wonder {
    @Override
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

// Child class 6
class TajMahal extends Wonder {
    @Override
    void display() {
        System.out.println("Taj Mahal - India");
    }
}

// Child class 7
class ChristRedeemer extends Wonder {
    @Override
    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}
