package graph;

import java.util.Enumeration;

public class AbstractGraph2
extends AbstractContainer implements Graph{
	protected int numberOfVertices;
	protected int numberOfEdges;
	protected List vertex;
	
	public void depthFirstTraversal(PrePostVisitor visitor, int start){
		boolean[] visited = new boolean [numberOfVertices];
		for (int v=0; v < numberOfVertices; ++v)
			visited[v] = false;
		depthFirstTraversal (visitor, vertex[start], visited);
	}
	
	private void depthFirstTraversal (PrePostVisitor visitor, Vertex v, boolean[] visited){
		if (visitor.isDone())
			return;
		visitor.preVisit(v);
		visited[v.getNumber()] = true;
		Enumeration p = v.getSuccessors();
		while(p.hasMoreElements()){
			Vertex to = (Vertex) p.nextElement();
			if (!visited [to.getNumber()])
				depthFirstTraversal (visitor, to, visited);
		}
		visitor.postVisit(v);
	}
	// ...
}
