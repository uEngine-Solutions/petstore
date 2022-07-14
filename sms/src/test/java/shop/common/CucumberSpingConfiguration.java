package shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.SmsApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SmsApplication.class })
public class CucumberSpingConfiguration {}
