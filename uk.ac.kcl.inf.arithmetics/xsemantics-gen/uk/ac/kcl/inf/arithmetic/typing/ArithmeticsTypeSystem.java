package uk.ac.kcl.inf.arithmetic.typing;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.Expression;
import uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.PowerStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement;
import uk.ac.kcl.inf.arithmetic.typing.ArithmeticsType;

@SuppressWarnings("all")
public class ArithmeticsTypeSystem extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSION = "uk.ac.kcl.inf.arithmetic.typing.TypeExpression";
  
  public static final String TINTLIT = "uk.ac.kcl.inf.arithmetic.typing.TIntLit";
  
  public static final String TREALLIT = "uk.ac.kcl.inf.arithmetic.typing.TRealLit";
  
  public static final String TADDITION = "uk.ac.kcl.inf.arithmetic.typing.TAddition";
  
  public static final String TSUBTRACTION = "uk.ac.kcl.inf.arithmetic.typing.TSubtraction";
  
  public static final String TMULTIPLICATION = "uk.ac.kcl.inf.arithmetic.typing.TMultiplication";
  
  public static final String TDIVISION = "uk.ac.kcl.inf.arithmetic.typing.TDivision";
  
  public static final String TPOWER = "uk.ac.kcl.inf.arithmetic.typing.TPower";
  
  private PolymorphicDispatcher<ArithmeticsType> typeExpressionDispatcher;
  
  private PolymorphicDispatcher<Result<ArithmeticsType>> typeDispatcher;
  
  public ArithmeticsTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    typeExpressionDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionImpl", 2);
  }
  
  public ArithmeticsType typeExpression(final Iterable<Expression> exps) throws RuleFailedException {
    return typeExpression(null, exps);
  }
  
  public ArithmeticsType typeExpression(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	return typeExpressionInternal(_trace_, exps);
    } catch (Exception _e_typeExpression) {
    	throw extractRuleFailedException(_e_typeExpression);
    }
  }
  
  public Result<ArithmeticsType> type(final Expression exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<ArithmeticsType> type(final RuleEnvironment _environment_, final Expression exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<ArithmeticsType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<ArithmeticsType>>(_environment_, _trace_) {
    		public Result<ArithmeticsType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> divisionStatement(final DivisionStatement stmt) {
    return divisionStatement(null, stmt);
  }
  
  public Result<Boolean> divisionStatement(final RuleApplicationTrace _trace_, final DivisionStatement stmt) {
    try {
    	return divisionStatementInternal(_trace_, stmt);
    } catch (Exception _e_DivisionStatement) {
    	return resultForFailure(_e_DivisionStatement);
    }
  }
  
  protected Result<Boolean> divisionStatementInternal(final RuleApplicationTrace _trace_, final DivisionStatement stmt) throws RuleFailedException {
    /* empty |- stmt.divisor : var ArithmeticsType divisorType */
    Expression _divisor = stmt.getDivisor();
    ArithmeticsType divisorType = null;
    Result<ArithmeticsType> result = typeInternal(emptyEnvironment(), _trace_, _divisor);
    checkAssignableTo(result.getFirst(), ArithmeticsType.class);
    divisorType = (ArithmeticsType) result.getFirst();
    
    divisorType = ArithmeticsType.INT;
    return new Result<Boolean>(true);
  }
  
  protected ArithmeticsType typeExpressionInternal(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) {
    return getFromCache("typeExpressionInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<ArithmeticsType>(null, _trace_) {
    		public ArithmeticsType doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpression) {
    				sneakyThrowRuleFailedException(_e_typeExpression);
    				return null;
    			}
    		}
    	}, exps);
  }
  
  protected void typeExpressionThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<Expression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<ArithmeticsType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<ArithmeticsType>>(_environment_, _trace_) {
    		public Result<ArithmeticsType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("Cannot type " + _stringRep);
    String _plus_1 = (_plus + ",you should type a real or a integer.");
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    
    return new Result<ArithmeticsType>(_applyRuleTIntLit_1(G, exp));
  }
  
  private ArithmeticsType _applyRuleTIntLit_1(final RuleEnvironment G, final IntLiteral exp) throws RuleFailedException {
    return ArithmeticsType.INT;
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    
    return new Result<ArithmeticsType>(_applyRuleTRealLit_1(G, exp));
  }
  
  private ArithmeticsType _applyRuleTRealLit_1(final RuleEnvironment G, final RealLiteral exp) throws RuleFailedException {
    return ArithmeticsType.REAL;
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AdditionStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final AdditionStatement exp) throws RuleFailedException {
    ArithmeticsType t = null; // output parameter
    Expression _addend1 = exp.getAddend1();
    Expression _addend2 = exp.getAddend2();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_addend1)), Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_addend2))));
    return new Result<ArithmeticsType>(t);
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final SubtractionStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTSubtraction(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TSubtraction") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTSubtraction) {
    	typeThrowException(ruleName("TSubtraction") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TSUBTRACTION,
    		e_applyRuleTSubtraction, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTSubtraction(final RuleEnvironment G, final RuleApplicationTrace _trace_, final SubtractionStatement exp) throws RuleFailedException {
    ArithmeticsType t = null; // output parameter
    Expression _minuend = exp.getMinuend();
    Expression _subtrahend = exp.getSubtrahend();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_minuend)), Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_subtrahend))));
    return new Result<ArithmeticsType>(t);
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final MultiplicationStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final MultiplicationStatement exp) throws RuleFailedException {
    ArithmeticsType t = null; // output parameter
    Expression _multiplier1 = exp.getMultiplier1();
    Expression _multiplier2 = exp.getMultiplier2();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_multiplier1)), Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_multiplier2))));
    return new Result<ArithmeticsType>(t);
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final DivisionStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTDivision(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TDivision") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTDivision) {
    	typeThrowException(ruleName("TDivision") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TDIVISION,
    		e_applyRuleTDivision, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTDivision(final RuleEnvironment G, final RuleApplicationTrace _trace_, final DivisionStatement exp) throws RuleFailedException {
    ArithmeticsType t = null; // output parameter
    Expression _dividend = exp.getDividend();
    Expression _divisor = exp.getDivisor();
    t = this.typeExpressionInternal(_trace_, Iterables.<Expression>concat(Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_dividend)), Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_divisor))));
    return new Result<ArithmeticsType>(t);
  }
  
  protected Result<ArithmeticsType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final PowerStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<ArithmeticsType> _result_ = applyRuleTPower(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TPower") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTPower) {
    	typeThrowException(ruleName("TPower") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "ArithmeticsType",
    		TPOWER,
    		e_applyRuleTPower, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<ArithmeticsType> applyRuleTPower(final RuleEnvironment G, final RuleApplicationTrace _trace_, final PowerStatement exp) throws RuleFailedException {
    ArithmeticsType t = null; // output parameter
    Expression _basenumber = exp.getBasenumber();
    t = this.typeExpressionInternal(_trace_, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_basenumber)));
    return new Result<ArithmeticsType>(t);
  }
}
