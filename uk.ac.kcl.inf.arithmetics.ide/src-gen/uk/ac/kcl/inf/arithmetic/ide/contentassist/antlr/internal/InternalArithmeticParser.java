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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'add'", "'('", "','", "')'", "'subtract'", "'multiply'", "'divide'", "'power'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRulePowerStatement"
    // InternalArithmetic.g:228:1: entryRulePowerStatement : rulePowerStatement EOF ;
    public final void entryRulePowerStatement() throws RecognitionException {
        try {
            // InternalArithmetic.g:229:1: ( rulePowerStatement EOF )
            // InternalArithmetic.g:230:1: rulePowerStatement EOF
            {
             before(grammarAccess.getPowerStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePowerStatement();

            state._fsp--;

             after(grammarAccess.getPowerStatementRule()); 
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
    // $ANTLR end "entryRulePowerStatement"


    // $ANTLR start "rulePowerStatement"
    // InternalArithmetic.g:237:1: rulePowerStatement : ( ( rule__PowerStatement__Group__0 ) ) ;
    public final void rulePowerStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:241:2: ( ( ( rule__PowerStatement__Group__0 ) ) )
            // InternalArithmetic.g:242:2: ( ( rule__PowerStatement__Group__0 ) )
            {
            // InternalArithmetic.g:242:2: ( ( rule__PowerStatement__Group__0 ) )
            // InternalArithmetic.g:243:3: ( rule__PowerStatement__Group__0 )
            {
             before(grammarAccess.getPowerStatementAccess().getGroup()); 
            // InternalArithmetic.g:244:3: ( rule__PowerStatement__Group__0 )
            // InternalArithmetic.g:244:4: rule__PowerStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerStatementAccess().getGroup()); 

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
    // $ANTLR end "rulePowerStatement"


    // $ANTLR start "entryRuleNumberExpression"
    // InternalArithmetic.g:253:1: entryRuleNumberExpression : ruleNumberExpression EOF ;
    public final void entryRuleNumberExpression() throws RecognitionException {
        try {
            // InternalArithmetic.g:254:1: ( ruleNumberExpression EOF )
            // InternalArithmetic.g:255:1: ruleNumberExpression EOF
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
    // InternalArithmetic.g:262:1: ruleNumberExpression : ( ( rule__NumberExpression__Alternatives ) ) ;
    public final void ruleNumberExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:266:2: ( ( ( rule__NumberExpression__Alternatives ) ) )
            // InternalArithmetic.g:267:2: ( ( rule__NumberExpression__Alternatives ) )
            {
            // InternalArithmetic.g:267:2: ( ( rule__NumberExpression__Alternatives ) )
            // InternalArithmetic.g:268:3: ( rule__NumberExpression__Alternatives )
            {
             before(grammarAccess.getNumberExpressionAccess().getAlternatives()); 
            // InternalArithmetic.g:269:3: ( rule__NumberExpression__Alternatives )
            // InternalArithmetic.g:269:4: rule__NumberExpression__Alternatives
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
    // InternalArithmetic.g:278:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalArithmetic.g:279:1: ( ruleIntLiteral EOF )
            // InternalArithmetic.g:280:1: ruleIntLiteral EOF
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
    // InternalArithmetic.g:287:1: ruleIntLiteral : ( ( rule__IntLiteral__NumAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:291:2: ( ( ( rule__IntLiteral__NumAssignment ) ) )
            // InternalArithmetic.g:292:2: ( ( rule__IntLiteral__NumAssignment ) )
            {
            // InternalArithmetic.g:292:2: ( ( rule__IntLiteral__NumAssignment ) )
            // InternalArithmetic.g:293:3: ( rule__IntLiteral__NumAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getNumAssignment()); 
            // InternalArithmetic.g:294:3: ( rule__IntLiteral__NumAssignment )
            // InternalArithmetic.g:294:4: rule__IntLiteral__NumAssignment
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
    // InternalArithmetic.g:303:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalArithmetic.g:304:1: ( ruleRealLiteral EOF )
            // InternalArithmetic.g:305:1: ruleRealLiteral EOF
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
    // InternalArithmetic.g:312:1: ruleRealLiteral : ( ( rule__RealLiteral__NumAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:316:2: ( ( ( rule__RealLiteral__NumAssignment ) ) )
            // InternalArithmetic.g:317:2: ( ( rule__RealLiteral__NumAssignment ) )
            {
            // InternalArithmetic.g:317:2: ( ( rule__RealLiteral__NumAssignment ) )
            // InternalArithmetic.g:318:3: ( rule__RealLiteral__NumAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getNumAssignment()); 
            // InternalArithmetic.g:319:3: ( rule__RealLiteral__NumAssignment )
            // InternalArithmetic.g:319:4: rule__RealLiteral__NumAssignment
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
    // InternalArithmetic.g:328:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalArithmetic.g:332:1: ( ruleREAL EOF )
            // InternalArithmetic.g:333:1: ruleREAL EOF
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
    // InternalArithmetic.g:343:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:348:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalArithmetic.g:349:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalArithmetic.g:349:2: ( ( rule__REAL__Group__0 ) )
            // InternalArithmetic.g:350:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalArithmetic.g:351:3: ( rule__REAL__Group__0 )
            // InternalArithmetic.g:351:4: rule__REAL__Group__0
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
    // InternalArithmetic.g:360:1: rule__Statement__Alternatives : ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( rulePowerStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:364:1: ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( rulePowerStatement ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
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
            case 18:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArithmetic.g:365:2: ( ruleAdditionStatement )
                    {
                    // InternalArithmetic.g:365:2: ( ruleAdditionStatement )
                    // InternalArithmetic.g:366:3: ruleAdditionStatement
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
                    // InternalArithmetic.g:371:2: ( ruleSubtractionStatement )
                    {
                    // InternalArithmetic.g:371:2: ( ruleSubtractionStatement )
                    // InternalArithmetic.g:372:3: ruleSubtractionStatement
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
                    // InternalArithmetic.g:377:2: ( ruleMultiplicationStatement )
                    {
                    // InternalArithmetic.g:377:2: ( ruleMultiplicationStatement )
                    // InternalArithmetic.g:378:3: ruleMultiplicationStatement
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
                    // InternalArithmetic.g:383:2: ( ruleDivisionStatement )
                    {
                    // InternalArithmetic.g:383:2: ( ruleDivisionStatement )
                    // InternalArithmetic.g:384:3: ruleDivisionStatement
                    {
                     before(grammarAccess.getStatementAccess().getDivisionStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDivisionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDivisionStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArithmetic.g:389:2: ( rulePowerStatement )
                    {
                    // InternalArithmetic.g:389:2: ( rulePowerStatement )
                    // InternalArithmetic.g:390:3: rulePowerStatement
                    {
                     before(grammarAccess.getStatementAccess().getPowerStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePowerStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPowerStatementParserRuleCall_4()); 

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
    // InternalArithmetic.g:399:1: rule__Expression__Alternatives : ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( rulePowerStatement ) | ( ruleNumberExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:403:1: ( ( ruleAdditionStatement ) | ( ruleSubtractionStatement ) | ( ruleMultiplicationStatement ) | ( ruleDivisionStatement ) | ( rulePowerStatement ) | ( ruleNumberExpression ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 15:
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
            case 18:
                {
                alt3=5;
                }
                break;
            case RULE_INT:
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalArithmetic.g:404:2: ( ruleAdditionStatement )
                    {
                    // InternalArithmetic.g:404:2: ( ruleAdditionStatement )
                    // InternalArithmetic.g:405:3: ruleAdditionStatement
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
                    // InternalArithmetic.g:410:2: ( ruleSubtractionStatement )
                    {
                    // InternalArithmetic.g:410:2: ( ruleSubtractionStatement )
                    // InternalArithmetic.g:411:3: ruleSubtractionStatement
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
                    // InternalArithmetic.g:416:2: ( ruleMultiplicationStatement )
                    {
                    // InternalArithmetic.g:416:2: ( ruleMultiplicationStatement )
                    // InternalArithmetic.g:417:3: ruleMultiplicationStatement
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
                    // InternalArithmetic.g:422:2: ( ruleDivisionStatement )
                    {
                    // InternalArithmetic.g:422:2: ( ruleDivisionStatement )
                    // InternalArithmetic.g:423:3: ruleDivisionStatement
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
                    // InternalArithmetic.g:428:2: ( rulePowerStatement )
                    {
                    // InternalArithmetic.g:428:2: ( rulePowerStatement )
                    // InternalArithmetic.g:429:3: rulePowerStatement
                    {
                     before(grammarAccess.getExpressionAccess().getPowerStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePowerStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPowerStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalArithmetic.g:434:2: ( ruleNumberExpression )
                    {
                    // InternalArithmetic.g:434:2: ( ruleNumberExpression )
                    // InternalArithmetic.g:435:3: ruleNumberExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_5()); 

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
    // InternalArithmetic.g:444:1: rule__NumberExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleRealLiteral ) );
    public final void rule__NumberExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:448:1: ( ( ruleIntLiteral ) | ( ruleRealLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||(LA4_1>=13 && LA4_1<=14)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArithmetic.g:449:2: ( ruleIntLiteral )
                    {
                    // InternalArithmetic.g:449:2: ( ruleIntLiteral )
                    // InternalArithmetic.g:450:3: ruleIntLiteral
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
                    // InternalArithmetic.g:455:2: ( ruleRealLiteral )
                    {
                    // InternalArithmetic.g:455:2: ( ruleRealLiteral )
                    // InternalArithmetic.g:456:3: ruleRealLiteral
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
    // InternalArithmetic.g:465:1: rule__AdditionStatement__Group__0 : rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1 ;
    public final void rule__AdditionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:469:1: ( rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1 )
            // InternalArithmetic.g:470:2: rule__AdditionStatement__Group__0__Impl rule__AdditionStatement__Group__1
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
    // InternalArithmetic.g:477:1: rule__AdditionStatement__Group__0__Impl : ( 'add' ) ;
    public final void rule__AdditionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:481:1: ( ( 'add' ) )
            // InternalArithmetic.g:482:1: ( 'add' )
            {
            // InternalArithmetic.g:482:1: ( 'add' )
            // InternalArithmetic.g:483:2: 'add'
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
    // InternalArithmetic.g:492:1: rule__AdditionStatement__Group__1 : rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2 ;
    public final void rule__AdditionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:496:1: ( rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2 )
            // InternalArithmetic.g:497:2: rule__AdditionStatement__Group__1__Impl rule__AdditionStatement__Group__2
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
    // InternalArithmetic.g:504:1: rule__AdditionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__AdditionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:508:1: ( ( '(' ) )
            // InternalArithmetic.g:509:1: ( '(' )
            {
            // InternalArithmetic.g:509:1: ( '(' )
            // InternalArithmetic.g:510:2: '('
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
    // InternalArithmetic.g:519:1: rule__AdditionStatement__Group__2 : rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3 ;
    public final void rule__AdditionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:523:1: ( rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3 )
            // InternalArithmetic.g:524:2: rule__AdditionStatement__Group__2__Impl rule__AdditionStatement__Group__3
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
    // InternalArithmetic.g:531:1: rule__AdditionStatement__Group__2__Impl : ( ( rule__AdditionStatement__Addend1Assignment_2 ) ) ;
    public final void rule__AdditionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:535:1: ( ( ( rule__AdditionStatement__Addend1Assignment_2 ) ) )
            // InternalArithmetic.g:536:1: ( ( rule__AdditionStatement__Addend1Assignment_2 ) )
            {
            // InternalArithmetic.g:536:1: ( ( rule__AdditionStatement__Addend1Assignment_2 ) )
            // InternalArithmetic.g:537:2: ( rule__AdditionStatement__Addend1Assignment_2 )
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend1Assignment_2()); 
            // InternalArithmetic.g:538:2: ( rule__AdditionStatement__Addend1Assignment_2 )
            // InternalArithmetic.g:538:3: rule__AdditionStatement__Addend1Assignment_2
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
    // InternalArithmetic.g:546:1: rule__AdditionStatement__Group__3 : rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4 ;
    public final void rule__AdditionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:550:1: ( rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4 )
            // InternalArithmetic.g:551:2: rule__AdditionStatement__Group__3__Impl rule__AdditionStatement__Group__4
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
    // InternalArithmetic.g:558:1: rule__AdditionStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__AdditionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:562:1: ( ( ',' ) )
            // InternalArithmetic.g:563:1: ( ',' )
            {
            // InternalArithmetic.g:563:1: ( ',' )
            // InternalArithmetic.g:564:2: ','
            {
             before(grammarAccess.getAdditionStatementAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAdditionStatementAccess().getCommaKeyword_3()); 

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
    // InternalArithmetic.g:573:1: rule__AdditionStatement__Group__4 : rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5 ;
    public final void rule__AdditionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:577:1: ( rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5 )
            // InternalArithmetic.g:578:2: rule__AdditionStatement__Group__4__Impl rule__AdditionStatement__Group__5
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
    // InternalArithmetic.g:585:1: rule__AdditionStatement__Group__4__Impl : ( ( rule__AdditionStatement__Addend2Assignment_4 ) ) ;
    public final void rule__AdditionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:589:1: ( ( ( rule__AdditionStatement__Addend2Assignment_4 ) ) )
            // InternalArithmetic.g:590:1: ( ( rule__AdditionStatement__Addend2Assignment_4 ) )
            {
            // InternalArithmetic.g:590:1: ( ( rule__AdditionStatement__Addend2Assignment_4 ) )
            // InternalArithmetic.g:591:2: ( rule__AdditionStatement__Addend2Assignment_4 )
            {
             before(grammarAccess.getAdditionStatementAccess().getAddend2Assignment_4()); 
            // InternalArithmetic.g:592:2: ( rule__AdditionStatement__Addend2Assignment_4 )
            // InternalArithmetic.g:592:3: rule__AdditionStatement__Addend2Assignment_4
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
    // InternalArithmetic.g:600:1: rule__AdditionStatement__Group__5 : rule__AdditionStatement__Group__5__Impl ;
    public final void rule__AdditionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:604:1: ( rule__AdditionStatement__Group__5__Impl )
            // InternalArithmetic.g:605:2: rule__AdditionStatement__Group__5__Impl
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
    // InternalArithmetic.g:611:1: rule__AdditionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__AdditionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:615:1: ( ( ')' ) )
            // InternalArithmetic.g:616:1: ( ')' )
            {
            // InternalArithmetic.g:616:1: ( ')' )
            // InternalArithmetic.g:617:2: ')'
            {
             before(grammarAccess.getAdditionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArithmetic.g:627:1: rule__SubtractionStatement__Group__0 : rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1 ;
    public final void rule__SubtractionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:631:1: ( rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1 )
            // InternalArithmetic.g:632:2: rule__SubtractionStatement__Group__0__Impl rule__SubtractionStatement__Group__1
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
    // InternalArithmetic.g:639:1: rule__SubtractionStatement__Group__0__Impl : ( 'subtract' ) ;
    public final void rule__SubtractionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:643:1: ( ( 'subtract' ) )
            // InternalArithmetic.g:644:1: ( 'subtract' )
            {
            // InternalArithmetic.g:644:1: ( 'subtract' )
            // InternalArithmetic.g:645:2: 'subtract'
            {
             before(grammarAccess.getSubtractionStatementAccess().getSubtractKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalArithmetic.g:654:1: rule__SubtractionStatement__Group__1 : rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2 ;
    public final void rule__SubtractionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:658:1: ( rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2 )
            // InternalArithmetic.g:659:2: rule__SubtractionStatement__Group__1__Impl rule__SubtractionStatement__Group__2
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
    // InternalArithmetic.g:666:1: rule__SubtractionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SubtractionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:670:1: ( ( '(' ) )
            // InternalArithmetic.g:671:1: ( '(' )
            {
            // InternalArithmetic.g:671:1: ( '(' )
            // InternalArithmetic.g:672:2: '('
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
    // InternalArithmetic.g:681:1: rule__SubtractionStatement__Group__2 : rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3 ;
    public final void rule__SubtractionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:685:1: ( rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3 )
            // InternalArithmetic.g:686:2: rule__SubtractionStatement__Group__2__Impl rule__SubtractionStatement__Group__3
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
    // InternalArithmetic.g:693:1: rule__SubtractionStatement__Group__2__Impl : ( ( rule__SubtractionStatement__MinuendAssignment_2 ) ) ;
    public final void rule__SubtractionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:697:1: ( ( ( rule__SubtractionStatement__MinuendAssignment_2 ) ) )
            // InternalArithmetic.g:698:1: ( ( rule__SubtractionStatement__MinuendAssignment_2 ) )
            {
            // InternalArithmetic.g:698:1: ( ( rule__SubtractionStatement__MinuendAssignment_2 ) )
            // InternalArithmetic.g:699:2: ( rule__SubtractionStatement__MinuendAssignment_2 )
            {
             before(grammarAccess.getSubtractionStatementAccess().getMinuendAssignment_2()); 
            // InternalArithmetic.g:700:2: ( rule__SubtractionStatement__MinuendAssignment_2 )
            // InternalArithmetic.g:700:3: rule__SubtractionStatement__MinuendAssignment_2
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
    // InternalArithmetic.g:708:1: rule__SubtractionStatement__Group__3 : rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4 ;
    public final void rule__SubtractionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:712:1: ( rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4 )
            // InternalArithmetic.g:713:2: rule__SubtractionStatement__Group__3__Impl rule__SubtractionStatement__Group__4
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
    // InternalArithmetic.g:720:1: rule__SubtractionStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__SubtractionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:724:1: ( ( ',' ) )
            // InternalArithmetic.g:725:1: ( ',' )
            {
            // InternalArithmetic.g:725:1: ( ',' )
            // InternalArithmetic.g:726:2: ','
            {
             before(grammarAccess.getSubtractionStatementAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalArithmetic.g:735:1: rule__SubtractionStatement__Group__4 : rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5 ;
    public final void rule__SubtractionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:739:1: ( rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5 )
            // InternalArithmetic.g:740:2: rule__SubtractionStatement__Group__4__Impl rule__SubtractionStatement__Group__5
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
    // InternalArithmetic.g:747:1: rule__SubtractionStatement__Group__4__Impl : ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) ) ;
    public final void rule__SubtractionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:751:1: ( ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) ) )
            // InternalArithmetic.g:752:1: ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) )
            {
            // InternalArithmetic.g:752:1: ( ( rule__SubtractionStatement__SubtrahendAssignment_4 ) )
            // InternalArithmetic.g:753:2: ( rule__SubtractionStatement__SubtrahendAssignment_4 )
            {
             before(grammarAccess.getSubtractionStatementAccess().getSubtrahendAssignment_4()); 
            // InternalArithmetic.g:754:2: ( rule__SubtractionStatement__SubtrahendAssignment_4 )
            // InternalArithmetic.g:754:3: rule__SubtractionStatement__SubtrahendAssignment_4
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
    // InternalArithmetic.g:762:1: rule__SubtractionStatement__Group__5 : rule__SubtractionStatement__Group__5__Impl ;
    public final void rule__SubtractionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:766:1: ( rule__SubtractionStatement__Group__5__Impl )
            // InternalArithmetic.g:767:2: rule__SubtractionStatement__Group__5__Impl
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
    // InternalArithmetic.g:773:1: rule__SubtractionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__SubtractionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:777:1: ( ( ')' ) )
            // InternalArithmetic.g:778:1: ( ')' )
            {
            // InternalArithmetic.g:778:1: ( ')' )
            // InternalArithmetic.g:779:2: ')'
            {
             before(grammarAccess.getSubtractionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArithmetic.g:789:1: rule__MultiplicationStatement__Group__0 : rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1 ;
    public final void rule__MultiplicationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:793:1: ( rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1 )
            // InternalArithmetic.g:794:2: rule__MultiplicationStatement__Group__0__Impl rule__MultiplicationStatement__Group__1
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
    // InternalArithmetic.g:801:1: rule__MultiplicationStatement__Group__0__Impl : ( 'multiply' ) ;
    public final void rule__MultiplicationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:805:1: ( ( 'multiply' ) )
            // InternalArithmetic.g:806:1: ( 'multiply' )
            {
            // InternalArithmetic.g:806:1: ( 'multiply' )
            // InternalArithmetic.g:807:2: 'multiply'
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
    // InternalArithmetic.g:816:1: rule__MultiplicationStatement__Group__1 : rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2 ;
    public final void rule__MultiplicationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:820:1: ( rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2 )
            // InternalArithmetic.g:821:2: rule__MultiplicationStatement__Group__1__Impl rule__MultiplicationStatement__Group__2
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
    // InternalArithmetic.g:828:1: rule__MultiplicationStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MultiplicationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:832:1: ( ( '(' ) )
            // InternalArithmetic.g:833:1: ( '(' )
            {
            // InternalArithmetic.g:833:1: ( '(' )
            // InternalArithmetic.g:834:2: '('
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
    // InternalArithmetic.g:843:1: rule__MultiplicationStatement__Group__2 : rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3 ;
    public final void rule__MultiplicationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:847:1: ( rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3 )
            // InternalArithmetic.g:848:2: rule__MultiplicationStatement__Group__2__Impl rule__MultiplicationStatement__Group__3
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
    // InternalArithmetic.g:855:1: rule__MultiplicationStatement__Group__2__Impl : ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) ) ;
    public final void rule__MultiplicationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:859:1: ( ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) ) )
            // InternalArithmetic.g:860:1: ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) )
            {
            // InternalArithmetic.g:860:1: ( ( rule__MultiplicationStatement__Multiplier1Assignment_2 ) )
            // InternalArithmetic.g:861:2: ( rule__MultiplicationStatement__Multiplier1Assignment_2 )
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier1Assignment_2()); 
            // InternalArithmetic.g:862:2: ( rule__MultiplicationStatement__Multiplier1Assignment_2 )
            // InternalArithmetic.g:862:3: rule__MultiplicationStatement__Multiplier1Assignment_2
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
    // InternalArithmetic.g:870:1: rule__MultiplicationStatement__Group__3 : rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4 ;
    public final void rule__MultiplicationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:874:1: ( rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4 )
            // InternalArithmetic.g:875:2: rule__MultiplicationStatement__Group__3__Impl rule__MultiplicationStatement__Group__4
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
    // InternalArithmetic.g:882:1: rule__MultiplicationStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__MultiplicationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:886:1: ( ( ',' ) )
            // InternalArithmetic.g:887:1: ( ',' )
            {
            // InternalArithmetic.g:887:1: ( ',' )
            // InternalArithmetic.g:888:2: ','
            {
             before(grammarAccess.getMultiplicationStatementAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalArithmetic.g:897:1: rule__MultiplicationStatement__Group__4 : rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5 ;
    public final void rule__MultiplicationStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:901:1: ( rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5 )
            // InternalArithmetic.g:902:2: rule__MultiplicationStatement__Group__4__Impl rule__MultiplicationStatement__Group__5
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
    // InternalArithmetic.g:909:1: rule__MultiplicationStatement__Group__4__Impl : ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) ) ;
    public final void rule__MultiplicationStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:913:1: ( ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) ) )
            // InternalArithmetic.g:914:1: ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) )
            {
            // InternalArithmetic.g:914:1: ( ( rule__MultiplicationStatement__Multiplier2Assignment_4 ) )
            // InternalArithmetic.g:915:2: ( rule__MultiplicationStatement__Multiplier2Assignment_4 )
            {
             before(grammarAccess.getMultiplicationStatementAccess().getMultiplier2Assignment_4()); 
            // InternalArithmetic.g:916:2: ( rule__MultiplicationStatement__Multiplier2Assignment_4 )
            // InternalArithmetic.g:916:3: rule__MultiplicationStatement__Multiplier2Assignment_4
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
    // InternalArithmetic.g:924:1: rule__MultiplicationStatement__Group__5 : rule__MultiplicationStatement__Group__5__Impl ;
    public final void rule__MultiplicationStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:928:1: ( rule__MultiplicationStatement__Group__5__Impl )
            // InternalArithmetic.g:929:2: rule__MultiplicationStatement__Group__5__Impl
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
    // InternalArithmetic.g:935:1: rule__MultiplicationStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__MultiplicationStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:939:1: ( ( ')' ) )
            // InternalArithmetic.g:940:1: ( ')' )
            {
            // InternalArithmetic.g:940:1: ( ')' )
            // InternalArithmetic.g:941:2: ')'
            {
             before(grammarAccess.getMultiplicationStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalArithmetic.g:951:1: rule__DivisionStatement__Group__0 : rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1 ;
    public final void rule__DivisionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:955:1: ( rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1 )
            // InternalArithmetic.g:956:2: rule__DivisionStatement__Group__0__Impl rule__DivisionStatement__Group__1
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
    // InternalArithmetic.g:963:1: rule__DivisionStatement__Group__0__Impl : ( 'divide' ) ;
    public final void rule__DivisionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:967:1: ( ( 'divide' ) )
            // InternalArithmetic.g:968:1: ( 'divide' )
            {
            // InternalArithmetic.g:968:1: ( 'divide' )
            // InternalArithmetic.g:969:2: 'divide'
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
    // InternalArithmetic.g:978:1: rule__DivisionStatement__Group__1 : rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2 ;
    public final void rule__DivisionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:982:1: ( rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2 )
            // InternalArithmetic.g:983:2: rule__DivisionStatement__Group__1__Impl rule__DivisionStatement__Group__2
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
    // InternalArithmetic.g:990:1: rule__DivisionStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__DivisionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:994:1: ( ( '(' ) )
            // InternalArithmetic.g:995:1: ( '(' )
            {
            // InternalArithmetic.g:995:1: ( '(' )
            // InternalArithmetic.g:996:2: '('
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
    // InternalArithmetic.g:1005:1: rule__DivisionStatement__Group__2 : rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3 ;
    public final void rule__DivisionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1009:1: ( rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3 )
            // InternalArithmetic.g:1010:2: rule__DivisionStatement__Group__2__Impl rule__DivisionStatement__Group__3
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
    // InternalArithmetic.g:1017:1: rule__DivisionStatement__Group__2__Impl : ( ( rule__DivisionStatement__DividendAssignment_2 ) ) ;
    public final void rule__DivisionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1021:1: ( ( ( rule__DivisionStatement__DividendAssignment_2 ) ) )
            // InternalArithmetic.g:1022:1: ( ( rule__DivisionStatement__DividendAssignment_2 ) )
            {
            // InternalArithmetic.g:1022:1: ( ( rule__DivisionStatement__DividendAssignment_2 ) )
            // InternalArithmetic.g:1023:2: ( rule__DivisionStatement__DividendAssignment_2 )
            {
             before(grammarAccess.getDivisionStatementAccess().getDividendAssignment_2()); 
            // InternalArithmetic.g:1024:2: ( rule__DivisionStatement__DividendAssignment_2 )
            // InternalArithmetic.g:1024:3: rule__DivisionStatement__DividendAssignment_2
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
    // InternalArithmetic.g:1032:1: rule__DivisionStatement__Group__3 : rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4 ;
    public final void rule__DivisionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1036:1: ( rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4 )
            // InternalArithmetic.g:1037:2: rule__DivisionStatement__Group__3__Impl rule__DivisionStatement__Group__4
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
    // InternalArithmetic.g:1044:1: rule__DivisionStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__DivisionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1048:1: ( ( ',' ) )
            // InternalArithmetic.g:1049:1: ( ',' )
            {
            // InternalArithmetic.g:1049:1: ( ',' )
            // InternalArithmetic.g:1050:2: ','
            {
             before(grammarAccess.getDivisionStatementAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalArithmetic.g:1059:1: rule__DivisionStatement__Group__4 : rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5 ;
    public final void rule__DivisionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1063:1: ( rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5 )
            // InternalArithmetic.g:1064:2: rule__DivisionStatement__Group__4__Impl rule__DivisionStatement__Group__5
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
    // InternalArithmetic.g:1071:1: rule__DivisionStatement__Group__4__Impl : ( ( rule__DivisionStatement__DivisorAssignment_4 ) ) ;
    public final void rule__DivisionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1075:1: ( ( ( rule__DivisionStatement__DivisorAssignment_4 ) ) )
            // InternalArithmetic.g:1076:1: ( ( rule__DivisionStatement__DivisorAssignment_4 ) )
            {
            // InternalArithmetic.g:1076:1: ( ( rule__DivisionStatement__DivisorAssignment_4 ) )
            // InternalArithmetic.g:1077:2: ( rule__DivisionStatement__DivisorAssignment_4 )
            {
             before(grammarAccess.getDivisionStatementAccess().getDivisorAssignment_4()); 
            // InternalArithmetic.g:1078:2: ( rule__DivisionStatement__DivisorAssignment_4 )
            // InternalArithmetic.g:1078:3: rule__DivisionStatement__DivisorAssignment_4
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
    // InternalArithmetic.g:1086:1: rule__DivisionStatement__Group__5 : rule__DivisionStatement__Group__5__Impl ;
    public final void rule__DivisionStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1090:1: ( rule__DivisionStatement__Group__5__Impl )
            // InternalArithmetic.g:1091:2: rule__DivisionStatement__Group__5__Impl
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
    // InternalArithmetic.g:1097:1: rule__DivisionStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__DivisionStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1101:1: ( ( ')' ) )
            // InternalArithmetic.g:1102:1: ( ')' )
            {
            // InternalArithmetic.g:1102:1: ( ')' )
            // InternalArithmetic.g:1103:2: ')'
            {
             before(grammarAccess.getDivisionStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__PowerStatement__Group__0"
    // InternalArithmetic.g:1113:1: rule__PowerStatement__Group__0 : rule__PowerStatement__Group__0__Impl rule__PowerStatement__Group__1 ;
    public final void rule__PowerStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1117:1: ( rule__PowerStatement__Group__0__Impl rule__PowerStatement__Group__1 )
            // InternalArithmetic.g:1118:2: rule__PowerStatement__Group__0__Impl rule__PowerStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PowerStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__1();

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
    // $ANTLR end "rule__PowerStatement__Group__0"


    // $ANTLR start "rule__PowerStatement__Group__0__Impl"
    // InternalArithmetic.g:1125:1: rule__PowerStatement__Group__0__Impl : ( 'power' ) ;
    public final void rule__PowerStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1129:1: ( ( 'power' ) )
            // InternalArithmetic.g:1130:1: ( 'power' )
            {
            // InternalArithmetic.g:1130:1: ( 'power' )
            // InternalArithmetic.g:1131:2: 'power'
            {
             before(grammarAccess.getPowerStatementAccess().getPowerKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPowerStatementAccess().getPowerKeyword_0()); 

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
    // $ANTLR end "rule__PowerStatement__Group__0__Impl"


    // $ANTLR start "rule__PowerStatement__Group__1"
    // InternalArithmetic.g:1140:1: rule__PowerStatement__Group__1 : rule__PowerStatement__Group__1__Impl rule__PowerStatement__Group__2 ;
    public final void rule__PowerStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1144:1: ( rule__PowerStatement__Group__1__Impl rule__PowerStatement__Group__2 )
            // InternalArithmetic.g:1145:2: rule__PowerStatement__Group__1__Impl rule__PowerStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PowerStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__2();

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
    // $ANTLR end "rule__PowerStatement__Group__1"


    // $ANTLR start "rule__PowerStatement__Group__1__Impl"
    // InternalArithmetic.g:1152:1: rule__PowerStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__PowerStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1156:1: ( ( '(' ) )
            // InternalArithmetic.g:1157:1: ( '(' )
            {
            // InternalArithmetic.g:1157:1: ( '(' )
            // InternalArithmetic.g:1158:2: '('
            {
             before(grammarAccess.getPowerStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPowerStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__PowerStatement__Group__1__Impl"


    // $ANTLR start "rule__PowerStatement__Group__2"
    // InternalArithmetic.g:1167:1: rule__PowerStatement__Group__2 : rule__PowerStatement__Group__2__Impl rule__PowerStatement__Group__3 ;
    public final void rule__PowerStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1171:1: ( rule__PowerStatement__Group__2__Impl rule__PowerStatement__Group__3 )
            // InternalArithmetic.g:1172:2: rule__PowerStatement__Group__2__Impl rule__PowerStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PowerStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__3();

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
    // $ANTLR end "rule__PowerStatement__Group__2"


    // $ANTLR start "rule__PowerStatement__Group__2__Impl"
    // InternalArithmetic.g:1179:1: rule__PowerStatement__Group__2__Impl : ( ( rule__PowerStatement__BasenumberAssignment_2 ) ) ;
    public final void rule__PowerStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1183:1: ( ( ( rule__PowerStatement__BasenumberAssignment_2 ) ) )
            // InternalArithmetic.g:1184:1: ( ( rule__PowerStatement__BasenumberAssignment_2 ) )
            {
            // InternalArithmetic.g:1184:1: ( ( rule__PowerStatement__BasenumberAssignment_2 ) )
            // InternalArithmetic.g:1185:2: ( rule__PowerStatement__BasenumberAssignment_2 )
            {
             before(grammarAccess.getPowerStatementAccess().getBasenumberAssignment_2()); 
            // InternalArithmetic.g:1186:2: ( rule__PowerStatement__BasenumberAssignment_2 )
            // InternalArithmetic.g:1186:3: rule__PowerStatement__BasenumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PowerStatement__BasenumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPowerStatementAccess().getBasenumberAssignment_2()); 

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
    // $ANTLR end "rule__PowerStatement__Group__2__Impl"


    // $ANTLR start "rule__PowerStatement__Group__3"
    // InternalArithmetic.g:1194:1: rule__PowerStatement__Group__3 : rule__PowerStatement__Group__3__Impl rule__PowerStatement__Group__4 ;
    public final void rule__PowerStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1198:1: ( rule__PowerStatement__Group__3__Impl rule__PowerStatement__Group__4 )
            // InternalArithmetic.g:1199:2: rule__PowerStatement__Group__3__Impl rule__PowerStatement__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PowerStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__4();

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
    // $ANTLR end "rule__PowerStatement__Group__3"


    // $ANTLR start "rule__PowerStatement__Group__3__Impl"
    // InternalArithmetic.g:1206:1: rule__PowerStatement__Group__3__Impl : ( ',' ) ;
    public final void rule__PowerStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1210:1: ( ( ',' ) )
            // InternalArithmetic.g:1211:1: ( ',' )
            {
            // InternalArithmetic.g:1211:1: ( ',' )
            // InternalArithmetic.g:1212:2: ','
            {
             before(grammarAccess.getPowerStatementAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPowerStatementAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__PowerStatement__Group__3__Impl"


    // $ANTLR start "rule__PowerStatement__Group__4"
    // InternalArithmetic.g:1221:1: rule__PowerStatement__Group__4 : rule__PowerStatement__Group__4__Impl rule__PowerStatement__Group__5 ;
    public final void rule__PowerStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1225:1: ( rule__PowerStatement__Group__4__Impl rule__PowerStatement__Group__5 )
            // InternalArithmetic.g:1226:2: rule__PowerStatement__Group__4__Impl rule__PowerStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__PowerStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__5();

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
    // $ANTLR end "rule__PowerStatement__Group__4"


    // $ANTLR start "rule__PowerStatement__Group__4__Impl"
    // InternalArithmetic.g:1233:1: rule__PowerStatement__Group__4__Impl : ( ( rule__PowerStatement__TimesAssignment_4 ) ) ;
    public final void rule__PowerStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1237:1: ( ( ( rule__PowerStatement__TimesAssignment_4 ) ) )
            // InternalArithmetic.g:1238:1: ( ( rule__PowerStatement__TimesAssignment_4 ) )
            {
            // InternalArithmetic.g:1238:1: ( ( rule__PowerStatement__TimesAssignment_4 ) )
            // InternalArithmetic.g:1239:2: ( rule__PowerStatement__TimesAssignment_4 )
            {
             before(grammarAccess.getPowerStatementAccess().getTimesAssignment_4()); 
            // InternalArithmetic.g:1240:2: ( rule__PowerStatement__TimesAssignment_4 )
            // InternalArithmetic.g:1240:3: rule__PowerStatement__TimesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PowerStatement__TimesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPowerStatementAccess().getTimesAssignment_4()); 

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
    // $ANTLR end "rule__PowerStatement__Group__4__Impl"


    // $ANTLR start "rule__PowerStatement__Group__5"
    // InternalArithmetic.g:1248:1: rule__PowerStatement__Group__5 : rule__PowerStatement__Group__5__Impl ;
    public final void rule__PowerStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1252:1: ( rule__PowerStatement__Group__5__Impl )
            // InternalArithmetic.g:1253:2: rule__PowerStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerStatement__Group__5__Impl();

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
    // $ANTLR end "rule__PowerStatement__Group__5"


    // $ANTLR start "rule__PowerStatement__Group__5__Impl"
    // InternalArithmetic.g:1259:1: rule__PowerStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__PowerStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1263:1: ( ( ')' ) )
            // InternalArithmetic.g:1264:1: ( ')' )
            {
            // InternalArithmetic.g:1264:1: ( ')' )
            // InternalArithmetic.g:1265:2: ')'
            {
             before(grammarAccess.getPowerStatementAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPowerStatementAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__PowerStatement__Group__5__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalArithmetic.g:1275:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1279:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalArithmetic.g:1280:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
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
    // InternalArithmetic.g:1287:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1291:1: ( ( ( RULE_INT )? ) )
            // InternalArithmetic.g:1292:1: ( ( RULE_INT )? )
            {
            // InternalArithmetic.g:1292:1: ( ( RULE_INT )? )
            // InternalArithmetic.g:1293:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalArithmetic.g:1294:2: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArithmetic.g:1294:3: RULE_INT
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
    // InternalArithmetic.g:1302:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1306:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalArithmetic.g:1307:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
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
    // InternalArithmetic.g:1314:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1318:1: ( ( '.' ) )
            // InternalArithmetic.g:1319:1: ( '.' )
            {
            // InternalArithmetic.g:1319:1: ( '.' )
            // InternalArithmetic.g:1320:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalArithmetic.g:1329:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1333:1: ( rule__REAL__Group__2__Impl )
            // InternalArithmetic.g:1334:2: rule__REAL__Group__2__Impl
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
    // InternalArithmetic.g:1340:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1344:1: ( ( RULE_INT ) )
            // InternalArithmetic.g:1345:1: ( RULE_INT )
            {
            // InternalArithmetic.g:1345:1: ( RULE_INT )
            // InternalArithmetic.g:1346:2: RULE_INT
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
    // InternalArithmetic.g:1356:1: rule__ArithmeticsProgram__StatesAssignment : ( ruleStatement ) ;
    public final void rule__ArithmeticsProgram__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1360:1: ( ( ruleStatement ) )
            // InternalArithmetic.g:1361:2: ( ruleStatement )
            {
            // InternalArithmetic.g:1361:2: ( ruleStatement )
            // InternalArithmetic.g:1362:3: ruleStatement
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
    // InternalArithmetic.g:1371:1: rule__AdditionStatement__Addend1Assignment_2 : ( ruleExpression ) ;
    public final void rule__AdditionStatement__Addend1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1375:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1376:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1376:2: ( ruleExpression )
            // InternalArithmetic.g:1377:3: ruleExpression
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


    // $ANTLR start "rule__AdditionStatement__Addend2Assignment_4"
    // InternalArithmetic.g:1386:1: rule__AdditionStatement__Addend2Assignment_4 : ( ruleExpression ) ;
    public final void rule__AdditionStatement__Addend2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1390:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1391:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1391:2: ( ruleExpression )
            // InternalArithmetic.g:1392:3: ruleExpression
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
    // InternalArithmetic.g:1401:1: rule__SubtractionStatement__MinuendAssignment_2 : ( ruleExpression ) ;
    public final void rule__SubtractionStatement__MinuendAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1405:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1406:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1406:2: ( ruleExpression )
            // InternalArithmetic.g:1407:3: ruleExpression
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
    // InternalArithmetic.g:1416:1: rule__SubtractionStatement__SubtrahendAssignment_4 : ( ruleExpression ) ;
    public final void rule__SubtractionStatement__SubtrahendAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1420:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1421:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1421:2: ( ruleExpression )
            // InternalArithmetic.g:1422:3: ruleExpression
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
    // InternalArithmetic.g:1431:1: rule__MultiplicationStatement__Multiplier1Assignment_2 : ( ruleExpression ) ;
    public final void rule__MultiplicationStatement__Multiplier1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1435:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1436:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1436:2: ( ruleExpression )
            // InternalArithmetic.g:1437:3: ruleExpression
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
    // InternalArithmetic.g:1446:1: rule__MultiplicationStatement__Multiplier2Assignment_4 : ( ruleExpression ) ;
    public final void rule__MultiplicationStatement__Multiplier2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1450:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1451:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1451:2: ( ruleExpression )
            // InternalArithmetic.g:1452:3: ruleExpression
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
    // InternalArithmetic.g:1461:1: rule__DivisionStatement__DividendAssignment_2 : ( ruleExpression ) ;
    public final void rule__DivisionStatement__DividendAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1465:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1466:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1466:2: ( ruleExpression )
            // InternalArithmetic.g:1467:3: ruleExpression
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
    // InternalArithmetic.g:1476:1: rule__DivisionStatement__DivisorAssignment_4 : ( ruleExpression ) ;
    public final void rule__DivisionStatement__DivisorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1480:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1481:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1481:2: ( ruleExpression )
            // InternalArithmetic.g:1482:3: ruleExpression
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


    // $ANTLR start "rule__PowerStatement__BasenumberAssignment_2"
    // InternalArithmetic.g:1491:1: rule__PowerStatement__BasenumberAssignment_2 : ( ruleExpression ) ;
    public final void rule__PowerStatement__BasenumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1495:1: ( ( ruleExpression ) )
            // InternalArithmetic.g:1496:2: ( ruleExpression )
            {
            // InternalArithmetic.g:1496:2: ( ruleExpression )
            // InternalArithmetic.g:1497:3: ruleExpression
            {
             before(grammarAccess.getPowerStatementAccess().getBasenumberExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPowerStatementAccess().getBasenumberExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PowerStatement__BasenumberAssignment_2"


    // $ANTLR start "rule__PowerStatement__TimesAssignment_4"
    // InternalArithmetic.g:1506:1: rule__PowerStatement__TimesAssignment_4 : ( RULE_INT ) ;
    public final void rule__PowerStatement__TimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1510:1: ( ( RULE_INT ) )
            // InternalArithmetic.g:1511:2: ( RULE_INT )
            {
            // InternalArithmetic.g:1511:2: ( RULE_INT )
            // InternalArithmetic.g:1512:3: RULE_INT
            {
             before(grammarAccess.getPowerStatementAccess().getTimesINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPowerStatementAccess().getTimesINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__PowerStatement__TimesAssignment_4"


    // $ANTLR start "rule__IntLiteral__NumAssignment"
    // InternalArithmetic.g:1521:1: rule__IntLiteral__NumAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1525:1: ( ( RULE_INT ) )
            // InternalArithmetic.g:1526:2: ( RULE_INT )
            {
            // InternalArithmetic.g:1526:2: ( RULE_INT )
            // InternalArithmetic.g:1527:3: RULE_INT
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
    // InternalArithmetic.g:1536:1: rule__RealLiteral__NumAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArithmetic.g:1540:1: ( ( ruleREAL ) )
            // InternalArithmetic.g:1541:2: ( ruleREAL )
            {
            // InternalArithmetic.g:1541:2: ( ruleREAL )
            // InternalArithmetic.g:1542:3: ruleREAL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F8810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}