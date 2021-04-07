package uk.ac.kcl.inf.arithmetic.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.arithmetic.services.ArithmeticGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArithmeticParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'add'", "'('", "')'", "'subtract'", "','", "'multiply'", "'divide'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalArithmeticParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArithmeticParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArithmeticParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArithmetic.g"; }


    	private ArithmeticGrammarAccess grammarAccess;

    	public void setGrammarAccess(ArithmeticGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleArithmeticsProgram"
    // InternalArithmetic.g:53:1: entryRuleArithmeticsProgram : ruleArithmeticsProgram EOF ;
    public final void entryRuleArithmeticsProgram() throws RecognitionException {
        try {
            // InternalArithmetic.g:54:1: ( ruleArithmeticsProgram EOF )
            // InternalArithmetic.g:55:1: ruleArithmeticsProgram EOF
            {
             before(grammarAccess.getArithmeticsProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmeticsProgram();

            state._fsp--;

             after(grammarAccess.getArithmeticsProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticsProgram"


    // $ANTLR start "ruleArithmeticsProgram"
    // InternalArithmetic.g:62:1: ruleArithmeticsProgram : ( ( rule__ArithmeticsProgram__StatesAssignment )* ) ;
    public final void ruleArithmeticsProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:66:2: ( ( ( rule__ArithmeticsProgram__StatesAssignment )* ) )
            // InternalArithmetic.g:67:2: ( ( rule__ArithmeticsProgram__StatesAssignment )* )
            {
            // InternalArithmetic.g:67:2: ( ( rule__ArithmeticsProgram__StatesAssignment )* )
            // InternalArithmetic.g:68:3: ( rule__ArithmeticsProgram__StatesAssignment )*
            {
             before(grammarAccess.getArithmeticsProgramAccess().getStatesAssignment()); 
            // InternalArithmetic.g:69:3: ( rule__ArithmeticsProgram__StatesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArithmetic.g:69:4: rule__ArithmeticsProgram__StatesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ArithmeticsProgram__StatesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getArithmeticsProgramAccess().getStatesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticsProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalArithmetic.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:79:1: ( ruleStatement EOF )
            // InternalArithmetic.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalArithmetic.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalArithmetic.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalArithmetic.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalArithmetic.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalArithmetic.g:94:3: ( rule__Statement__Alternatives )
            // InternalArithmetic.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalArithmetic.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalArithmetic.g:104:1: ( ruleExpression EOF )
            // InternalArithmetic.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalArithmetic.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalArithmetic.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalArithmetic.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalArithmetic.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalArithmetic.g:119:3: ( rule__Expression__Alternatives )
            // InternalArithmetic.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdditionStatement"
    // InternalArithmetic.g:128:1: entryRuleAdditionStatement : ruleAdditionStatement EOF ;
    public final void entryRuleAdditionStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:129:1: ( ruleAdditionStatement EOF )
            // InternalArithmetic.g:130:1: ruleAdditionStatement EOF
            {
             before(grammarAccess.getAdditionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionStatement();

            state._fsp--;

             after(grammarAccess.getAdditionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionStatement"


    // $ANTLR start "ruleAdditionStatement"
    // InternalArithmetic.g:137:1: ruleAdditionStatement : ( ( rule__AdditionStatement__Group__0 ) ) ;
    public final void ruleAdditionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:141:2: ( ( ( rule__AdditionStatement__Group__0 ) ) )
            // InternalArithmetic.g:142:2: ( ( rule__AdditionStatement__Group__0 ) )
            {
            // InternalArithmetic.g:142:2: ( ( rule__AdditionStatement__Group__0 ) )
            // InternalArithmetic.g:143:3: ( rule__AdditionStatement__Group__0 )
            {
             before(grammarAccess.getAdditionStatementAccess().getGroup()); 
            // InternalArithmetic.g:144:3: ( rule__AdditionStatement__Group__0 )
            // InternalArithmetic.g:144:4: rule__AdditionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionStatement"


    // $ANTLR start "entryRuleSubtractionStatement"
    // InternalArithmetic.g:153:1: entryRuleSubtractionStatement : ruleSubtractionStatement EOF ;
    public final void entryRuleSubtractionStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:154:1: ( ruleSubtractionStatement EOF )
            // InternalArithmetic.g:155:1: ruleSubtractionStatement EOF
            {
             before(grammarAccess.getSubtractionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtractionStatement();

            state._fsp--;

             after(grammarAccess.getSubtractionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubtractionStatement"


    // $ANTLR start "ruleSubtractionStatement"
    // InternalArithmetic.g:162:1: ruleSubtractionStatement : ( ( rule__SubtractionStatement__Group__0 ) ) ;
    public final void ruleSubtractionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:166:2: ( ( ( rule__SubtractionStatement__Group__0 ) ) )
            // InternalArithmetic.g:167:2: ( ( rule__SubtractionStatement__Group__0 ) )
            {
            // InternalArithmetic.g:167:2: ( ( rule__SubtractionStatement__Group__0 ) )
            // InternalArithmetic.g:168:3: ( rule__SubtractionStatement__Group__0 )
            {
             before(grammarAccess.getSubtractionStatementAccess().getGroup()); 
            // InternalArithmetic.g:169:3: ( rule__SubtractionStatement__Group__0 )
            // InternalArithmetic.g:169:4: rule__SubtractionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtractionStatement"


    // $ANTLR start "entryRuleMultiplicationStatement"
    // InternalArithmetic.g:178:1: entryRuleMultiplicationStatement : ruleMultiplicationStatement EOF ;
    public final void entryRuleMultiplicationStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:179:1: ( ruleMultiplicationStatement EOF )
            // InternalArithmetic.g:180:1: ruleMultiplicationStatement EOF
            {
             before(grammarAccess.getMultiplicationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationStatement();

            state._fsp--;

             after(grammarAccess.getMultiplicationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationStatement"


    // $ANTLR start "ruleMultiplicationStatement"
    // InternalArithmetic.g:187:1: ruleMultiplicationStatement : ( ( rule__MultiplicationStatement__Group__0 ) ) ;
    public final void ruleMultiplicationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:191:2: ( ( ( rule__MultiplicationStatement__Group__0 ) ) )
            // InternalArithmetic.g:192:2: ( ( rule__MultiplicationStatement__Group__0 ) )
            {
            // InternalArithmetic.g:192:2: ( ( rule__MultiplicationStatement__Group__0 ) )
            // InternalArithmetic.g:193:3: ( rule__MultiplicationStatement__Group__0 )
            {
             before(grammarAccess.getMultiplicationStatementAccess().getGroup()); 
            // InternalArithmetic.g:194:3: ( rule__MultiplicationStatement__Group__0 )
            // InternalArithmetic.g:194:4: rule__MultiplicationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationStatement"


    // $ANTLR start "entryRuleDivisionStatement"
    // InternalArithmetic.g:203:1: entryRuleDivisionStatement : ruleDivisionStatement EOF ;
    public final void entryRuleDivisionStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:204:1: ( ruleDivisionStatement EOF )
            // InternalArithmetic.g:205:1: ruleDivisionStatement EOF
            {
             before(grammarAccess.getDivisionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDivisionStatement();

            state._fsp--;

             after(grammarAccess.getDivisionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivisionStatement"


    // $ANTLR start "ruleDivisionStatement"
    // InternalArithmetic.g:212:1: ruleDivisionStatement : ( ( rule__DivisionStatement__Group__0 ) ) ;
    public final void ruleDivisionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:216:2: ( ( ( rule__DivisionStatement__Group__0 ) ) )
            // InternalArithmetic.g:217:2: ( ( rule__DivisionStatement__Group__0 ) )
            {
            // InternalArithmetic.g:217:2: ( ( rule__DivisionStatement__Group__0 ) )
            // InternalArithmetic.g:218:3: ( rule__DivisionStatement__Group__0 )
            {
             before(grammarAccess.getDivisionStatementAccess().getGroup()); 
            // InternalArithmetic.g:219:3: ( rule__DivisionStatement__Group__0 )
            // InternalArithmetic.g:219:4: rule__DivisionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivisionStatement"


    // $ANTLR start "entryRuleNumberExpression"
    // InternalArithmetic.g:228:1: entryRuleNumberExpression : ruleNumberExpression EOF ;
    public final void entryRuleNumberExpression() throws RecognitionException {
        try {
            // InternalArithmetic.g:229:1: ( ruleNumberExpression EOF )
            // InternalArithmetic.g:230:1: ruleNumberExpression EOF
            {
             before(grammarAccess.getNumberExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberExpression();

            state._fsp--;

             after(grammarAccess.getNumberExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // InternalArithmetic.g:237:1: ruleNumberExpression : ( ( rule__NumberExpression__Alternatives ) ) ;
    public final void ruleNumberExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:241:2: ( ( ( rule__NumberExpression__Alternatives ) ) )
            // InternalArithmetic.g:242:2: ( ( rule__NumberExpression__Alternatives ) )
            {
            // InternalArithmetic.g:242:2: ( ( rule__NumberExpression__Alternatives ) )
            // InternalArithmetic.g:243:3: ( rule__NumberExpression__Alternatives )
            {
             before(grammarAccess.getNumberExpressionAccess().getAlternatives()); 
            // InternalArithmetic.g:244:3: ( rule__NumberExpression__Alternatives )
            // InternalArithmetic.g:244:4: rule__NumberExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalArithmetic.g:253:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalArithmetic.g:254:1: ( ruleIntLiteral EOF )
            // InternalArithmetic.g:255:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalArithmetic.g:262:1: ruleIntLiteral : ( ( rule__IntLiteral__NumAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:266:2: ( ( ( rule__IntLiteral__NumAssignment ) ) )
            // InternalArithmetic.g:267:2: ( ( rule__IntLiteral__NumAssignment ) )
            {
            // InternalArithmetic.g:267:2: ( ( rule__IntLiteral__NumAssignment ) )
            // InternalArithmetic.g:268:3: ( rule__IntLiteral__NumAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getNumAssignment()); 
            // InternalArithmetic.g:269:3: ( rule__IntLiteral__NumAssignment )
            // InternalArithmetic.g:269:4: rule__IntLiteral__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalArithmetic.g:278:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalArithmetic.g:279:1: ( ruleRealLiteral EOF )
            // InternalArithmetic.g:280:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalArithmetic.g:287:1: ruleRealLiteral : ( ( rule__RealLiteral__NumAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:291:2: ( ( ( rule__RealLiteral__NumAssignment ) ) )
            // InternalArithmetic.g:292:2: ( ( rule__RealLiteral__NumAssignment ) )
            {
            // InternalArithmetic.g:292:2: ( ( rule__RealLiteral__NumAssignment ) )
            // InternalArithmetic.g:293:3: ( rule__RealLiteral__NumAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getNumAssignment()); 
            // InternalArithmetic.g:294:3: ( rule__RealLiteral__NumAssignment )
            // InternalArithmetic.g:294:4: rule__RealLiteral__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalArithmetic.g:303:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalArithmetic.g:307:1: ( ruleREAL EOF )
            // InternalArithmetic.g:308:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalArithmetic.g:318:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:323:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalArithmetic.g:324:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalArithmetic.g:324:2: ( ( rule__REAL__Group__0 ) )
            // InternalArithmetic.g:325:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalArithmetic.g:326:3: ( rule__REAL__Group__0 )
            // InternalArithmetic.g:326:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalArithmetic.g:335:1: rule__Statement__Alternatives : ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:339:1: ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArithmetic.g:340:2: ( ruleAdditionStatement )
                    {
                    // InternalArithmetic.g:340:2: ( ruleAdditionStatement )
                    // InternalArithmetic.g:341:3: ruleAdditionStatement
                    {
                     before(grammarAccess.getStatementAccess().getAdditionStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAdditionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAdditionStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:346:2: ( ruleSubtractionStatement )
                    {
                    // InternalArithmetic.g:346:2: ( ruleSubtractionStatement )
                    // InternalArithmetic.g:347:3: ruleSubtractionStatement
                    {
                     before(grammarAccess.getStatementAccess().getSubtractionStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtractionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSubtractionStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArithmetic.g:352:2: ( ruleMultiplicationStatement )
                    {
                    // InternalArithmetic.g:352:2: ( ruleMultiplicationStatement )
                    // InternalArithmetic.g:353:3: ruleMultiplicationStatement
                    {
                     before(grammarAccess.getStatementAccess().getMultiplicationStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiplicationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMultiplicationStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArithmetic.g:358:2: ( ruleDivisionStatement )
                    {
                    // InternalArithmetic.g:358:2: ( ruleDivisionStatement )
                    // InternalArithmetic.g:359:3: ruleDivisionStatement
                    {
                     before(grammarAccess.getStatementAccess().getDivisionStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDivisionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDivisionStatementParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalArithmetic.g:368:1: rule__Expression__Alternatives : ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( ruleNumberExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:372:1: ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( ruleNumberExpression ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case RULE_INT:
            case 18:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalArithmetic.g:373:2: ( ruleAdditionStatement )
                    {
                    // InternalArithmetic.g:373:2: ( ruleAdditionStatement )
                    // InternalArithmetic.g:374:3: ruleAdditionStatement
                    {
                     before(grammarAccess.getExpressionAccess().getAdditionStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAdditionStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAdditionStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:379:2: ( ruleSubtractionStatement )
                    {
                    // InternalArithmetic.g:379:2: ( ruleSubtractionStatement )
                    // InternalArithmetic.g:380:3: ruleSubtractionStatement
                    {
                     before(grammarAccess.getExpressionAccess().getSubtractionStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtractionStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSubtractionStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArithmetic.g:385:2: ( ruleMultiplicationStatement )
                    {
                    // InternalArithmetic.g:385:2: ( ruleMultiplicationStatement )
                    // InternalArithmetic.g:386:3: ruleMultiplicationStatement
                    {
                     before(grammarAccess.getExpressionAccess().getMultiplicationStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiplicationStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMultiplicationStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArithmetic.g:391:2: ( ruleDivisionStatement )
                    {
                    // InternalArithmetic.g:391:2: ( ruleDivisionStatement )
                    // InternalArithmetic.g:392:3: ruleDivisionStatement
                    {
                     before(grammarAccess.getExpressionAccess().getDivisionStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDivisionStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDivisionStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArithmetic.g:397:2: ( ruleNumberExpression )
                    {
                    // InternalArithmetic.g:397:2: ( ruleNumberExpression )
                    // InternalArithmetic.g:398:3: ruleNumberExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__NumberExpression__Alternatives"
    // InternalArithmetic.g:407:1: rule__NumberExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleRealLiteral ) );
    public final void rule__NumberExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:411:1: ( ( ruleIntLiteral ) | ( ruleRealLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==13||LA4_1==15) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArithmetic.g:412:2: ( ruleIntLiteral )
                    {
                    // InternalArithmetic.g:412:2: ( ruleIntLiteral )
                    // InternalArithmetic.g:413:3: ruleIntLiteral
                    {
                     before(grammarAccess.getNumberExpressionAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumberExpressionAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:418:2: ( ruleRealLiteral )
                    {
                    // InternalArithmetic.g:418:2: ( ruleRealLiteral )
                    // InternalArithmetic.g:419:3: ruleRealLiteral
                    {
                     before(grammarAccess.getNumberExpressionAccess().getRealLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumberExpressionAccess().getRealLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberExpression__Alternatives"


    // $ANTLR start "rule__AdditionStatement__Group__0"
    // InternalArithmetic.g:428:1: rule__AdditionStatement__Group__0 : rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1 ;
    public final void rule__AdditionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:432:1: ( rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1 )
            // InternalArithmetic.g:433:2: rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AdditionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__0"


    // $ANTLR start "rule__AdditionStatement__Group__0__Impl"
    // InternalArithmetic.g:440:1: rule__AdditionStatement__Group__0__Impl : ( 'add' ) ;
    public final void rule__AdditionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:444:1: ( ( 'add' ) )
            // InternalArithmetic.g:445:1: ( 'add' )
            {
            // InternalArithmetic.g:445:1: ( 'add' )
            // InternalArithmetic.g:446:2: 'add'
            {
             before(grammarAccess.getAdditionStatementAccess().getAddKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAdditionStatementAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__0__Impl"


    // $ANTLR start "rule__AdditionStatement__Group__1"
    // InternalArithmetic.g:455:1: rule__AdditionStatement__Group__1 : rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2 ;
    public final void rule__AdditionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:459:1: ( rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2 )
            // InternalArithmetic.g:460:2: rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AdditionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__1"


    // $ANTLR start "rule__AdditionStatement__Group__1__Impl"
    // InternalArithmetic.g:467:1: rule__AdditionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__AdditionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:471:1: ( ( '(' ) )
            // InternalArithmetic.g:472:1: ( '(' )
            {
            // InternalArithmetic.g:472:1: ( '(' )
            // InternalArithmetic.g:473:2: '('
            {
             before(grammarAccess.getAdditionStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAdditionStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__1__Impl"


    // $ANTLR start "rule__AdditionStatement__Group__2"
    // InternalArithmetic.g:482:1: rule__AdditionStatement__Group__2 : rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3 ;
    public final void rule__AdditionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:486:1: ( rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3 )
            // InternalArithmetic.g:487:2: rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AdditionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__2"


    // $ANTLR start "rule__AdditionStatement__Group__2__Impl"
    // InternalArithmetic.g:494:1: rule__AdditionStatement__Group__2__Impl : ( ( rule__AdditionStatement__Addend1Assignment_2 ) ) ;
    public final void rule__AdditionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:498:1: ( ( ( rule__AdditionStatement__Addend1Assignment_2 ) ) )
            // InternalArithmetic.g:499:1: ( ( rule__AdditionStatement__Addend1Assignment_2 ) )
            {
            // InternalArithmetic.g:499:1: ( ( rule__AdditionStatement__Addend1Assignment_2 ) )
            // InternalArithmetic.g:500:2: ( rule__AdditionStatement__Addend1Assignment_2 )
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend1Assignment_2()); 
            // InternalArithmetic.g:501:2: ( rule__AdditionStatement__Addend1Assignment_2 )
            // InternalArithmetic.g:501:3: rule__AdditionStatement__Addend1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Addend1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionStatementAccess().getAddend1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__2__Impl"


    // $ANTLR start "rule__AdditionStatement__Group__3"
    // InternalArithmetic.g:509:1: rule__AdditionStatement__Group__3 : rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4 ;
    public final void rule__AdditionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:513:1: ( rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4 )
            // InternalArithmetic.g:514:2: rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AdditionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__3"


    // $ANTLR start "rule__AdditionStatement__Group__3__Impl"
    // InternalArithmetic.g:521:1: rule__AdditionStatement__Group__3__Impl : ( ( rule__AdditionStatement__OperatorAssignment_3 ) ) ;
    public final void rule__AdditionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:525:1: ( ( ( rule__AdditionStatement__OperatorAssignment_3 ) ) )
            // InternalArithmetic.g:526:1: ( ( rule__AdditionStatement__OperatorAssignment_3 ) )
            {
            // InternalArithmetic.g:526:1: ( ( rule__AdditionStatement__OperatorAssignment_3 ) )
            // InternalArithmetic.g:527:2: ( rule__AdditionStatement__OperatorAssignment_3 )
            {
             before(grammarAccess.getAdditionStatementAccess().getOperatorAssignment_3()); 
            // InternalArithmetic.g:528:2: ( rule__AdditionStatement__OperatorAssignment_3 )
            // InternalArithmetic.g:528:3: rule__AdditionStatement__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AdditionStatement__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAdditionStatementAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__3__Impl"


    // $ANTLR start "rule__AdditionStatement__Group__4"
    // InternalArithmetic.g:536:1: rule__AdditionStatement__Group__4 : rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5 ;
    public final void rule__AdditionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:540:1: ( rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5 )
            // InternalArithmetic.g:541:2: rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AdditionStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__4"


    // $ANTLR start "rule__AdditionStatement__Group__4__Impl"
    // InternalArithmetic.g:548:1: rule__AdditionStatement__Group__4__Impl : ( ( rule__AdditionStatement__Addend2Assignment_4 ) ) ;
    public final void rule__AdditionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:552:1: ( ( ( rule__AdditionStatement__Addend2Assignment_4 ) ) )
            // InternalArithmetic.g:553:1: ( ( rule__AdditionStatement__Addend2Assignment_4 ) )
            {
            // InternalArithmetic.g:553:1: ( ( rule__AdditionStatement__Addend2Assignment_4 ) )
            // InternalArithmetic.g:554:2: ( rule__AdditionStatement__Addend2Assignment_4 )
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend2Assignment_4()); 
            // InternalArithmetic.g:555:2: ( rule__AdditionStatement__Addend2Assignment_4 )
            // InternalArithmetic.g:555:3: rule__AdditionStatement__Addend2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Addend2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdditionStatementAccess().getAddend2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__4__Impl"


    // $ANTLR start "rule__AdditionStatement__Group__5"
    // InternalArithmetic.g:563:1: rule__AdditionStatement__Group__5 : rule__AdditionStatement__Group__5__Impl ;
    public final void rule__AdditionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:567:1: ( rule__AdditionStatement__Group__5__Impl )
            // InternalArithmetic.g:568:2: rule__AdditionStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__5"


    // $ANTLR start "rule__AdditionStatement__Group__5__Impl"
    // InternalArithmetic.g:574:1: rule__AdditionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__AdditionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:578:1: ( ( ')' ) )
            // InternalArithmetic.g:579:1: ( ')' )
            {
            // InternalArithmetic.g:579:1: ( ')' )
            // InternalArithmetic.g:580:2: ')'
            {
             before(grammarAccess.getAdditionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAdditionStatementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Group__5__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__0"
    // InternalArithmetic.g:590:1: rule__SubtractionStatement__Group__0 : rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1 ;
    public final void rule__SubtractionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:594:1: ( rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1 )
            // InternalArithmetic.g:595:2: rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SubtractionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__0"


    // $ANTLR start "rule__SubtractionStatement__Group__0__Impl"
    // InternalArithmetic.g:602:1: rule__SubtractionStatement__Group__0__Impl : ( 'subtract' ) ;
    public final void rule__SubtractionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:606:1: ( ( 'subtract' ) )
            // InternalArithmetic.g:607:1: ( 'subtract' )
            {
            // InternalArithmetic.g:607:1: ( 'subtract' )
            // InternalArithmetic.g:608:2: 'subtract'
            {
             before(grammarAccess.getSubtractionStatementAccess().getSubtractKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubtractionStatementAccess().getSubtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__0__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__1"
    // InternalArithmetic.g:617:1: rule__SubtractionStatement__Group__1 : rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2 ;
    public final void rule__SubtractionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:621:1: ( rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2 )
            // InternalArithmetic.g:622:2: rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubtractionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__1"


    // $ANTLR start "rule__SubtractionStatement__Group__1__Impl"
    // InternalArithmetic.g:629:1: rule__SubtractionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SubtractionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:633:1: ( ( '(' ) )
            // InternalArithmetic.g:634:1: ( '(' )
            {
            // InternalArithmetic.g:634:1: ( '(' )
            // InternalArithmetic.g:635:2: '('
            {
             before(grammarAccess.getSubtractionStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubtractionStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__1__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__2"
    // InternalArithmetic.g:644:1: rule__SubtractionStatement__Group__2 : rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3 ;
    public final void rule__SubtractionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:648:1: ( rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3 )
            // InternalArithmetic.g:649:2: rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubtractionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__2"


    // $ANTLR start "rule__SubtractionStatement__Group__2__Impl"
    // InternalArithmetic.g:656:1: rule__SubtractionStatement__Group__2__Impl : ( ( rule__SubtractionStatement__MinuendAssignment_2 ) ) ;
    public final void rule__SubtractionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:660:1: ( ( ( rule__SubtractionStatement__MinuendAssignment_2 ) ) )
            // InternalArithmetic.g:661:1: ( ( rule__SubtractionStatement__MinuendAssignment_2 ) )
            {
            // InternalArithmetic.g:661:1: ( ( rule__SubtractionStatement__MinuendAssignment_2 ) )
            // InternalArithmetic.g:662:2: ( rule__SubtractionStatement__MinuendAssignment_2 )
            {
             before(grammarAccess.getSubtractionStatementAccess().getMinuendAssignment_2()); 
            // InternalArithmetic.g:663:2: ( rule__SubtractionStatement__MinuendAssignment_2 )
            // InternalArithmetic.g:663:3: rule__SubtractionStatement__MinuendAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__MinuendAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionStatementAccess().getMinuendAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__2__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__3"
    // InternalArithmetic.g:671:1: rule__SubtractionStatement__Group__3 : rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4 ;
    public final void rule__SubtractionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:675:1: ( rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4 )
            // InternalArithmetic.g:676:2: rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SubtractionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__3"


    // $ANTLR start "rule__SubtractionStatement__Group__3__Impl"
    // InternalArithmetic.g:683:1: rule__SubtractionStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__SubtractionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:687:1: ( ( ',' ) )
            // InternalArithmetic.g:688:1: ( ',' )
            {
            // InternalArithmetic.g:688:1: ( ',' )
            // InternalArithmetic.g:689:2: ','
            {
             before(grammarAccess.getSubtractionStatementAccess().getCommaKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubtractionStatementAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__3__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__4"
    // InternalArithmetic.g:698:1: rule__SubtractionStatement__Group__4 : rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5 ;
    public final void rule__SubtractionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:702:1: ( rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5 )
            // InternalArithmetic.g:703:2: rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SubtractionStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__4"


    // $ANTLR start "rule__SubtractionStatement__Group__4__Impl"
    // InternalArithmetic.g:710:1: rule__SubtractionStatement__Group__4__Impl : ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) ) ;
    public final void rule__SubtractionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:714:1: ( ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) ) )
            // InternalArithmetic.g:715:1: ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) )
            {
            // InternalArithmetic.g:715:1: ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) )
            // InternalArithmetic.g:716:2: ( rule__SubtractionStatement__SubtrahendAssignment_4 )
            {
             before(grammarAccess.getSubtractionStatementAccess().getSubtrahendAssignment_4()); 
            // InternalArithmetic.g:717:2: ( rule__SubtractionStatement__SubtrahendAssignment_4 )
            // InternalArithmetic.g:717:3: rule__SubtractionStatement__SubtrahendAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__SubtrahendAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionStatementAccess().getSubtrahendAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__4__Impl"


    // $ANTLR start "rule__SubtractionStatement__Group__5"
    // InternalArithmetic.g:725:1: rule__SubtractionStatement__Group__5 : rule__SubtractionStatement__Group__5__Impl ;
    public final void rule__SubtractionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:729:1: ( rule__SubtractionStatement__Group__5__Impl )
            // InternalArithmetic.g:730:2: rule__SubtractionStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubtractionStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__5"


    // $ANTLR start "rule__SubtractionStatement__Group__5__Impl"
    // InternalArithmetic.g:736:1: rule__SubtractionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__SubtractionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:740:1: ( ( ')' ) )
            // InternalArithmetic.g:741:1: ( ')' )
            {
            // InternalArithmetic.g:741:1: ( ')' )
            // InternalArithmetic.g:742:2: ')'
            {
             before(grammarAccess.getSubtractionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSubtractionStatementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__Group__5__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__0"
    // InternalArithmetic.g:752:1: rule__MultiplicationStatement__Group__0 : rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1 ;
    public final void rule__MultiplicationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:756:1: ( rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1 )
            // InternalArithmetic.g:757:2: rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MultiplicationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__0"


    // $ANTLR start "rule__MultiplicationStatement__Group__0__Impl"
    // InternalArithmetic.g:764:1: rule__MultiplicationStatement__Group__0__Impl : ( 'multiply' ) ;
    public final void rule__MultiplicationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:768:1: ( ( 'multiply' ) )
            // InternalArithmetic.g:769:1: ( 'multiply' )
            {
            // InternalArithmetic.g:769:1: ( 'multiply' )
            // InternalArithmetic.g:770:2: 'multiply'
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplyKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMultiplicationStatementAccess().getMultiplyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__1"
    // InternalArithmetic.g:779:1: rule__MultiplicationStatement__Group__1 : rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2 ;
    public final void rule__MultiplicationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:783:1: ( rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2 )
            // InternalArithmetic.g:784:2: rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiplicationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__1"


    // $ANTLR start "rule__MultiplicationStatement__Group__1__Impl"
    // InternalArithmetic.g:791:1: rule__MultiplicationStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MultiplicationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:795:1: ( ( '(' ) )
            // InternalArithmetic.g:796:1: ( '(' )
            {
            // InternalArithmetic.g:796:1: ( '(' )
            // InternalArithmetic.g:797:2: '('
            {
             before(grammarAccess.getMultiplicationStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMultiplicationStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__2"
    // InternalArithmetic.g:806:1: rule__MultiplicationStatement__Group__2 : rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3 ;
    public final void rule__MultiplicationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:810:1: ( rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3 )
            // InternalArithmetic.g:811:2: rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MultiplicationStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__2"


    // $ANTLR start "rule__MultiplicationStatement__Group__2__Impl"
    // InternalArithmetic.g:818:1: rule__MultiplicationStatement__Group__2__Impl : ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) ) ;
    public final void rule__MultiplicationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:822:1: ( ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) ) )
            // InternalArithmetic.g:823:1: ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) )
            {
            // InternalArithmetic.g:823:1: ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) )
            // InternalArithmetic.g:824:2: ( rule__MultiplicationStatement__Multiplier1Assignment_2 )
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier1Assignment_2()); 
            // InternalArithmetic.g:825:2: ( rule__MultiplicationStatement__Multiplier1Assignment_2 )
            // InternalArithmetic.g:825:3: rule__MultiplicationStatement__Multiplier1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Multiplier1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationStatementAccess().getMultiplier1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__3"
    // InternalArithmetic.g:833:1: rule__MultiplicationStatement__Group__3 : rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4 ;
    public final void rule__MultiplicationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:837:1: ( rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4 )
            // InternalArithmetic.g:838:2: rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__MultiplicationStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__3"


    // $ANTLR start "rule__MultiplicationStatement__Group__3__Impl"
    // InternalArithmetic.g:845:1: rule__MultiplicationStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__MultiplicationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:849:1: ( ( ',' ) )
            // InternalArithmetic.g:850:1: ( ',' )
            {
            // InternalArithmetic.g:850:1: ( ',' )
            // InternalArithmetic.g:851:2: ','
            {
             before(grammarAccess.getMultiplicationStatementAccess().getCommaKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMultiplicationStatementAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__3__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__4"
    // InternalArithmetic.g:860:1: rule__MultiplicationStatement__Group__4 : rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5 ;
    public final void rule__MultiplicationStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:864:1: ( rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5 )
            // InternalArithmetic.g:865:2: rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MultiplicationStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__4"


    // $ANTLR start "rule__MultiplicationStatement__Group__4__Impl"
    // InternalArithmetic.g:872:1: rule__MultiplicationStatement__Group__4__Impl : ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) ) ;
    public final void rule__MultiplicationStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:876:1: ( ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) ) )
            // InternalArithmetic.g:877:1: ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) )
            {
            // InternalArithmetic.g:877:1: ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) )
            // InternalArithmetic.g:878:2: ( rule__MultiplicationStatement__Multiplier2Assignment_4 )
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier2Assignment_4()); 
            // InternalArithmetic.g:879:2: ( rule__MultiplicationStatement__Multiplier2Assignment_4 )
            // InternalArithmetic.g:879:3: rule__MultiplicationStatement__Multiplier2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Multiplier2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationStatementAccess().getMultiplier2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__4__Impl"


    // $ANTLR start "rule__MultiplicationStatement__Group__5"
    // InternalArithmetic.g:887:1: rule__MultiplicationStatement__Group__5 : rule__MultiplicationStatement__Group__5__Impl ;
    public final void rule__MultiplicationStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:891:1: ( rule__MultiplicationStatement__Group__5__Impl )
            // InternalArithmetic.g:892:2: rule__MultiplicationStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__5"


    // $ANTLR start "rule__MultiplicationStatement__Group__5__Impl"
    // InternalArithmetic.g:898:1: rule__MultiplicationStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__MultiplicationStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:902:1: ( ( ')' ) )
            // InternalArithmetic.g:903:1: ( ')' )
            {
            // InternalArithmetic.g:903:1: ( ')' )
            // InternalArithmetic.g:904:2: ')'
            {
             before(grammarAccess.getMultiplicationStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMultiplicationStatementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Group__5__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__0"
    // InternalArithmetic.g:914:1: rule__DivisionStatement__Group__0 : rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1 ;
    public final void rule__DivisionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:918:1: ( rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1 )
            // InternalArithmetic.g:919:2: rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DivisionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__0"


    // $ANTLR start "rule__DivisionStatement__Group__0__Impl"
    // InternalArithmetic.g:926:1: rule__DivisionStatement__Group__0__Impl : ( 'divide' ) ;
    public final void rule__DivisionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:930:1: ( ( 'divide' ) )
            // InternalArithmetic.g:931:1: ( 'divide' )
            {
            // InternalArithmetic.g:931:1: ( 'divide' )
            // InternalArithmetic.g:932:2: 'divide'
            {
             before(grammarAccess.getDivisionStatementAccess().getDivideKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDivisionStatementAccess().getDivideKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__0__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__1"
    // InternalArithmetic.g:941:1: rule__DivisionStatement__Group__1 : rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2 ;
    public final void rule__DivisionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:945:1: ( rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2 )
            // InternalArithmetic.g:946:2: rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DivisionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__1"


    // $ANTLR start "rule__DivisionStatement__Group__1__Impl"
    // InternalArithmetic.g:953:1: rule__DivisionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__DivisionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:957:1: ( ( '(' ) )
            // InternalArithmetic.g:958:1: ( '(' )
            {
            // InternalArithmetic.g:958:1: ( '(' )
            // InternalArithmetic.g:959:2: '('
            {
             before(grammarAccess.getDivisionStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDivisionStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__1__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__2"
    // InternalArithmetic.g:968:1: rule__DivisionStatement__Group__2 : rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3 ;
    public final void rule__DivisionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:972:1: ( rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3 )
            // InternalArithmetic.g:973:2: rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DivisionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__2"


    // $ANTLR start "rule__DivisionStatement__Group__2__Impl"
    // InternalArithmetic.g:980:1: rule__DivisionStatement__Group__2__Impl : ( ( rule__DivisionStatement__DividendAssignment_2 ) ) ;
    public final void rule__DivisionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:984:1: ( ( ( rule__DivisionStatement__DividendAssignment_2 ) ) )
            // InternalArithmetic.g:985:1: ( ( rule__DivisionStatement__DividendAssignment_2 ) )
            {
            // InternalArithmetic.g:985:1: ( ( rule__DivisionStatement__DividendAssignment_2 ) )
            // InternalArithmetic.g:986:2: ( rule__DivisionStatement__DividendAssignment_2 )
            {
             before(grammarAccess.getDivisionStatementAccess().getDividendAssignment_2()); 
            // InternalArithmetic.g:987:2: ( rule__DivisionStatement__DividendAssignment_2 )
            // InternalArithmetic.g:987:3: rule__DivisionStatement__DividendAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DivisionStatement__DividendAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDivisionStatementAccess().getDividendAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__2__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__3"
    // InternalArithmetic.g:995:1: rule__DivisionStatement__Group__3 : rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4 ;
    public final void rule__DivisionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:999:1: ( rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4 )
            // InternalArithmetic.g:1000:2: rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DivisionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__3"


    // $ANTLR start "rule__DivisionStatement__Group__3__Impl"
    // InternalArithmetic.g:1007:1: rule__DivisionStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__DivisionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1011:1: ( ( ',' ) )
            // InternalArithmetic.g:1012:1: ( ',' )
            {
            // InternalArithmetic.g:1012:1: ( ',' )
            // InternalArithmetic.g:1013:2: ','
            {
             before(grammarAccess.getDivisionStatementAccess().getCommaKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDivisionStatementAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__3__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__4"
    // InternalArithmetic.g:1022:1: rule__DivisionStatement__Group__4 : rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5 ;
    public final void rule__DivisionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1026:1: ( rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5 )
            // InternalArithmetic.g:1027:2: rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DivisionStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__4"


    // $ANTLR start "rule__DivisionStatement__Group__4__Impl"
    // InternalArithmetic.g:1034:1: rule__DivisionStatement__Group__4__Impl : ( ( rule__DivisionStatement__DivisorAssignment_4 ) ) ;
    public final void rule__DivisionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1038:1: ( ( ( rule__DivisionStatement__DivisorAssignment_4 ) ) )
            // InternalArithmetic.g:1039:1: ( ( rule__DivisionStatement__DivisorAssignment_4 ) )
            {
            // InternalArithmetic.g:1039:1: ( ( rule__DivisionStatement__DivisorAssignment_4 ) )
            // InternalArithmetic.g:1040:2: ( rule__DivisionStatement__DivisorAssignment_4 )
            {
             before(grammarAccess.getDivisionStatementAccess().getDivisorAssignment_4()); 
            // InternalArithmetic.g:1041:2: ( rule__DivisionStatement__DivisorAssignment_4 )
            // InternalArithmetic.g:1041:3: rule__DivisionStatement__DivisorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DivisionStatement__DivisorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDivisionStatementAccess().getDivisorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__4__Impl"


    // $ANTLR start "rule__DivisionStatement__Group__5"
    // InternalArithmetic.g:1049:1: rule__DivisionStatement__Group__5 : rule__DivisionStatement__Group__5__Impl ;
    public final void rule__DivisionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1053:1: ( rule__DivisionStatement__Group__5__Impl )
            // InternalArithmetic.g:1054:2: rule__DivisionStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DivisionStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__5"


    // $ANTLR start "rule__DivisionStatement__Group__5__Impl"
    // InternalArithmetic.g:1060:1: rule__DivisionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__DivisionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1064:1: ( ( ')' ) )
            // InternalArithmetic.g:1065:1: ( ')' )
            {
            // InternalArithmetic.g:1065:1: ( ')' )
            // InternalArithmetic.g:1066:2: ')'
            {
             before(grammarAccess.getDivisionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDivisionStatementAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__Group__5__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalArithmetic.g:1076:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1080:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalArithmetic.g:1081:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalArithmetic.g:1088:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1092:1: ( ( ( RULE_INT )? ) )
            // InternalArithmetic.g:1093:1: ( ( RULE_INT )? )
            {
            // InternalArithmetic.g:1093:1: ( ( RULE_INT )? )
            // InternalArithmetic.g:1094:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalArithmetic.g:1095:2: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArithmetic.g:1095:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalArithmetic.g:1103:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1107:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalArithmetic.g:1108:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalArithmetic.g:1115:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1119:1: ( ( '.' ) )
            // InternalArithmetic.g:1120:1: ( '.' )
            {
            // InternalArithmetic.g:1120:1: ( '.' )
            // InternalArithmetic.g:1121:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalArithmetic.g:1130:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1134:1: ( rule__REAL__Group__2__Impl )
            // InternalArithmetic.g:1135:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalArithmetic.g:1141:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1145:1: ( ( RULE_INT ) )
            // InternalArithmetic.g:1146:1: ( RULE_INT )
            {
            // InternalArithmetic.g:1146:1: ( RULE_INT )
            // InternalArithmetic.g:1147:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__ArithmeticsProgram__StatesAssignment"
    // InternalArithmetic.g:1157:1: rule__ArithmeticsProgram__StatesAssignment : ( ruleStatement ) ;
    public final void rule__ArithmeticsProgram__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1161:1: ( ( ruleStatement ) )
            // InternalArithmetic.g:1162:2: ( ruleStatement )
            {
            // InternalArithmetic.g:1162:2: ( ruleStatement )
            // InternalArithmetic.g:1163:3: ruleStatement
            {
             before(grammarAccess.getArithmeticsProgramAccess().getStatesStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getArithmeticsProgramAccess().getStatesStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticsProgram__StatesAssignment"


    // $ANTLR start "rule__AdditionStatement__Addend1Assignment_2"
    // InternalArithmetic.g:1172:1: rule__AdditionStatement__Addend1Assignment_2 : ( ruleExpression ) ;
    public final void rule__AdditionStatement__Addend1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1176:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1177:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1177:2: ( ruleExpression )
            // InternalArithmetic.g:1178:3: ruleExpression
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAdditionStatementAccess().getAddend1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Addend1Assignment_2"


    // $ANTLR start "rule__AdditionStatement__OperatorAssignment_3"
    // InternalArithmetic.g:1187:1: rule__AdditionStatement__OperatorAssignment_3 : ( ( ',' ) ) ;
    public final void rule__AdditionStatement__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1191:1: ( ( ( ',' ) ) )
            // InternalArithmetic.g:1192:2: ( ( ',' ) )
            {
            // InternalArithmetic.g:1192:2: ( ( ',' ) )
            // InternalArithmetic.g:1193:3: ( ',' )
            {
             before(grammarAccess.getAdditionStatementAccess().getOperatorCommaKeyword_3_0()); 
            // InternalArithmetic.g:1194:3: ( ',' )
            // InternalArithmetic.g:1195:4: ','
            {
             before(grammarAccess.getAdditionStatementAccess().getOperatorCommaKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAdditionStatementAccess().getOperatorCommaKeyword_3_0()); 

            }

             after(grammarAccess.getAdditionStatementAccess().getOperatorCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__OperatorAssignment_3"


    // $ANTLR start "rule__AdditionStatement__Addend2Assignment_4"
    // InternalArithmetic.g:1206:1: rule__AdditionStatement__Addend2Assignment_4 : ( ruleExpression ) ;
    public final void rule__AdditionStatement__Addend2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1210:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1211:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1211:2: ( ruleExpression )
            // InternalArithmetic.g:1212:3: ruleExpression
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAdditionStatementAccess().getAddend2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionStatement__Addend2Assignment_4"


    // $ANTLR start "rule__SubtractionStatement__MinuendAssignment_2"
    // InternalArithmetic.g:1221:1: rule__SubtractionStatement__MinuendAssignment_2 : ( ruleExpression ) ;
    public final void rule__SubtractionStatement__MinuendAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1225:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1226:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1226:2: ( ruleExpression )
            // InternalArithmetic.g:1227:3: ruleExpression
            {
             before(grammarAccess.getSubtractionStatementAccess().getMinuendExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSubtractionStatementAccess().getMinuendExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__MinuendAssignment_2"


    // $ANTLR start "rule__SubtractionStatement__SubtrahendAssignment_4"
    // InternalArithmetic.g:1236:1: rule__SubtractionStatement__SubtrahendAssignment_4 : ( ruleExpression ) ;
    public final void rule__SubtractionStatement__SubtrahendAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1240:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1241:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1241:2: ( ruleExpression )
            // InternalArithmetic.g:1242:3: ruleExpression
            {
             before(grammarAccess.getSubtractionStatementAccess().getSubtrahendExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSubtractionStatementAccess().getSubtrahendExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubtractionStatement__SubtrahendAssignment_4"


    // $ANTLR start "rule__MultiplicationStatement__Multiplier1Assignment_2"
    // InternalArithmetic.g:1251:1: rule__MultiplicationStatement__Multiplier1Assignment_2 : ( ruleExpression ) ;
    public final void rule__MultiplicationStatement__Multiplier1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1255:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1256:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1256:2: ( ruleExpression )
            // InternalArithmetic.g:1257:3: ruleExpression
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier1ExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationStatementAccess().getMultiplier1ExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Multiplier1Assignment_2"


    // $ANTLR start "rule__MultiplicationStatement__Multiplier2Assignment_4"
    // InternalArithmetic.g:1266:1: rule__MultiplicationStatement__Multiplier2Assignment_4 : ( ruleExpression ) ;
    public final void rule__MultiplicationStatement__Multiplier2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1270:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1271:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1271:2: ( ruleExpression )
            // InternalArithmetic.g:1272:3: ruleExpression
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier2ExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationStatementAccess().getMultiplier2ExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationStatement__Multiplier2Assignment_4"


    // $ANTLR start "rule__DivisionStatement__DividendAssignment_2"
    // InternalArithmetic.g:1281:1: rule__DivisionStatement__DividendAssignment_2 : ( ruleExpression ) ;
    public final void rule__DivisionStatement__DividendAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1285:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1286:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1286:2: ( ruleExpression )
            // InternalArithmetic.g:1287:3: ruleExpression
            {
             before(grammarAccess.getDivisionStatementAccess().getDividendExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDivisionStatementAccess().getDividendExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__DividendAssignment_2"


    // $ANTLR start "rule__DivisionStatement__DivisorAssignment_4"
    // InternalArithmetic.g:1296:1: rule__DivisionStatement__DivisorAssignment_4 : ( ruleExpression ) ;
    public final void rule__DivisionStatement__DivisorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1300:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1301:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1301:2: ( ruleExpression )
            // InternalArithmetic.g:1302:3: ruleExpression
            {
             before(grammarAccess.getDivisionStatementAccess().getDivisorExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDivisionStatementAccess().getDivisorExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DivisionStatement__DivisorAssignment_4"


    // $ANTLR start "rule__IntLiteral__NumAssignment"
    // InternalArithmetic.g:1311:1: rule__IntLiteral__NumAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1315:1: ( ( RULE_INT ) )
            // InternalArithmetic.g:1316:2: ( RULE_INT )
            {
            // InternalArithmetic.g:1316:2: ( RULE_INT )
            // InternalArithmetic.g:1317:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getNumINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getNumINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__NumAssignment"


    // $ANTLR start "rule__RealLiteral__NumAssignment"
    // InternalArithmetic.g:1326:1: rule__RealLiteral__NumAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1330:1: ( ( ruleREAL ) )
            // InternalArithmetic.g:1331:2: ( ruleREAL )
            {
            // InternalArithmetic.g:1331:2: ( ruleREAL )
            // InternalArithmetic.g:1332:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getNumREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getNumREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__NumAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}