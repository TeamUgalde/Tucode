import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.misc.IntervalSet;

//Class for custom errors.
class TucodeParserErrorStrategy extends DefaultErrorStrategy {

    // Overrides the reportNoViableAlternative method, changing the error message to spanish.
    @Override
    public void reportNoViableAlternative(Parser parser,
                                          NoViableAltException e)
            throws RecognitionException
    {
        String msg = "No hay alternativa para la entrada -> ${getTokenErrorDisplay(e.getOffendingToken())}"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }


    // Overrides the reportInputMismatch method, changing the error message to spanish.
    @Override
    public void reportInputMismatch(Parser recognizer,
                                       InputMismatchException e)
    {
        String msg = "La entrada -> ${getTokenErrorDisplay(e.getOffendingToken())} no coincide con lo esperado: "+
                " "+e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportUnwantedToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "Se encontró una entrada extraña -> "+tokenName+", lo esperado era:  "+
                expecting.toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(t, msg, null);
    }

    @Override
    public void reportFailedPredicate(Parser recognizer,
                                         FailedPredicateException e)
    {
        String ruleName = recognizer.getRuleNames()[recognizer._ctx.getRuleIndex()];
        String msg = "La regla "+ruleName+" no concuerda en la entrada -> "+getTokenErrorDisplay(e.getOffendingToken());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

}