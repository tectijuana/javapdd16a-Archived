class StateA implements Statelike {
    /* (non-Javadoc)
     * @see state.Statelike#writeName(state.StateContext, java.lang.String)
     */
    @Override
    public void writeName(final StateContext STATE_CONTEXT, final String NAME) {
        System.out.println(NAME.toLowerCase());
        STATE_CONTEXT.setState(new StateB());
    }

}
