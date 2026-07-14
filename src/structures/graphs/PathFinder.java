package structures.graphs;

// Interface => 
// -No contiene logica interna
// -Define los metodos
// -No se puede instanciar

public interface PathFinder<T> {

    PathResult<T> findPath(Graph<T> graph,T start,T end);
    
}
