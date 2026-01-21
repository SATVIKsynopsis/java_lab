interface Greeting {
    void sayHello();
}

class WelcomeGreeting implements Greeting {

    public void sayHello() {
        System.out.println("Hello and Welcome to our Java Programming Lab.");
    }
}

public class GreetingDemo {
    public static void main(String[] args) {

        Greeting g = new WelcomeGreeting();

        g.sayHello();
    }
}
