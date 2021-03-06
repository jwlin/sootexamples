package org.domainexpert.survivor;

import java.util.List;

import soot.Unit;
import soot.jimple.Expr;
import soot.toolkits.graph.UnitGraph;

public class SimpleVeryBusyExpressions implements VeryBusyExpressions {
	private final VeryBusyExpressionAnalysis analysis;

	public SimpleVeryBusyExpressions(UnitGraph graph) {
		analysis = new VeryBusyExpressionAnalysis(graph);
	}
	
	@Override
	public List<Expr> getBusyExpressionsBefore(Unit s) {
		return analysis.getFlowBefore(s).toList();
	}

	@Override
	public List<Expr> getBusyExpressionsAfter(Unit s) {
		return analysis.getFlowAfter(s).toList();
	}

}
