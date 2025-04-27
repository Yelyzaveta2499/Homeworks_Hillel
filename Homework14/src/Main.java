public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PrinterImpl.Message message = new PrinterImpl.Message("", "");
        PrinterImpl printer = new PrinterImpl();
        printer.printMessage(message.getText(), message.getSender());


        PrinterImpl.Message message2 = new PrinterImpl.Message("Hello World!", "John");
        PrinterImpl printer2 = new PrinterImpl();
        printer.printMessage(message2.getText(), message2.getSender());


    }
}