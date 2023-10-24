import utils.SymbolTable;

public class Main {
    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable(11);

        try {
            System.out.println(symbolTable.add("a"));
            System.out.println(symbolTable.add("b"));
            System.out.println(symbolTable.add("/str1/"));
            System.out.println(symbolTable.add("/str2/"));
            System.out.println(symbolTable.add("12"));

            System.out.println(symbolTable);

            System.out.println(symbolTable.contains("a"));
            System.out.println(symbolTable.contains("/str1/"));
            System.out.println(symbolTable.contains("12"));

            System.out.println(symbolTable.getPosition("12"));
            System.out.println(symbolTable.getPosition("/str2/"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}