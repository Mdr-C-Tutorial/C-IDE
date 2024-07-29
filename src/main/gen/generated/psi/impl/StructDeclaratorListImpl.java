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

public class StructDeclaratorListImpl extends ASTWrapperPsiElement implements StructDeclaratorList {

  public StructDeclaratorListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStructDeclaratorList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructDeclarator getStructDeclarator() {
    return findNotNullChildByClass(StructDeclarator.class);
  }

  @Override
  @Nullable
  public StructDeclaratorList getStructDeclaratorList() {
    return findChildByClass(StructDeclaratorList.class);
  }

}
