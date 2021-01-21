package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumberreports",
                "json:target/jsonReports/cucumber-report.json"
        },
        features = "src/test/resources/features",
        glue = "stepDefinations",
        //tags = "@DeletePlace",
        dryRun = false
)

public class Runner {
        public static void main(String[] args) {


                // hih  oihioihoihio
        }
}
//This is how to run on terminal/commandline: mvn test --> compile and run all
//or specific tag:  mvn test -Dcucumber.options="--tags @AddPlace"

//jenkins is not a tool, it needs to run on server, in this case I down loaded on local machine
//in terminal use this command: java -jar jenkins.war -httpPort=9090
//why 9090, I have other things running on 8080, I don't wanna disturb them
