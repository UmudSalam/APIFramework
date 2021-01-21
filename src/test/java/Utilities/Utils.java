package Utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {

    public static RequestSpecification req;
    //when you declare your varible static
    //then your varible is shared accrose all your test cases in that particular execution
    //Making variable static, will make it available for further tests as well
    //if not, after first test run, from the further tests, the variable became null otherwise

    public RequestSpecification requestSpecification() throws IOException

    {
        //To prevent creating this same file multiples times, during the same test run, we set if statement
        if(req == null) {

            //To create a file in java in runtime, there is a class called FileOutputStream
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));

            req = new RequestSpecBuilder().setBaseUri(getGlobleValue("baseUrl")).addQueryParam("key", "qaclick123")
                    //Using addFilter method and RequestLoggingFilter.logRequestTo(log) methods
                    //We can put all our test run console into log and therefore into logging.txt
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();

            return req;
        }

        return req;
    }

    public static String getGlobleValue(String key) throws IOException {
        //Properties class in java can hold globle variables for us
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("globle.properties");
        prop.load(fis);

       return prop.getProperty(key);

    }

    //if you want to know any key value in Json, you just need to call this method, that's all!
    public String getJsonPath(Response response, String key)
    {
        String resp = response.asString();
        JsonPath js = new JsonPath(resp);
        return js.get(key).toString();
    }

}
