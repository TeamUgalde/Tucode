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
        String msg = "No hay alternativa para la entrada -> ${filterTokenString(getTokenErrorDisplay(e.getOffendingToken()))} (no debería venir)"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e)
    }


    // Overrides the reportInputMismatch method, changing the error message to spanish.
    @Override
    public void reportInputMismatch(Parser recognizer,
                                       InputMismatchException e)
    {
        String msg = "La entrada -> ${filterTokenString(getTokenErrorDisplay(e.getOffendingToken()))} no coincide con lo esperado: "+
                " "+filterTokenString(e.getExpectedTokens().toString(recognizer.getVocabulary()))
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e)
    }

    @Override
    public void reportUnwantedToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken()
        String tokenName = getTokenErrorDisplay(t)
        IntervalSet expecting = getExpectedTokens(recognizer)
        String msg = "Se encontró una entrada extraña -> "+filterTokenString(tokenName)+", lo esperado era:  "+
                expecting.toString(recognizer.getVocabulary())
        recognizer.notifyErrorListeners(t, msg, null);
    }

    @Override
    public void reportFailedPredicate(Parser recognizer,
                                         FailedPredicateException e)
    {
        String ruleName = recognizer.getRuleNames()[recognizer._ctx.getRuleIndex()]
        String msg = "La regla "+ruleName+" no concuerda en la entrada -> "+filterTokenString(getTokenErrorDisplay(e.getOffendingToken()))
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e)
    }

    @Override
    public void reportMissingToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer)
        String msg = " Falta el token: "+filterTokenString(expecting.toString(recognizer.getVocabulary()))+
                " en "+filterTokenString(getTokenErrorDisplay(t))

        recognizer.notifyErrorListeners(t, msg, null)
    }

    public filterTokenString(String token) {
        String res = token
        if(token.equals("\n")) res = "\\n"
        else if(token.equals("'\n'")) res = "'\\n'"
        return res
    }

}