/**
 * Created by diugalde on 5/6/15.
 */


import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree;

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
            lexer.addErrorListener(new TucodeLexerErrorListener());

            // Create a buffer of tokens pulled from the lexer.
            CommonTokenStream tokens = new CommonTokenStream(lexer)
            tokens.fill()

            if(args.contains("-tokens")) {
                println("\nLista de tokens (Análisis léxico):")

                //Iterates trough the buffer of tokens to display the token list.
                int tokenNumber = 1;
                for (Object tok : tokens.getTokens()) {
                    println("      Token #" + tokenNumber.toString() + ": " + tok.toString().split("'")[1])
                    tokenNumber++
                }
            }

            //Create a parser for the syntax analysis.
            TucodeParser parser = new TucodeParser(tokens)

            // Add a custom error listener to the lexer.
            parser.removeErrorListeners()
            parser.addErrorListener(new TucodeParserErrorListener())

            // Add custom error handler for the syntax error messages (spanish).
            parser.setErrorHandler(new TucodeParserErrorStrategy())

            // Starts the parse, generates a tree to be printed and displayed.
            ParseTree tree = parser.program()

            //println("\nÁrbol sintáctico (Análisis de sintáxis):")
            //println(tree.toStringTree(parser))
            if(args.contains("-ig")) tree.inspect(parser);

            if(args.contains("-gc")) println("La generación de código no está disponible todavía.")

        }
    }
}
