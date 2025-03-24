package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }

        Timer tm1 = applicationContext.getBean(Timer.class);
        Timer tm2 = applicationContext.getBean(Timer.class);
        System.out.println("Сравнение: " + (tm1.getTime() == tm2.getTime()));
    }
}
