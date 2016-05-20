public class StateContext {
    private Statelike myState;
        /**
         * Standard constructor
         */
    public StateContext() {
        setState(new StateA());
    }

        /**
         * Setter method for the state.
         * Normally only called by classes implementing the State interface.
         * @param NEW_STATE
         */
    public void setState(final Statelike NEW_STATE) {
        myState = NEW_STATE;
    }

        /**
         * Writer method
         * @param NAME
         */
    public void writeName(final String NAME) {
        myState.writeName(this, NAME);
    }
}
