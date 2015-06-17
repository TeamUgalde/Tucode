package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.OperatorType
import ast.visitor.ASTVisitor

class BinaryExpr extends Expr {

    OperatorType operatorType
    Expr leftOperand
    Expr rightOperand

    @Override
    String toString() {
        return "(${operatorType.payload} ${leftOperand} ${rightOperand})"
    }

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }
    @Override
    String generateCode(Register register){
        String res = "; declaration binary expr"
        String ope =""
        switch (operatorType){
            case OperatorType.NEQ:
                ope =" ne "
                return generateCodeExprRelational(ope,register)
                break;
            case OperatorType.GT:
                ope = " sgt "
                return generateCodeExprRelational(ope,register)
                break;
            case OperatorType.LT:
                ope = " slt "
                return generateCodeExprRelational(ope,register)
                break;
            case OperatorType.GE:
                ope = " sge "
                return generateCodeExprRelational(ope,register)
                break;
            case OperatorType.LE:
                ope = " sle "
                return generateCodeExprRelational(ope,register)
                break;
            case OperatorType.ADD:
                ope = " add "
                return generateCodeExpInt(ope,register)
                break
            case OperatorType.SUB:
                ope = " sub "
                return generateCodeExpInt(ope,register)
                break
            case OperatorType.DIV:
                ope = " udiv "
                return generateCodeExpInt(ope,register)
                break
            case OperatorType.MULT:
                ope= " mul "
                return generateCodeExpInt(ope,register)
                break
            case OperatorType.EQ:
                ope =" eq "
                return generateCodeExprRelational(ope, register)
                break;
        }
        return res
    }

    String generateCodeExprRelational(String ope, Register register){
        rValue = "%expBool"+register.r++

        return res
    }

    String generateCodeExpInt(String ope, Register register){
        String res =""
        return res
    }
}