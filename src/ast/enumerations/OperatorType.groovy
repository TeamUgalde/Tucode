package ast.enumerations

public enum OperatorType {
    NEG('-'), MULT('*'),DIV('/'), ADD('+'), SUB('-'), EQ('=='), NEQ('!='), GT('>'), LT('<'), GE('>='), LE('<=')

    String payload;

    OperatorType(String payload) {
        this.payload = payload
    }

    static OperatorType fromPayload(String payload) {
        return values().find { value ->
            value.payload == payload
        }
    }
}