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

public class StructOrUnionSpecImpl extends ASTWrapperPsiElement implements StructOrUnionSpec {

  public StructOrUnionSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStructOrUnionSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Id getId() {
    return findChildByClass(Id.class);
  }

  @Override
  @Nullable
  public StructDeclList getStructDeclList() {
    return findChildByClass(StructDeclList.class);
  }

  @Override
  @NotNull
  public StructOrUnion getStructOrUnion() {
    return findNotNullChildByClass(StructOrUnion.class);
  }

}
