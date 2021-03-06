import org.antlr.v4.runtime.*;

//Class for custom errors.
class TucodeErrorListener extends BaseErrorListener {

    // Overrides the syntaxError method, changing the error message to spanish.
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        char invalidChar = msg.charAt(msg.length()-2)
        System.err.println("Error léxico en la línea: "+line+", Columna: "+charPositionInLine+". Símbolo inválido:  "+
                "'"+invalidChar+"'")
    }
}