package designpatterns.structural.adapter;

/**
 * Adapter Pattern - a set of patterns whose objective is to identify how to realize relationships between classes and
 * objects in a simple way. This pattern is typically used when an incompatible module needs to be integrated with an
 * existing module without making any source code modifications.
 *
 * NewLineFormatter needs to support CSV formatting - CsvFormatter implementation class
 *
 * Without violating SOLID, Single Responsibility principle and Interface Segregation Principle.
 *
 * Object adapter - relies on composition
 * Class adapter - relies on inheritance
 *
 * Since Java does not support multiple inheritance use object adapter when there are multiple classes that the adapter
 * needs to address. Favor Composition over inheritance.
 *
 * Target - TextFormattable
 * Adaptee - CsvFormattable
 * Adapter - CsvAdpaterImpl
 */
public class NewLineFormatter implements TextFormattable {

    @Override
    public String formatText(String text) {
        String formattedText = text.replace(".","\n");
        return formattedText;
    }
}
