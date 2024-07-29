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

public class LabeledStatImpl extends ASTWrapperPsiElement implements LabeledStat {

  public LabeledStatImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitLabeledStat(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ConstExp getConstExp() {
    return findChildByClass(ConstExp.class);
  }

  @Override
  @Nullable
  public Id getId() {
    return findChildByClass(Id.class);
  }

  @Override
  @NotNull
  public Stat getStat() {
    return findNotNullChildByClass(Stat.class);
  }

}
