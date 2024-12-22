package je16_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateSample {
    public static void main(String[] args){
        LocalDate data = LocalDate.of(2021,8,23);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi","FI"),Locale.UK};

        for(Locale locale:locales){
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }

    }
}
