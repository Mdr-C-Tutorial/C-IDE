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

public class InitDeclaratorListImpl extends ASTWrapperPsiElement implements InitDeclaratorList {

  public InitDeclaratorListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitInitDeclaratorList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public InitDeclarator getInitDeclarator() {
    return findNotNullChildByClass(InitDeclarator.class);
  }

  @Override
  @Nullable
  public InitDeclaratorList getInitDeclaratorList() {
    return findChildByClass(InitDeclaratorList.class);
  }

}
