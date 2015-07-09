package skeleton;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^У меня (\\d+) огурцов в животе$")
    public void У_меня_огурцы_в_животе(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
}
