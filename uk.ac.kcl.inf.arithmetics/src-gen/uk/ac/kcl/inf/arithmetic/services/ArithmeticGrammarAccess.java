/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArithmeticGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ArithmeticsProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.ArithmeticsProgram");
		private final Assignment cStatesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatesStatementParserRuleCall_0 = (RuleCall)cStatesAssignment.eContents().get(0);
		
		//ArithmeticsProgram:
		//	states+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//states+=Statement*
		public Assignment getStatesAssignment() { return cStatesAssignment; }
		
		//Statement
		public RuleCall getStatesStatementParserRuleCall_0() { return cStatesStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAdditionStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSubtractionStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMultiplicationStatementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDivisionStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPowerStatementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Statement:
		//	AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement;
		@Override public ParserRule getRule() { return rule; }
		
		//AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AdditionStatement
		public RuleCall getAdditionStatementParserRuleCall_0() { return cAdditionStatementParserRuleCall_0; }
		
		//SubtractionStatement
		public RuleCall getSubtractionStatementParserRuleCall_1() { return cSubtractionStatementParserRuleCall_1; }
		
		//MultiplicationStatement
		public RuleCall getMultiplicationStatementParserRuleCall_2() { return cMultiplicationStatementParserRuleCall_2; }
		
		//DivisionStatement
		public RuleCall getDivisionStatementParserRuleCall_3() { return cDivisionStatementParserRuleCall_3; }
		
		//PowerStatement
		public RuleCall getPowerStatementParserRuleCall_4() { return cPowerStatementParserRuleCall_4; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAdditionStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSubtractionStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMultiplicationStatementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDivisionStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPowerStatementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cNumberExpressionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Expression:
		//	AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement |
		//	NumberExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement |
		//NumberExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AdditionStatement
		public RuleCall getAdditionStatementParserRuleCall_0() { return cAdditionStatementParserRuleCall_0; }
		
		//SubtractionStatement
		public RuleCall getSubtractionStatementParserRuleCall_1() { return cSubtractionStatementParserRuleCall_1; }
		
		//MultiplicationStatement
		public RuleCall getMultiplicationStatementParserRuleCall_2() { return cMultiplicationStatementParserRuleCall_2; }
		
		//DivisionStatement
		public RuleCall getDivisionStatementParserRuleCall_3() { return cDivisionStatementParserRuleCall_3; }
		
		//PowerStatement
		public RuleCall getPowerStatementParserRuleCall_4() { return cPowerStatementParserRuleCall_4; }
		
		//NumberExpression
		public RuleCall getNumberExpressionParserRuleCall_5() { return cNumberExpressionParserRuleCall_5; }
	}
	public class AdditionStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.AdditionStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAddend1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAddend1ExpressionParserRuleCall_2_0 = (RuleCall)cAddend1Assignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAddend2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAddend2ExpressionParserRuleCall_4_0 = (RuleCall)cAddend2Assignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//AdditionStatement:
		//	"add" "(" addend1=Expression "," addend2=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"add" "(" addend1=Expression "," addend2=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"add"
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//addend1=Expression
		public Assignment getAddend1Assignment_2() { return cAddend1Assignment_2; }
		
		//Expression
		public RuleCall getAddend1ExpressionParserRuleCall_2_0() { return cAddend1ExpressionParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//addend2=Expression
		public Assignment getAddend2Assignment_4() { return cAddend2Assignment_4; }
		
		//Expression
		public RuleCall getAddend2ExpressionParserRuleCall_4_0() { return cAddend2ExpressionParserRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class SubtractionStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.SubtractionStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubtractKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinuendAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinuendExpressionParserRuleCall_2_0 = (RuleCall)cMinuendAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSubtrahendAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSubtrahendExpressionParserRuleCall_4_0 = (RuleCall)cSubtrahendAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SubtractionStatement:
		//	"subtract" "(" minuend=Expression "," subtrahend=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"subtract" "(" minuend=Expression "," subtrahend=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"subtract"
		public Keyword getSubtractKeyword_0() { return cSubtractKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//minuend=Expression
		public Assignment getMinuendAssignment_2() { return cMinuendAssignment_2; }
		
		//Expression
		public RuleCall getMinuendExpressionParserRuleCall_2_0() { return cMinuendExpressionParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//subtrahend=Expression
		public Assignment getSubtrahendAssignment_4() { return cSubtrahendAssignment_4; }
		
		//Expression
		public RuleCall getSubtrahendExpressionParserRuleCall_4_0() { return cSubtrahendExpressionParserRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class MultiplicationStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.MultiplicationStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMultiplyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMultiplier1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMultiplier1ExpressionParserRuleCall_2_0 = (RuleCall)cMultiplier1Assignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMultiplier2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMultiplier2ExpressionParserRuleCall_4_0 = (RuleCall)cMultiplier2Assignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MultiplicationStatement:
		//	"multiply" "(" multiplier1=Expression "," multiplier2=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"multiply" "(" multiplier1=Expression "," multiplier2=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"multiply"
		public Keyword getMultiplyKeyword_0() { return cMultiplyKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//multiplier1=Expression
		public Assignment getMultiplier1Assignment_2() { return cMultiplier1Assignment_2; }
		
		//Expression
		public RuleCall getMultiplier1ExpressionParserRuleCall_2_0() { return cMultiplier1ExpressionParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//multiplier2=Expression
		public Assignment getMultiplier2Assignment_4() { return cMultiplier2Assignment_4; }
		
		//Expression
		public RuleCall getMultiplier2ExpressionParserRuleCall_4_0() { return cMultiplier2ExpressionParserRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class DivisionStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.DivisionStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDivideKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDividendAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDividendExpressionParserRuleCall_2_0 = (RuleCall)cDividendAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDivisorAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDivisorExpressionParserRuleCall_4_0 = (RuleCall)cDivisorAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DivisionStatement:
		//	"divide" "(" dividend=Expression "," divisor=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"divide" "(" dividend=Expression "," divisor=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"divide"
		public Keyword getDivideKeyword_0() { return cDivideKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//dividend=Expression
		public Assignment getDividendAssignment_2() { return cDividendAssignment_2; }
		
		//Expression
		public RuleCall getDividendExpressionParserRuleCall_2_0() { return cDividendExpressionParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//divisor=Expression
		public Assignment getDivisorAssignment_4() { return cDivisorAssignment_4; }
		
		//Expression
		public RuleCall getDivisorExpressionParserRuleCall_4_0() { return cDivisorExpressionParserRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class PowerStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.PowerStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPowerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBasenumberAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBasenumberExpressionParserRuleCall_2_0 = (RuleCall)cBasenumberAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTimesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTimesINTTerminalRuleCall_4_0 = (RuleCall)cTimesAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PowerStatement:
		//	"power" "(" basenumber=Expression "," times=INT ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"power" "(" basenumber=Expression "," times=INT ")"
		public Group getGroup() { return cGroup; }
		
		//"power"
		public Keyword getPowerKeyword_0() { return cPowerKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//basenumber=Expression
		public Assignment getBasenumberAssignment_2() { return cBasenumberAssignment_2; }
		
		//Expression
		public RuleCall getBasenumberExpressionParserRuleCall_2_0() { return cBasenumberExpressionParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//times=INT
		public Assignment getTimesAssignment_4() { return cTimesAssignment_4; }
		
		//INT
		public RuleCall getTimesINTTerminalRuleCall_4_0() { return cTimesINTTerminalRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class NumberExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.NumberExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRealLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NumberExpression:
		//	IntLiteral | RealLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//IntLiteral | RealLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IntLiteral
		public RuleCall getIntLiteralParserRuleCall_0() { return cIntLiteralParserRuleCall_0; }
		
		//RealLiteral
		public RuleCall getRealLiteralParserRuleCall_1() { return cRealLiteralParserRuleCall_1; }
	}
	public class IntLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.IntLiteral");
		private final Assignment cNumAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNumINTTerminalRuleCall_0 = (RuleCall)cNumAssignment.eContents().get(0);
		
		//IntLiteral:
		//	num=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//num=INT
		public Assignment getNumAssignment() { return cNumAssignment; }
		
		//INT
		public RuleCall getNumINTTerminalRuleCall_0() { return cNumINTTerminalRuleCall_0; }
	}
	public class RealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.RealLiteral");
		private final Assignment cNumAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNumREALParserRuleCall_0 = (RuleCall)cNumAssignment.eContents().get(0);
		
		//RealLiteral:
		//	num=REAL;
		@Override public ParserRule getRule() { return rule; }
		
		//num=REAL
		public Assignment getNumAssignment() { return cNumAssignment; }
		
		//REAL
		public RuleCall getNumREALParserRuleCall_0() { return cNumREALParserRuleCall_0; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.arithmetic.Arithmetic.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//REAL ecore::EFloat hidden():
		//	INT? "." INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT? "." INT
		public Group getGroup() { return cGroup; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	
	private final ArithmeticsProgramElements pArithmeticsProgram;
	private final StatementElements pStatement;
	private final ExpressionElements pExpression;
	private final AdditionStatementElements pAdditionStatement;
	private final SubtractionStatementElements pSubtractionStatement;
	private final MultiplicationStatementElements pMultiplicationStatement;
	private final DivisionStatementElements pDivisionStatement;
	private final PowerStatementElements pPowerStatement;
	private final NumberExpressionElements pNumberExpression;
	private final IntLiteralElements pIntLiteral;
	private final RealLiteralElements pRealLiteral;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArithmeticGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pArithmeticsProgram = new ArithmeticsProgramElements();
		this.pStatement = new StatementElements();
		this.pExpression = new ExpressionElements();
		this.pAdditionStatement = new AdditionStatementElements();
		this.pSubtractionStatement = new SubtractionStatementElements();
		this.pMultiplicationStatement = new MultiplicationStatementElements();
		this.pDivisionStatement = new DivisionStatementElements();
		this.pPowerStatement = new PowerStatementElements();
		this.pNumberExpression = new NumberExpressionElements();
		this.pIntLiteral = new IntLiteralElements();
		this.pRealLiteral = new RealLiteralElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.arithmetic.Arithmetic".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ArithmeticsProgram:
	//	states+=Statement*;
	public ArithmeticsProgramElements getArithmeticsProgramAccess() {
		return pArithmeticsProgram;
	}
	
	public ParserRule getArithmeticsProgramRule() {
		return getArithmeticsProgramAccess().getRule();
	}
	
	//Statement:
	//	AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Expression:
	//	AdditionStatement | SubtractionStatement | MultiplicationStatement | DivisionStatement | PowerStatement |
	//	NumberExpression;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//AdditionStatement:
	//	"add" "(" addend1=Expression "," addend2=Expression ")";
	public AdditionStatementElements getAdditionStatementAccess() {
		return pAdditionStatement;
	}
	
	public ParserRule getAdditionStatementRule() {
		return getAdditionStatementAccess().getRule();
	}
	
	//SubtractionStatement:
	//	"subtract" "(" minuend=Expression "," subtrahend=Expression ")";
	public SubtractionStatementElements getSubtractionStatementAccess() {
		return pSubtractionStatement;
	}
	
	public ParserRule getSubtractionStatementRule() {
		return getSubtractionStatementAccess().getRule();
	}
	
	//MultiplicationStatement:
	//	"multiply" "(" multiplier1=Expression "," multiplier2=Expression ")";
	public MultiplicationStatementElements getMultiplicationStatementAccess() {
		return pMultiplicationStatement;
	}
	
	public ParserRule getMultiplicationStatementRule() {
		return getMultiplicationStatementAccess().getRule();
	}
	
	//DivisionStatement:
	//	"divide" "(" dividend=Expression "," divisor=Expression ")";
	public DivisionStatementElements getDivisionStatementAccess() {
		return pDivisionStatement;
	}
	
	public ParserRule getDivisionStatementRule() {
		return getDivisionStatementAccess().getRule();
	}
	
	//PowerStatement:
	//	"power" "(" basenumber=Expression "," times=INT ")";
	public PowerStatementElements getPowerStatementAccess() {
		return pPowerStatement;
	}
	
	public ParserRule getPowerStatementRule() {
		return getPowerStatementAccess().getRule();
	}
	
	//NumberExpression:
	//	IntLiteral | RealLiteral;
	public NumberExpressionElements getNumberExpressionAccess() {
		return pNumberExpression;
	}
	
	public ParserRule getNumberExpressionRule() {
		return getNumberExpressionAccess().getRule();
	}
	
	//IntLiteral:
	//	num=INT;
	public IntLiteralElements getIntLiteralAccess() {
		return pIntLiteral;
	}
	
	public ParserRule getIntLiteralRule() {
		return getIntLiteralAccess().getRule();
	}
	
	//RealLiteral:
	//	num=REAL;
	public RealLiteralElements getRealLiteralAccess() {
		return pRealLiteral;
	}
	
	public ParserRule getRealLiteralRule() {
		return getRealLiteralAccess().getRule();
	}
	
	//REAL ecore::EFloat hidden():
	//	INT? "." INT;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
