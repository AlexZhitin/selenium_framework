package Common_pages;


import org.openqa.selenium.WebDriver;


import java.util.Random;

public class Utilities {
    protected WebDriver driver;

    public Utilities(WebDriver driver) {
        this.driver = driver;
    }

    public String StringRandomizer(int length) {


        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
                .toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomString = sb.toString();
        return randomString;
    }
}