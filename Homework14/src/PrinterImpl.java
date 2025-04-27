public class PrinterImpl implements Printer {

    @Override
    public void printMessage(String text, String sender) {

        if ((sender == null || sender.isEmpty()) && (text == null || text.isEmpty())) {
            // Anonymous class to handle empty messages
            Printer emptyMessageHandler = new Printer() {
                @Override
                public void printMessage(String text, String sender) {
                    System.out.println("Processing an empty message from an anonymous user...");
                }
            };
            emptyMessageHandler.printMessage(text, sender);
            return;
        }

        if (sender == null || sender.isEmpty()) {
            System.out.println("An anonymous user sent the message: " + text);
        } else {
            System.out.println("User " + sender + " sent the message: " + text);
        }
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

    }
}