package zdtestpol51bdd.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepsDefinitions {

    // Calculator- klasa - czyli jak powinien wyglądać obiekt
    // calculator - oviekt - stworzony za pomocą przepisu z klasy Calculator
    Calculator calculator;
    Integer result;


    @Given("I have calculator")
    public void i_have_calculator() {
        // utwórz nowy obiekt klasy Calculator

        //new Calculator - stworzony nowy obiekt Calculator
        calculator = new Calculator();

    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result =
        calculator.addTwoNumbers(int1, int2);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        Assert.assertEquals(result, int1);

    }

    @When("I add {int} and {int}")
    public void i_divide_and(Integer int1, Integer int2) {
                calculator.addDivideNumbers(int1, int2);
    }

}
