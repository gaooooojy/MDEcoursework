package uk.ac.kcl.inf.arithmetic.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.arithmetic.services.ArithmeticGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArithmeticParser extends AbstractInternalAntlrParser {
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

        public InternalArithmeticParser(TokenStream input, ArithmeticGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArithmeticsProgram";
       	}

       	@Override
       	protected ArithmeticGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArithmeticsProgram"
    // InternalArithmetic.g:64:1: entryRuleArithmeticsProgram returns [EObject current=null] : iv_ruleArithmeticsProgram= ruleArithmeticsProgram EOF ;
    public final EObject entryRuleArithmeticsProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticsProgram = null;


        try {
            // InternalArithmetic.g:64:59: (iv_ruleArithmeticsProgram= ruleArithmeticsProgram EOF )
            // InternalArithmetic.g:65:2: iv_ruleArithmeticsProgram= ruleArithmeticsProgram EOF
            {
             newCompositeNode(grammarAccess.getArithmeticsProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticsProgram=ruleArithmeticsProgram();

            state._fsp--;

             current =iv_ruleArithmeticsProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticsProgram"


    // $ANTLR start "ruleArithmeticsProgram"
    // InternalArithmetic.g:71:1: ruleArithmeticsProgram returns [EObject current=null] : ( (lv_states_0_0= ruleStatement ) )* ;
    public final EObject ruleArithmeticsProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:77:2: ( ( (lv_states_0_0= ruleStatement ) )* )
            // InternalArithmetic.g:78:2: ( (lv_states_0_0= ruleStatement ) )*
            {
            // InternalArithmetic.g:78:2: ( (lv_states_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArithmetic.g:79:3: (lv_states_0_0= ruleStatement )
            	    {
            	    // InternalArithmetic.g:79:3: (lv_states_0_0= ruleStatement )
            	    // InternalArithmetic.g:80:4: lv_states_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getArithmeticsProgramAccess().getStatesStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_states_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getArithmeticsProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"states",
            	    					lv_states_0_0,
            	    					"uk.ac.kcl.inf.arithmetic.Arithmetic.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticsProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalArithmetic.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalArithmetic.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalArithmetic.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalArithmetic.g:107:1: ruleStatement returns [EObject current=null] : (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionStatement_0 = null;

        EObject this_SubtractionStatement_1 = null;

        EObject this_MultiplicationStatement_2 = null;

        EObject this_DivisionStatement_3 = null;

        EObject this_PowerStatement_4 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:113:2: ( (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement ) )
            // InternalArithmetic.g:114:2: (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement )
            {
            // InternalArithmetic.g:114:2: (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement )
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
                    // InternalArithmetic.g:115:3: this_AdditionStatement_0= ruleAdditionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAdditionStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdditionStatement_0=ruleAdditionStatement();

                    state._fsp--;


                    			current = this_AdditionStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:124:3: this_SubtractionStatement_1= ruleSubtractionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSubtractionStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubtractionStatement_1=ruleSubtractionStatement();

                    state._fsp--;


                    			current = this_SubtractionStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArithmetic.g:133:3: this_MultiplicationStatement_2= ruleMultiplicationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMultiplicationStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiplicationStatement_2=ruleMultiplicationStatement();

                    state._fsp--;


                    			current = this_MultiplicationStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalArithmetic.g:142:3: this_DivisionStatement_3= ruleDivisionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDivisionStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionStatement_3=ruleDivisionStatement();

                    state._fsp--;


                    			current = this_DivisionStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalArithmetic.g:151:3: this_PowerStatement_4= rulePowerStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPowerStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PowerStatement_4=rulePowerStatement();

                    state._fsp--;


                    			current = this_PowerStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalArithmetic.g:163:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalArithmetic.g:163:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalArithmetic.g:164:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalArithmetic.g:170:1: ruleExpression returns [EObject current=null] : (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement | this_NumberExpression_5= ruleNumberExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionStatement_0 = null;

        EObject this_SubtractionStatement_1 = null;

        EObject this_MultiplicationStatement_2 = null;

        EObject this_DivisionStatement_3 = null;

        EObject this_PowerStatement_4 = null;

        EObject this_NumberExpression_5 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:176:2: ( (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement | this_NumberExpression_5= ruleNumberExpression ) )
            // InternalArithmetic.g:177:2: (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement | this_NumberExpression_5= ruleNumberExpression )
            {
            // InternalArithmetic.g:177:2: (this_AdditionStatement_0= ruleAdditionStatement | this_SubtractionStatement_1= ruleSubtractionStatement | this_MultiplicationStatement_2= ruleMultiplicationStatement | this_DivisionStatement_3= ruleDivisionStatement | this_PowerStatement_4= rulePowerStatement | this_NumberExpression_5= ruleNumberExpression )
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
                    // InternalArithmetic.g:178:3: this_AdditionStatement_0= ruleAdditionStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAdditionStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdditionStatement_0=ruleAdditionStatement();

                    state._fsp--;


                    			current = this_AdditionStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:187:3: this_SubtractionStatement_1= ruleSubtractionStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSubtractionStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubtractionStatement_1=ruleSubtractionStatement();

                    state._fsp--;


                    			current = this_SubtractionStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArithmetic.g:196:3: this_MultiplicationStatement_2= ruleMultiplicationStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMultiplicationStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiplicationStatement_2=ruleMultiplicationStatement();

                    state._fsp--;


                    			current = this_MultiplicationStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalArithmetic.g:205:3: this_DivisionStatement_3= ruleDivisionStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDivisionStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionStatement_3=ruleDivisionStatement();

                    state._fsp--;


                    			current = this_DivisionStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalArithmetic.g:214:3: this_PowerStatement_4= rulePowerStatement
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPowerStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PowerStatement_4=rulePowerStatement();

                    state._fsp--;


                    			current = this_PowerStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalArithmetic.g:223:3: this_NumberExpression_5= ruleNumberExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNumberExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberExpression_5=ruleNumberExpression();

                    state._fsp--;


                    			current = this_NumberExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdditionStatement"
    // InternalArithmetic.g:235:1: entryRuleAdditionStatement returns [EObject current=null] : iv_ruleAdditionStatement= ruleAdditionStatement EOF ;
    public final EObject entryRuleAdditionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionStatement = null;


        try {
            // InternalArithmetic.g:235:58: (iv_ruleAdditionStatement= ruleAdditionStatement EOF )
            // InternalArithmetic.g:236:2: iv_ruleAdditionStatement= ruleAdditionStatement EOF
            {
             newCompositeNode(grammarAccess.getAdditionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionStatement=ruleAdditionStatement();

            state._fsp--;

             current =iv_ruleAdditionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionStatement"


    // $ANTLR start "ruleAdditionStatement"
    // InternalArithmetic.g:242:1: ruleAdditionStatement returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= '(' ( (lv_addend1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_addend2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleAdditionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_addend1_2_0 = null;

        EObject lv_addend2_4_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:248:2: ( (otherlv_0= 'add' otherlv_1= '(' ( (lv_addend1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_addend2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalArithmetic.g:249:2: (otherlv_0= 'add' otherlv_1= '(' ( (lv_addend1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_addend2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalArithmetic.g:249:2: (otherlv_0= 'add' otherlv_1= '(' ( (lv_addend1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_addend2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalArithmetic.g:250:3: otherlv_0= 'add' otherlv_1= '(' ( (lv_addend1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_addend2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdditionStatementAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalArithmetic.g:258:3: ( (lv_addend1_2_0= ruleExpression ) )
            // InternalArithmetic.g:259:4: (lv_addend1_2_0= ruleExpression )
            {
            // InternalArithmetic.g:259:4: (lv_addend1_2_0= ruleExpression )
            // InternalArithmetic.g:260:5: lv_addend1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAdditionStatementAccess().getAddend1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_addend1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionStatementRule());
            					}
            					set(
            						current,
            						"addend1",
            						lv_addend1_2_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAdditionStatementAccess().getCommaKeyword_3());
            		
            // InternalArithmetic.g:281:3: ( (lv_addend2_4_0= ruleExpression ) )
            // InternalArithmetic.g:282:4: (lv_addend2_4_0= ruleExpression )
            {
            // InternalArithmetic.g:282:4: (lv_addend2_4_0= ruleExpression )
            // InternalArithmetic.g:283:5: lv_addend2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAdditionStatementAccess().getAddend2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_addend2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionStatementRule());
            					}
            					set(
            						current,
            						"addend2",
            						lv_addend2_4_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAdditionStatementAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionStatement"


    // $ANTLR start "entryRuleSubtractionStatement"
    // InternalArithmetic.g:308:1: entryRuleSubtractionStatement returns [EObject current=null] : iv_ruleSubtractionStatement= ruleSubtractionStatement EOF ;
    public final EObject entryRuleSubtractionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractionStatement = null;


        try {
            // InternalArithmetic.g:308:61: (iv_ruleSubtractionStatement= ruleSubtractionStatement EOF )
            // InternalArithmetic.g:309:2: iv_ruleSubtractionStatement= ruleSubtractionStatement EOF
            {
             newCompositeNode(grammarAccess.getSubtractionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtractionStatement=ruleSubtractionStatement();

            state._fsp--;

             current =iv_ruleSubtractionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtractionStatement"


    // $ANTLR start "ruleSubtractionStatement"
    // InternalArithmetic.g:315:1: ruleSubtractionStatement returns [EObject current=null] : (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_minuend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_subtrahend_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubtractionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_minuend_2_0 = null;

        EObject lv_subtrahend_4_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:321:2: ( (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_minuend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_subtrahend_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalArithmetic.g:322:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_minuend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_subtrahend_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalArithmetic.g:322:2: (otherlv_0= 'subtract' otherlv_1= '(' ( (lv_minuend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_subtrahend_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalArithmetic.g:323:3: otherlv_0= 'subtract' otherlv_1= '(' ( (lv_minuend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_subtrahend_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtractionStatementAccess().getSubtractKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtractionStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalArithmetic.g:331:3: ( (lv_minuend_2_0= ruleExpression ) )
            // InternalArithmetic.g:332:4: (lv_minuend_2_0= ruleExpression )
            {
            // InternalArithmetic.g:332:4: (lv_minuend_2_0= ruleExpression )
            // InternalArithmetic.g:333:5: lv_minuend_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubtractionStatementAccess().getMinuendExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_minuend_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtractionStatementRule());
            					}
            					set(
            						current,
            						"minuend",
            						lv_minuend_2_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSubtractionStatementAccess().getCommaKeyword_3());
            		
            // InternalArithmetic.g:354:3: ( (lv_subtrahend_4_0= ruleExpression ) )
            // InternalArithmetic.g:355:4: (lv_subtrahend_4_0= ruleExpression )
            {
            // InternalArithmetic.g:355:4: (lv_subtrahend_4_0= ruleExpression )
            // InternalArithmetic.g:356:5: lv_subtrahend_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubtractionStatementAccess().getSubtrahendExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_subtrahend_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtractionStatementRule());
            					}
            					set(
            						current,
            						"subtrahend",
            						lv_subtrahend_4_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubtractionStatementAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtractionStatement"


    // $ANTLR start "entryRuleMultiplicationStatement"
    // InternalArithmetic.g:381:1: entryRuleMultiplicationStatement returns [EObject current=null] : iv_ruleMultiplicationStatement= ruleMultiplicationStatement EOF ;
    public final EObject entryRuleMultiplicationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationStatement = null;


        try {
            // InternalArithmetic.g:381:64: (iv_ruleMultiplicationStatement= ruleMultiplicationStatement EOF )
            // InternalArithmetic.g:382:2: iv_ruleMultiplicationStatement= ruleMultiplicationStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationStatement=ruleMultiplicationStatement();

            state._fsp--;

             current =iv_ruleMultiplicationStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationStatement"


    // $ANTLR start "ruleMultiplicationStatement"
    // InternalArithmetic.g:388:1: ruleMultiplicationStatement returns [EObject current=null] : (otherlv_0= 'multiply' otherlv_1= '(' ( (lv_multiplier1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_multiplier2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleMultiplicationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_multiplier1_2_0 = null;

        EObject lv_multiplier2_4_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:394:2: ( (otherlv_0= 'multiply' otherlv_1= '(' ( (lv_multiplier1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_multiplier2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalArithmetic.g:395:2: (otherlv_0= 'multiply' otherlv_1= '(' ( (lv_multiplier1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_multiplier2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalArithmetic.g:395:2: (otherlv_0= 'multiply' otherlv_1= '(' ( (lv_multiplier1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_multiplier2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalArithmetic.g:396:3: otherlv_0= 'multiply' otherlv_1= '(' ( (lv_multiplier1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_multiplier2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicationStatementAccess().getMultiplyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiplicationStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalArithmetic.g:404:3: ( (lv_multiplier1_2_0= ruleExpression ) )
            // InternalArithmetic.g:405:4: (lv_multiplier1_2_0= ruleExpression )
            {
            // InternalArithmetic.g:405:4: (lv_multiplier1_2_0= ruleExpression )
            // InternalArithmetic.g:406:5: lv_multiplier1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicationStatementAccess().getMultiplier1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_multiplier1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicationStatementRule());
            					}
            					set(
            						current,
            						"multiplier1",
            						lv_multiplier1_2_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiplicationStatementAccess().getCommaKeyword_3());
            		
            // InternalArithmetic.g:427:3: ( (lv_multiplier2_4_0= ruleExpression ) )
            // InternalArithmetic.g:428:4: (lv_multiplier2_4_0= ruleExpression )
            {
            // InternalArithmetic.g:428:4: (lv_multiplier2_4_0= ruleExpression )
            // InternalArithmetic.g:429:5: lv_multiplier2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicationStatementAccess().getMultiplier2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_multiplier2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicationStatementRule());
            					}
            					set(
            						current,
            						"multiplier2",
            						lv_multiplier2_4_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiplicationStatementAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationStatement"


    // $ANTLR start "entryRuleDivisionStatement"
    // InternalArithmetic.g:454:1: entryRuleDivisionStatement returns [EObject current=null] : iv_ruleDivisionStatement= ruleDivisionStatement EOF ;
    public final EObject entryRuleDivisionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionStatement = null;


        try {
            // InternalArithmetic.g:454:58: (iv_ruleDivisionStatement= ruleDivisionStatement EOF )
            // InternalArithmetic.g:455:2: iv_ruleDivisionStatement= ruleDivisionStatement EOF
            {
             newCompositeNode(grammarAccess.getDivisionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionStatement=ruleDivisionStatement();

            state._fsp--;

             current =iv_ruleDivisionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionStatement"


    // $ANTLR start "ruleDivisionStatement"
    // InternalArithmetic.g:461:1: ruleDivisionStatement returns [EObject current=null] : (otherlv_0= 'divide' otherlv_1= '(' ( (lv_dividend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_divisor_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleDivisionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dividend_2_0 = null;

        EObject lv_divisor_4_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:467:2: ( (otherlv_0= 'divide' otherlv_1= '(' ( (lv_dividend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_divisor_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalArithmetic.g:468:2: (otherlv_0= 'divide' otherlv_1= '(' ( (lv_dividend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_divisor_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalArithmetic.g:468:2: (otherlv_0= 'divide' otherlv_1= '(' ( (lv_dividend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_divisor_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalArithmetic.g:469:3: otherlv_0= 'divide' otherlv_1= '(' ( (lv_dividend_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_divisor_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDivisionStatementAccess().getDivideKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDivisionStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalArithmetic.g:477:3: ( (lv_dividend_2_0= ruleExpression ) )
            // InternalArithmetic.g:478:4: (lv_dividend_2_0= ruleExpression )
            {
            // InternalArithmetic.g:478:4: (lv_dividend_2_0= ruleExpression )
            // InternalArithmetic.g:479:5: lv_dividend_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDivisionStatementAccess().getDividendExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_dividend_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionStatementRule());
            					}
            					set(
            						current,
            						"dividend",
            						lv_dividend_2_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDivisionStatementAccess().getCommaKeyword_3());
            		
            // InternalArithmetic.g:500:3: ( (lv_divisor_4_0= ruleExpression ) )
            // InternalArithmetic.g:501:4: (lv_divisor_4_0= ruleExpression )
            {
            // InternalArithmetic.g:501:4: (lv_divisor_4_0= ruleExpression )
            // InternalArithmetic.g:502:5: lv_divisor_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDivisionStatementAccess().getDivisorExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_divisor_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionStatementRule());
            					}
            					set(
            						current,
            						"divisor",
            						lv_divisor_4_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDivisionStatementAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionStatement"


    // $ANTLR start "entryRulePowerStatement"
    // InternalArithmetic.g:527:1: entryRulePowerStatement returns [EObject current=null] : iv_rulePowerStatement= rulePowerStatement EOF ;
    public final EObject entryRulePowerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerStatement = null;


        try {
            // InternalArithmetic.g:527:55: (iv_rulePowerStatement= rulePowerStatement EOF )
            // InternalArithmetic.g:528:2: iv_rulePowerStatement= rulePowerStatement EOF
            {
             newCompositeNode(grammarAccess.getPowerStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerStatement=rulePowerStatement();

            state._fsp--;

             current =iv_rulePowerStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerStatement"


    // $ANTLR start "rulePowerStatement"
    // InternalArithmetic.g:534:1: rulePowerStatement returns [EObject current=null] : (otherlv_0= 'power' otherlv_1= '(' ( (lv_basenumber_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject rulePowerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_times_4_0=null;
        Token otherlv_5=null;
        EObject lv_basenumber_2_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:540:2: ( (otherlv_0= 'power' otherlv_1= '(' ( (lv_basenumber_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalArithmetic.g:541:2: (otherlv_0= 'power' otherlv_1= '(' ( (lv_basenumber_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalArithmetic.g:541:2: (otherlv_0= 'power' otherlv_1= '(' ( (lv_basenumber_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalArithmetic.g:542:3: otherlv_0= 'power' otherlv_1= '(' ( (lv_basenumber_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_times_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerStatementAccess().getPowerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPowerStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalArithmetic.g:550:3: ( (lv_basenumber_2_0= ruleNumberExpression ) )
            // InternalArithmetic.g:551:4: (lv_basenumber_2_0= ruleNumberExpression )
            {
            // InternalArithmetic.g:551:4: (lv_basenumber_2_0= ruleNumberExpression )
            // InternalArithmetic.g:552:5: lv_basenumber_2_0= ruleNumberExpression
            {

            					newCompositeNode(grammarAccess.getPowerStatementAccess().getBasenumberNumberExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_basenumber_2_0=ruleNumberExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerStatementRule());
            					}
            					set(
            						current,
            						"basenumber",
            						lv_basenumber_2_0,
            						"uk.ac.kcl.inf.arithmetic.Arithmetic.NumberExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerStatementAccess().getCommaKeyword_3());
            		
            // InternalArithmetic.g:573:3: ( (lv_times_4_0= RULE_INT ) )
            // InternalArithmetic.g:574:4: (lv_times_4_0= RULE_INT )
            {
            // InternalArithmetic.g:574:4: (lv_times_4_0= RULE_INT )
            // InternalArithmetic.g:575:5: lv_times_4_0= RULE_INT
            {
            lv_times_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_times_4_0, grammarAccess.getPowerStatementAccess().getTimesINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPowerStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"times",
            						lv_times_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerStatementAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerStatement"


    // $ANTLR start "entryRuleNumberExpression"
    // InternalArithmetic.g:599:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // InternalArithmetic.g:599:57: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // InternalArithmetic.g:600:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
             newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;

             current =iv_ruleNumberExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // InternalArithmetic.g:606:1: ruleNumberExpression returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:612:2: ( (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalArithmetic.g:613:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalArithmetic.g:613:2: (this_IntLiteral_0= ruleIntLiteral | this_RealLiteral_1= ruleRealLiteral )
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
                    // InternalArithmetic.g:614:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumberExpressionAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArithmetic.g:623:3: this_RealLiteral_1= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumberExpressionAccess().getRealLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalArithmetic.g:635:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalArithmetic.g:635:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalArithmetic.g:636:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalArithmetic.g:642:1: ruleIntLiteral returns [EObject current=null] : ( (lv_num_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;


        	enterRule();

        try {
            // InternalArithmetic.g:648:2: ( ( (lv_num_0_0= RULE_INT ) ) )
            // InternalArithmetic.g:649:2: ( (lv_num_0_0= RULE_INT ) )
            {
            // InternalArithmetic.g:649:2: ( (lv_num_0_0= RULE_INT ) )
            // InternalArithmetic.g:650:3: (lv_num_0_0= RULE_INT )
            {
            // InternalArithmetic.g:650:3: (lv_num_0_0= RULE_INT )
            // InternalArithmetic.g:651:4: lv_num_0_0= RULE_INT
            {
            lv_num_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_num_0_0, grammarAccess.getIntLiteralAccess().getNumINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"num",
            					lv_num_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalArithmetic.g:670:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalArithmetic.g:670:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalArithmetic.g:671:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalArithmetic.g:677:1: ruleRealLiteral returns [EObject current=null] : ( (lv_num_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalArithmetic.g:683:2: ( ( (lv_num_0_0= ruleREAL ) ) )
            // InternalArithmetic.g:684:2: ( (lv_num_0_0= ruleREAL ) )
            {
            // InternalArithmetic.g:684:2: ( (lv_num_0_0= ruleREAL ) )
            // InternalArithmetic.g:685:3: (lv_num_0_0= ruleREAL )
            {
            // InternalArithmetic.g:685:3: (lv_num_0_0= ruleREAL )
            // InternalArithmetic.g:686:4: lv_num_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getNumREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_num_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"num",
            					lv_num_0_0,
            					"uk.ac.kcl.inf.arithmetic.Arithmetic.REAL");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleREAL"
    // InternalArithmetic.g:706:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalArithmetic.g:708:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalArithmetic.g:709:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalArithmetic.g:718:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalArithmetic.g:725:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalArithmetic.g:726:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalArithmetic.g:726:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalArithmetic.g:727:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalArithmetic.g:727:3: (this_INT_0= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArithmetic.g:728:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F8810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}