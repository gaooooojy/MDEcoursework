package uk.ac.kcl.inf.arithmetic.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement;
import uk.ac.kcl.inf.arithmetic.typing.ArithmeticsTypeSystem;
import uk.ac.kcl.inf.arithmetic.validation.AbstractArithmeticValidator;

@SuppressWarnings("all")
public class ArithmeticsTypeSystemValidator extends AbstractArithmeticValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected ArithmeticsTypeSystem xsemanticsSystem;
  
  protected ArithmeticsTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void divisionStatement(final DivisionStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().divisionStatement(stmt),
    		stmt);
  }
}
