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

public class PostfixExpImpl extends ASTWrapperPsiElement implements PostfixExp {

  public PostfixExpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitPostfixExp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ArgumentExpList getArgumentExpList() {
    return findChildByClass(ArgumentExpList.class);
  }

  @Override
  @Nullable
  public Exp getExp() {
    return findChildByClass(Exp.class);
  }

  @Override
  @Nullable
  public Id getId() {
    return findChildByClass(Id.class);
  }

  @Override
  @Nullable
  public PostfixExp getPostfixExp() {
    return findChildByClass(PostfixExp.class);
  }

  @Override
  @Nullable
  public PrimaryExp getPrimaryExp() {
    return findChildByClass(PrimaryExp.class);
  }

}
