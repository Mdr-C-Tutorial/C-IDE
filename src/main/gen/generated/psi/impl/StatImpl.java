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

public class StatImpl extends ASTWrapperPsiElement implements Stat {

  public StatImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitStat(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CompoundStat getCompoundStat() {
    return findChildByClass(CompoundStat.class);
  }

  @Override
  @Nullable
  public ExpStat getExpStat() {
    return findChildByClass(ExpStat.class);
  }

  @Override
  @Nullable
  public IterationStat getIterationStat() {
    return findChildByClass(IterationStat.class);
  }

  @Override
  @Nullable
  public JumpStat getJumpStat() {
    return findChildByClass(JumpStat.class);
  }

  @Override
  @Nullable
  public LabeledStat getLabeledStat() {
    return findChildByClass(LabeledStat.class);
  }

  @Override
  @Nullable
  public SelectionStat getSelectionStat() {
    return findChildByClass(SelectionStat.class);
  }

}
