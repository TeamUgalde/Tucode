package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTNode
import ast.visitor.ASTVisitor


class Block extends ASTNode {

    List<Prop> props = []
    DataType resultType

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(block props(${(props*.toString()).join(' ')}))"
    }

    String generateCode(Register register){
        String res = ""
        for (Prop prop: props){
            res += prop.generateCode(register)
        }
        return res

    }
}
