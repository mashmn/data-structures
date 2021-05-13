package designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

public class NewLineFormatterTest {
    @Test
    public void testFormatTest() throws Exception{
        String testString = "Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}
