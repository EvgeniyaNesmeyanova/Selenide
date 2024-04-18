package ru.netology.selenide;

import org.junit.jupiter.api.Test;
import com.codeborne.selenid.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class selenideTest {

    private String generateDate(long addDays, String pattern){
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }

    @Test
    public void shouldCompleted() {

        open("http://localhost:9999");
        $(cssSelector("[data-test-id='sity'] input")).setValue("Рязань");
    }
}
