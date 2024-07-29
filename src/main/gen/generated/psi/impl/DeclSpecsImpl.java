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

public class DeclSpecsImpl extends ASTWrapperPsiElement implements DeclSpecs {

  public DeclSpecsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitDeclSpecs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DeclSpecs getDeclSpecs() {
    return findChildByClass(DeclSpecs.class);
  }

  @Override
  @Nullable
  public StorageClassSpec getStorageClassSpec() {
    return findChildByClass(StorageClassSpec.class);
  }

  @Override
  @Nullable
  public TypeQualifier getTypeQualifier() {
    return findChildByClass(TypeQualifier.class);
  }

  @Override
  @Nullable
  public TypeSpec getTypeSpec() {
    return findChildByClass(TypeSpec.class);
  }

}
