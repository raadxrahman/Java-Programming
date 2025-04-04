//extract from html

public class Task13 {

    public static String extractTransactionId(String html) {
        String searchString = "Transaction Id: ";
        int startIndex = html.indexOf(searchString) + searchString.length();
        int endIndex = html.indexOf("</p>", startIndex);

        if (startIndex != -1 && endIndex != -1) {
            return html.substring(startIndex, endIndex).trim();
        }
        return null;
    }

    public static void main(String[] args) {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        String transactionId = extractTransactionId(html);
        System.out.println("Transaction Id: " + transactionId);
    }
}