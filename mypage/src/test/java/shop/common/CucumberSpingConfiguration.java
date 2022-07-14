package shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.MypageApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { MypageApplication.class })
public class CucumberSpingConfiguration {}
