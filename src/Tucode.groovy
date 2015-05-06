/**
 * Created by diugalde on 5/6/15.
 */

import org.antlr.v4.runtime.*;

class Tucode {
    public static void main(String[] args) throws Exception {

        if(args.length == 0) {
            println("Debe ingresar el nombre del archivo de entrada (Ej: entrada.tc)")
        }else {
            // Creates an input stream for reading the console input.

            //ANTLRInputStream input = new ANTLRInputStream(new BufferedReader(new FileReader(new File("src/examples/"+args[0]))))
            ANTLRInputStream input = new ANTLRInputStream(new BufferedReader(new FileReader(new File(args[0]))))
            // Initialize tucode lexer instance.
            TucodeLexer lexer = new TucodeLexer(input)

            // Add a custom error listener to the lexer.
            lexer.removeErrorListeners();
            lexer.addErrorListener(new TucodeErrorListener());

            // Create a buffer of tokens pulled from the lexer.
            CommonTokenStream tokens = new CommonTokenStream(lexer)

            tokens.fill()

            println("Lista de tokens:")

            //Iterates trough the buffer of tokens.
            int tokenNumber = 1;
            for (Object tok : tokens.getTokens()) {
                println("      Token #" + tokenNumber.toString() + ": " + tok.toString().split("'")[1])
                tokenNumber++
            }

            //Create a parser for the syntax analysis.

            /*
            TucodeParser parser = new TucodeParser(tokens)
            parser.setErrorHandler(new TucodeErrorStrategy())
            ParseTree tree = parser.program()
            println(tree.toStringTree(parser))
            */
        }

    }
}
