class StateB implements Statelike {
    /** State counter */
    private int count = 0;

    /* (non-Javadoc)
     * @see state.Statelike#writeName(state.StateContext, java.lang.String)
     */
    @Override
    public void writeName(final StateContext STATE_CONTEXT, final String NAME) {
        System.out.println(NAME.toUpperCase());
        // Change state after StateB's writeName() gets invoked twice
        ++count;
        if (count > 1) {
            STATE_CONTEXT.setState(new StateA());
        }
    }
}
