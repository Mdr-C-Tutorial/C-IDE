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

public class RelationalExpImpl extends ASTWrapperPsiElement implements RelationalExp {

  public RelationalExpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitRelationalExp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RelationalExp getRelationalExp() {
    return findChildByClass(RelationalExp.class);
  }

  @Override
  @NotNull
  public ShiftExpression getShiftExpression() {
    return findNotNullChildByClass(ShiftExpression.class);
  }

}
