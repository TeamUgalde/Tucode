package ast.visitor

import groovy.transform.Canonical

@Canonical
abstract class ASTNode {
    abstract void accept(ASTVisitor visitor);
}