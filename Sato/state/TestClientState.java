public class TestClientState {
    public static void main(String[] args) {
        final StateContext SC = new StateContext();

        SC.writeName("Monday");
        SC.writeName("Tuesday");
        SC.writeName("Wednesday");
        SC.writeName("Thursday");
        SC.writeName("Friday");
        SC.writeName("Saturday");
        SC.writeName("Sunday");
    }
}
