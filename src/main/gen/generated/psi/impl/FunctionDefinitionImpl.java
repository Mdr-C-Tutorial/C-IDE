// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class FunctionDefinitionImpl extends ASTWrapperPsiElement implements FunctionDefinition {

  public FunctionDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitFunctionDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CompoundStat getCompoundStat() {
    return findNotNullChildByClass(CompoundStat.class);
  }

  @Override
  @Nullable
  public DeclList getDeclList() {
    return findChildByClass(DeclList.class);
  }

  @Override
  @Nullable
  public DeclSpecs getDeclSpecs() {
    return findChildByClass(DeclSpecs.class);
  }

  @Override
  @NotNull
  public Declarator getDeclarator() {
    return findNotNullChildByClass(Declarator.class);
  }

}
