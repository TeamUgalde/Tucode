package ast;

import ast.visitor.ASTVisitor;
import tablasimbolos.Scope;


abstract class ASTNode {
    private int _Line;
    private Scope _Scope;

    public Scope getScope() {
        return _Scope;
    }

    public void setScope(Scope _Scope) {
        this._Scope = _Scope;
    }

    public int getLine() {
        return _Line;
    }

    public void setLine(int pLine) {
        _Line = pLine;
    }

    public abstract void accept(ASTVisitor pVisitor);


}
