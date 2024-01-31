public class MainCopy {
    private int intValue;
    private String stringValue;

    public MainCopy() {
        intValue = 0;
        stringValue = "Default";
    }

    public MainCopy(MainCopy other) {
        intValue = other.intValue;
        stringValue = other.stringValue;
    }

    public static void main(String[] args) {
        MainCopy originalObject = new MainCopy();

        System.out.println("Original Object - IntValue: " + originalObject.intValue
                           + ", StringValue: " + originalObject.stringValue);

        MainCopy copiedObject = new MainCopy(originalObject);

        System.out.println("Copied Object - IntValue: " + copiedObject.intValue
                           + ", StringValue: " + copiedObject.stringValue);
    }
}
