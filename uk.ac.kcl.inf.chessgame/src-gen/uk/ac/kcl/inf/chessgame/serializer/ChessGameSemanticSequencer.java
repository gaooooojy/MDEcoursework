/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.chessgame.chessGame.CellDisplay;
import uk.ac.kcl.inf.chessgame.chessGame.CellExpression;
import uk.ac.kcl.inf.chessgame.chessGame.CellState;
import uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage;
import uk.ac.kcl.inf.chessgame.chessGame.ChessProgram;
import uk.ac.kcl.inf.chessgame.chessGame.EmptyExpression;
import uk.ac.kcl.inf.chessgame.chessGame.EndBehaviour;
import uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification;
import uk.ac.kcl.inf.chessgame.chessGame.GameEnd;
import uk.ac.kcl.inf.chessgame.chessGame.MouseTrigger;
import uk.ac.kcl.inf.chessgame.chessGame.StateCheck;
import uk.ac.kcl.inf.chessgame.chessGame.Transition;
import uk.ac.kcl.inf.chessgame.services.ChessGameGrammarAccess;

@SuppressWarnings("all")
public class ChessGameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ChessGameGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ChessGamePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ChessGamePackage.CELL_DISPLAY:
				sequence_CellDisplay(context, (CellDisplay) semanticObject); 
				return; 
			case ChessGamePackage.CELL_EXPRESSION:
				sequence_CellExpression(context, (CellExpression) semanticObject); 
				return; 
			case ChessGamePackage.CELL_STATE:
				sequence_CellState(context, (CellState) semanticObject); 
				return; 
			case ChessGamePackage.CHESS_PROGRAM:
				sequence_ChessProgram(context, (ChessProgram) semanticObject); 
				return; 
			case ChessGamePackage.EMPTY_EXPRESSION:
				sequence_EmptyExpression(context, (EmptyExpression) semanticObject); 
				return; 
			case ChessGamePackage.END_BEHAVIOUR:
				sequence_EndBehaviour(context, (EndBehaviour) semanticObject); 
				return; 
			case ChessGamePackage.FIELD_SPECIFICATION:
				sequence_FieldSpecification(context, (FieldSpecification) semanticObject); 
				return; 
			case ChessGamePackage.GAME_END:
				sequence_GameEnd(context, (GameEnd) semanticObject); 
				return; 
			case ChessGamePackage.MOUSE_TRIGGER:
				sequence_MouseTrigger(context, (MouseTrigger) semanticObject); 
				return; 
			case ChessGamePackage.STATE_CHECK:
				sequence_StateCheck(context, (StateCheck) semanticObject); 
				return; 
			case ChessGamePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CellDisplay returns CellDisplay
	 *
	 * Constraint:
	 *     (text=STRING | color=colorChoice)
	 */
	protected void sequence_CellDisplay(ISerializationContext context, CellDisplay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CellExpression returns CellExpression
	 *
	 * Constraint:
	 *     (state=StateCheck cellState=EmptyExpression)
	 */
	protected void sequence_CellExpression(ISerializationContext context, CellExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.CELL_EXPRESSION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.CELL_EXPRESSION__STATE));
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.CELL_EXPRESSION__CELL_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.CELL_EXPRESSION__CELL_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellExpressionAccess().getStateStateCheckParserRuleCall_0_0(), semanticObject.getState());
		feeder.accept(grammarAccess.getCellExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0(), semanticObject.getCellState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns CellState
	 *     CellState returns CellState
	 *
	 * Constraint:
	 *     (name=ID display=CellDisplay transitions+=Transition*)
	 */
	protected void sequence_CellState(ISerializationContext context, CellState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChessProgram returns ChessProgram
	 *
	 * Constraint:
	 *     states+=Statements+
	 */
	protected void sequence_ChessProgram(ISerializationContext context, ChessProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EmptyExpression returns EmptyExpression
	 *
	 * Constraint:
	 *     {EmptyExpression}
	 */
	protected void sequence_EmptyExpression(ISerializationContext context, EmptyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EndBehaviour returns EndBehaviour
	 *
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_EndBehaviour(ISerializationContext context, EndBehaviour semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.END_BEHAVIOUR__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.END_BEHAVIOUR__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns FieldSpecification
	 *     FieldSpecification returns FieldSpecification
	 *
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_FieldSpecification(ISerializationContext context, FieldSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.FIELD_SPECIFICATION__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.FIELD_SPECIFICATION__WIDTH));
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.FIELD_SPECIFICATION__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.FIELD_SPECIFICATION__HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_4_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_7_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns GameEnd
	 *     GameEnd returns GameEnd
	 *
	 * Constraint:
	 *     (name=ID action=CellExpression behaviour=EndBehaviour)
	 */
	protected void sequence_GameEnd(ISerializationContext context, GameEnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.GAME_END__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.GAME_END__NAME));
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.GAME_END__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.GAME_END__ACTION));
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.GAME_END__BEHAVIOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.GAME_END__BEHAVIOUR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGameEndAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGameEndAccess().getActionCellExpressionParserRuleCall_4_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getGameEndAccess().getBehaviourEndBehaviourParserRuleCall_6_0(), semanticObject.getBehaviour());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MouseTrigger returns MouseTrigger
	 *
	 * Constraint:
	 *     mouse?='mouse-left'?
	 */
	protected void sequence_MouseTrigger(ISerializationContext context, MouseTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateCheck returns StateCheck
	 *
	 * Constraint:
	 *     cell_state=[CellState|ID]
	 */
	protected void sequence_StateCheck(ISerializationContext context, StateCheck semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.STATE_CHECK__CELL_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.STATE_CHECK__CELL_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateCheckAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1(), semanticObject.eGet(ChessGamePackage.Literals.STATE_CHECK__CELL_STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (trigger=MouseTrigger target=[CellState|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.TRANSITION__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.TRANSITION__TRIGGER));
			if (transientValues.isValueTransient(semanticObject, ChessGamePackage.Literals.TRANSITION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessGamePackage.Literals.TRANSITION__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getTriggerMouseTriggerParserRuleCall_1_0(), semanticObject.getTrigger());
		feeder.accept(grammarAccess.getTransitionAccess().getTargetCellStateIDTerminalRuleCall_4_0_1(), semanticObject.eGet(ChessGamePackage.Literals.TRANSITION__TARGET, false));
		feeder.finish();
	}
	
	
}