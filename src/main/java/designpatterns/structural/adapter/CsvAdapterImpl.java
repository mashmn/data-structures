package designpatterns.structural.adapter;

public class CsvAdapterImpl implements TextFormattable{

    /**
     * Adaptee type CsvFormattable
     */
    CsvFormattable csvFormatter;

    /**
     *
     * @param csvFormatter - initialized csvFormatter in the parameterized constructor
     *                     Composition over inheritance
     */
    public CsvAdapterImpl (CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return csvFormatter.formatCsvText(text);
    }
}
