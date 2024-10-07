public class Main {
    public static void main(String[] args) throws Limit {
        Bank account = new Bank(15000);

        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом, текущий остаток: " + account.getAmount());
            } catch (Limit e) {
                System.out.println("Попытка снять больше, чем доступно. Остаток: " + e.getRemainingAmount());

                account.withDraw(e.getRemainingAmount());
                System.out.println("Снято " + e.getRemainingAmount() + " сом, текущий остаток: " + account.getAmount());
                break;
            }
        }
    }
}
